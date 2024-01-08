package com.lgy.spring_15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_15.dao.Dao;
import com.lgy.spring_15.dao.MemberDAO;
import com.lgy.spring_15.domain.MemberDTO;
import com.lgy.spring_15.domain.MemberVO;
import com.lgy.spring_15.domain.SampleVO;
import com.lgy.spring_15.domain.TicketVO;
import com.lgy.spring_15.service.MemberService;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

//@Controller
@RestController
@RequestMapping("/sample")
@Slf4j
public class SampleController {
//	private MemberDAO memberDAO;
	private MemberService memberService;
	
	@Autowired
	public SampleController(MemberService memberService) {
		this.memberService = memberService;
	}

//
//	@Autowired(required = false)
//public SampleController(MemberDAO memberDAO) {
//		
//		this.memberDAO = memberDAO;
//	}


//	기존의 @Controller는 getSample.jsp를 찾아가므로 return에 객체를 받을수없음.
//	@RestController는 객체를 받아서 xml 파일로 변환시켜 웹 페이지에 그대로 뿌려줌 (view를 거치지않는다.)
	@GetMapping(value="/getSample",produces = {MediaType.APPLICATION_JSON_VALUE})
	public SampleVO getSample() {
		return new SampleVO(112, "스타", "로드");
		
	}
	
	
	@GetMapping("/getList")
	public List<SampleVO> getList(){
//		스트림,람다식은 프로젝트 설정에서 java compiler 1.8로 변경
//		IntStream.range(1,10): 1부터 10까지 Integer를 출력하는데, mapToObj메소드를 통해
//		i 증가하며 객체를 만들고, 리스트에 담는다.	
		return IntStream.range(1,10).mapToObj(i->new SampleVO(i,i+"First",i+"Last"))
				.collect(Collectors.toList());
	}
	
	@GetMapping("/getMap")
//	Map 객체를 받아서, 리턴함
	public Map<String,SampleVO>getMap(){
		Map<String,SampleVO> map = new HashMap<String,SampleVO>();
		map.put("First", new SampleVO(111,"그루트","주니어"));

		return map;
	}
	
	
	@GetMapping(value="/check",params= {"height","weight"})
//	ResponseEntity : 단순히 데이터뿐아니라, HTTP 상태코드등 추가데이터 전달 가능
	public ResponseEntity<SampleVO> check(Double height,Double weight) {
		SampleVO vo=new SampleVO(0,""+height,""+weight);
		ResponseEntity<SampleVO> result = null;
		
		if(height<150) {
//			HttpStatus.BAD_GATEWAY : http 오류 상태
//GET http://localhost:8181/spring_15/sample/check?height=140&weight=40 502 (Bad Gateway)
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		}else {
//			HttpStatus.OK : http 정상 상태(200)
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		return result;
	}
	
	
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat")String cat,@PathVariable("pid")int pid) {
		return new String[] {"category : "+cat,"product id: "+pid};
	}
	
	
	@PostMapping("/ticket")
//	RequestBody를 통해 클라이언트에서 비동기방식으로 Json형식으로 전송된 데이터를 VO객체에 담는다.
	public TicketVO convert(@RequestBody TicketVO ticketVO) {
		log.info("@# 컨트롤러에서나온 로그 ==>"+ticketVO);
		log.debug("@# ticketVO2 ==>"+ticketVO);
		
		return ticketVO;
	}
	
	@PostMapping("/info")
	public MemberVO convert(@RequestBody MemberVO vo) {
		log.debug("@#==>"+vo);
		return vo;
		
	}

//	@GetMapping("/find")
//	public ResponseEntity<MemberDTO> find(String name) {
//	    MemberDTO member = memberDAO.findByName(name);
//	    if (member == null) {
//	        return ResponseEntity.notFound().build();
//	    }
//
//	    log.info(member.getAge());
//	    log.info(member.getId());
//	    return ResponseEntity.ok(member);
//	}
//	
//	@PostMapping("/join")
//	public String join(@RequestBody MemberDTO member) {
//		log.info(member.getId());
//		log.info(member.getName());
//		log.info(member.getAge());
//		
//		memberDAO.join(member);
//		return "home";
//	}
//	
	@GetMapping("/search")
	public MemberDTO findByName(@RequestParam("name") String name) {
		MemberDTO member = memberService.findByName(name);
		return member;
		
	}
	
	@GetMapping("/all")
	public List<MemberDTO> findAll(){
		List<MemberDTO> list = memberService.findAll();

		return list;
	}
	
}
