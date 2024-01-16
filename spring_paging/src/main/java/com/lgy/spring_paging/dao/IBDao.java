package com.lgy.spring_paging.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.lgy.spring_paging.dto.BDto;
import com.lgy.spring_paging.dto.Criteria;

// mybatis를 사용하기위해 Dao 인터페이스를 선언한다. 클래스로 구현할 필요없이
// 구현은 mapper.xml 파일에서 자동으로 구현해서 실행해준다.
public interface IBDao {
//	Criteria 객체를 이용해서 페이징 처리
	public ArrayList<BDto> listWithPaging(Criteria cri);
	public ArrayList<BDto> list();
	public void write(HashMap<String, String>param);
	public BDto contentView(HashMap<String, String>param);
	public void modify(HashMap<String, String>param);
	public void delete(HashMap<String, String>param);
//	public void upHit(String bid) 생략
	
}
