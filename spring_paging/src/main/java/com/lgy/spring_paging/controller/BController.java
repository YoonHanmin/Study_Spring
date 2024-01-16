package com.lgy.spring_paging.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.spring_paging.dao.IBDao;
import com.lgy.spring_paging.dto.BDto;
import com.lgy.spring_paging.dto.Criteria;
import com.lgy.spring_paging.dto.PageDTO;
import com.lgy.spring_paging.service.BService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
//	servlet-context에 있는 sqlSesion 객체 연결(의존성 주입)
//	@Autowired
//	private SqlSession sqlSession;
	@Autowired
	private BService service;
	
	

	@RequestMapping("/list_old")
	public String list(Model model) {
		
		log.info("@# list ==> ");
//		getMapper :IBDao 인터페이스를 직접 구현하지않아도  Mapper.xml을 통해 실제메소드처럼 구현해줌!!
//		IBDao dao = sqlSession.getMapper(IBDao.class);
//		서비스단에서 처리했던것을 컨트롤러단에서 처리
		ArrayList<BDto> list = service.list();
		model.addAttribute("list", list);
		
		return "list";
	}
	
	@RequestMapping("/list")
	public String list(Criteria cri,Model model) {
		
		log.info("@# list ==> ");

//		ArrayList<BDto> list = service.list();
//		model.addAttribute("list", list);
		model.addAttribute("list", service.list(cri));
		model.addAttribute("pageMaker", new PageDTO(123,cri));
		
		return "list";
	}
	
	
	@RequestMapping("/write")
	public String write(@RequestParam HashMap<String, String> param) {

		log.info("@# write ==>");
//		model.addAttribute("request",request);
//		IBDao dao = sqlSession.getMapper(IBDao.class);
//		서비스에서 처리하던것을 컨트롤러단에서 바로 처리
//		dao.write(
//				request.getParameter("bname"), request.getParameter("btitle"), 
//				request.getParameter("bcontent"));
		service.write(param);
		
		return "redirect:list";
	}
	@RequestMapping("write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping("/contentView")
	public String contentView(@RequestParam HashMap<String, String> param,Model model) {
		log.info("@# content_view");

//		model.addAttribute("request", request);
		BDto dto = service.contentView(param);
		model.addAttribute("content_view", dto);
		
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(@RequestParam HashMap<String, String> param) {

			log.info("@# modify ==>");
//			model.addAttribute("request",request);
			service.modify(param);

			return "redirect:list";
		}
	@RequestMapping("/delete")
	public String delete(@RequestParam HashMap<String, String> param) {

		log.info("@# delete ==>");
		service.delete(param);
		
		return "redirect:list";
	}
	


	
}
