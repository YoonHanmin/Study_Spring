package com.lgy.spring_mvc_board_jdbc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_mvc_board_jdbc.service.BContentService;
import com.lgy.spring_mvc_board_jdbc.service.BDeleteService;
import com.lgy.spring_mvc_board_jdbc.service.BListService;
import com.lgy.spring_mvc_board_jdbc.service.BModifyService;
import com.lgy.spring_mvc_board_jdbc.service.BService;
import com.lgy.spring_mvc_board_jdbc.service.BWriteService;
import com.lgy.spring_mvc_board_jdbc.util.Constant;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
	BService service;
	public JdbcTemplate template;
	
//	servlet-context.xml에 있는 template 객체를 저장(this.template)
	
	@Autowired
	public void setTemplate(JdbcTemplate template) { // 파라미터의 template : 빈 객체에 등록한 객체
		this.template = template;
//		Constant.template를 dao에서 사용 (다른 클래스에 의존성을 직접 주입했음)
		Constant.template = this.template;
	}
	
//	BCommand command;
//	게시판 목록 조회
	@RequestMapping("/list")
	public String list(Model model) {
		
		log.info("@# list ==> ");
//		service 호출
		service = new BListService();
		service.execute(model);
		return "list";
	}
	
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request,Model model) {
//	request : view에서 넘어오는 값(name,title,content값이 들어있음)
		log.info("@# write ==>");
		model.addAttribute("request",request);
		service = new BWriteService();
//		model에 request를 담고있음.
		service.execute(model);
		
		return "redirect:list";
	}
	@RequestMapping("write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping("/contentView")
	public String contentView(HttpServletRequest request,Model model) {
		log.info("@# content_view");
//		서비스 단에서 "request" key값으로 map을 받기때문에 request로 설정 해줘야함
		model.addAttribute("request", request);
		
		service = new BContentService();
		service.execute(model);
		return "content_view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request,Model model) {
//		request : view에서 넘어오는 값(name,title,content값이 들어있음)
			log.info("@# modify ==>");
			model.addAttribute("request",request);
			service = new BModifyService(); 

			service.execute(model);
			
			return "redirect:list";
		}
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
//		request : view에서 넘어오는 값(name,title,content값이 들어있음)
		log.info("@# delete ==>");
		model.addAttribute("request",request);
		service = new BDeleteService(); 
		
		service.execute(model);
		
		return "redirect:list";
	}
}
