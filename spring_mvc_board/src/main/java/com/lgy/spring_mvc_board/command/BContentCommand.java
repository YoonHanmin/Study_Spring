package com.lgy.spring_mvc_board.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.lgy.spring_mvc_board.dao.BDao;
import com.lgy.spring_mvc_board.dto.BDto;

public class BContentCommand implements BCommand{

	@Override
	public void execute(Model model) { //컨트롤러로부터 넘겨받는 model(request가 들어있음)
//		Dao에 있는 bname,btitle,bcontent 값들이 필요
//		map형태로 바꾼 model 객체에서 꺼내서 전송
		Map<String,Object> map = model.asMap();
//		request : 컨트롤러단에서 보내주는 이름
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bid = request.getParameter("bid");
		
		BDao dao = new BDao();
//		게시글 하나의 내용을 BDto 객체로 받음(bid(글번호)를 넘겨서 select 쿼리 처리)
		BDto dto = dao.contentView(bid);
//		DB처리후 받아온 데이터를 model에 넣음
//		dto 객체를 모델에 추가(뷰에서 꺼내서 쓸수있음)
		model.addAttribute("content_view",dto);
		
		
	}

}
