package com.lgy.spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lgy.spring_mvc.service.Service;

@Controller
public class controller {

		private Service service;
		
	@Autowired
	 public controller(Service service) {
		
			this.service = service;
		}


	@RequestMapping("/a")
	    public String showForm() {
	        return "ajax";
	    }
	
	
}
