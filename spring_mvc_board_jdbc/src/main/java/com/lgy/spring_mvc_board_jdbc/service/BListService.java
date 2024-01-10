package com.lgy.spring_mvc_board_jdbc.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.lgy.spring_mvc_board_jdbc.dao.BDao;
import com.lgy.spring_mvc_board_jdbc.dto.BDto;



public class BListService implements BService {

	@Override
	public void execute(Model model) {

		// dao단 호출
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
//		model에 받아온 list인 dtos를 넣어 컨트롤러단으로 전송
		model.addAttribute("list",dtos);
	
		
	}

}
