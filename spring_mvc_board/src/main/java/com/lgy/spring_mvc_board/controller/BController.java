package com.lgy.spring_mvc_board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgy.spring_mvc_board.command.BCommand;
import com.lgy.spring_mvc_board.command.BContentCommand;
import com.lgy.spring_mvc_board.command.BListCommand;
import com.lgy.spring_mvc_board.command.BWriteCommand;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BController {
	BCommand command;
//	게시판 목록 조회
	@RequestMapping("/list")
	public String list(Model model) {
		log.info("@# list ==> ");
//		service 호출
//		BCommand의 다형성을 통해 업캐스팅
		command = new BListCommand();
		command.execute(model);
		return "list";
	}
	
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request,Model model) {
//	request : view에서 넘어오는 값(name,title,content값이 들어있음)
		log.info("@# write ==>");
		model.addAttribute("request",request);
		command = new BWriteCommand();
//		model에 request를 담고있음.
		command.execute(model);
		
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
		
		command = new BContentCommand();
		command.execute(model);
		return "content_view";
	}
	
}
