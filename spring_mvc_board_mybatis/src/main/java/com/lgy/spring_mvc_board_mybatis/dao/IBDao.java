package com.lgy.spring_mvc_board_mybatis.dao;

import java.util.ArrayList;

import com.lgy.spring_mvc_board_mybatis.dto.BDto;

// mybatis를 사용하기위해 Dao 인터페이스를 선언한다. 클래스로 구현할 필요없이
// 구현은 mapper.xml 파일에서 자동으로 구현해서 실행해준다.
public interface IBDao {

	public ArrayList<BDto> list();
	public void write(String bname,String btitle,String bcontent);
	public BDto contentView(String strID);
	public void modify(String bid,String bname,String btitle,String bcontent);
	public void delete(String bid);
//	public void upHit(String bid) 생략
	
}
