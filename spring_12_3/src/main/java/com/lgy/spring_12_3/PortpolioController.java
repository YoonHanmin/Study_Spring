package com.lgy.spring_12_3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/portpolio")
public class PortpolioController {

	
	@RequestMapping("/airbnb")
	public String Aribnb(Model model) {
		model.addAttribute("title","숙소예약");
		return "airbnb";
	}
	@RequestMapping("/university")
	public String University(Model model) {
		model.addAttribute("title","학사관리");
		return "university";
	}
	@RequestMapping("/bookManager")
	public String book(Model model) {
		model.addAttribute("title","도서관리");
		return "book";
	}
	
}
