package com.lgy.spring_mvc_board_mybatis.controller;

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

import com.lgy.spring_mvc_board_mybatis.dao.AjaxDao;
import com.lgy.spring_mvc_board_mybatis.dao.IBDao;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
//	servlet-context에 있는 sqlSesion 객체 연결(의존성 주입)
	@Autowired
	private SqlSession sqlSession;
	
	
	

	@RequestMapping("/list")
	public String list(Model model) {
		
		log.info("@# list ==> ");
//		getMapper :IBDao 인터페이스를 직접 구현하지않아도  Mapper.xml을 통해 실제메소드처럼 구현해줌!!
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		서비스단에서 처리했던것을 컨트롤러단에서 처리
		model.addAttribute("list",dao.list());
		
		return "list";
	}
	
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request) {

		log.info("@# write ==>");
//		model.addAttribute("request",request);
		IBDao dao = sqlSession.getMapper(IBDao.class);
//		서비스에서 처리하던것을 컨트롤러단에서 바로 처리
		dao.write(
				request.getParameter("bname"), request.getParameter("btitle"), 
				request.getParameter("bcontent"));
		
		return "redirect:list";
	}
	@RequestMapping("write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping("/contentView")
	public String contentView(HttpServletRequest request,Model model) {
		log.info("@# content_view");

//		model.addAttribute("request", request);
		IBDao dao = sqlSession.getMapper(IBDao.class);
		model.addAttribute("content_view", dao.contentView(request.getParameter("bid")));
		
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request,Model model) {

			log.info("@# modify ==>");
//			model.addAttribute("request",request);
			IBDao dao = sqlSession.getMapper(IBDao.class);
			dao.modify(request.getParameter("bid"), request.getParameter("bname")
					, request.getParameter("btitle"), request.getParameter("bcontent"));
			
			
			return "redirect:list";
		}
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {

		log.info("@# delete ==>");
		IBDao dao = sqlSession.getMapper(IBDao.class);
		dao.delete(request.getParameter("bid"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/ajax")
	public String ajax() {
		return "ajax";
	}
	
	@RequestMapping("/ajax/find")
	public ResponseEntity<String> find(@RequestParam String name) {
		AjaxDao dao = sqlSession.getMapper(AjaxDao.class);
		int rs = dao.find(name);
		if(rs==1) {
		return new ResponseEntity<String>("exists",HttpStatus.OK);
		}else 
			return new ResponseEntity<String>("No exists",HttpStatus.OK);
			
	}
	
	
}
