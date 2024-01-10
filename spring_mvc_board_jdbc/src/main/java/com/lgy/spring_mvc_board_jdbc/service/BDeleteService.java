package com.lgy.spring_mvc_board_jdbc.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_mvc_board_jdbc.dao.BDao;

public class BDeleteService implements BService {
	
	@Override
	public void execute(Model model) {
		Map<String,Object> map = model.asMap();
//		request : 컨트롤러단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bid = request.getParameter("bid");
	
		BDao dao = new BDao();
		dao.delete(bid);

	}

}