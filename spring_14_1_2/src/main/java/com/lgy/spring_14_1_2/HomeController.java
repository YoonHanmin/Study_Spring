package com.lgy.spring_14_1_2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "index";
	}
	
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	
	@RequestMapping("/studentView")
//	파라미터에 클래스이름이랑 똑같은 명으로 지으면
//	뷰에서 넘어오는 값들을 클래스 객체로 한번에 받을수있음 
//	public String studentView(StudentInfomation studentInfomation) {
//	이름이 너무길때 @ModelAttribute를 통해 파라미터 객체명 변경 가능
		public String studentView(@ModelAttribute("stuInfo")StudentInfomation studentInfomation) {
		return "studentView";
		
	}
	
	@RequestMapping(value="/student",method=RequestMethod.GET)
	public String goStudent(HttpServletRequest httpServletRequest,Model model) {
		System.out.println("!@#$% RequestMethod.GET");
		String id = httpServletRequest.getParameter("id");
		model.addAttribute("studentId",id);
		return "student/studentId";
		
	}
	@RequestMapping(value="/student",method=RequestMethod.POST)
	public ModelAndView goStudent(HttpServletRequest httpServletRequest) {
//		오버로딩 하기위해서 ModelAndView 사용
		System.out.println("!@#$% RequestMethod.POST");
		String id = httpServletRequest.getParameter("id");
		ModelAndView mv=new ModelAndView();
		mv.addObject("studentId", id);
		mv.setViewName("student/studentId");
		return mv;
		
	}
	
}
