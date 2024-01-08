package com.lgy.spring_15.dao;




import java.util.List;

import com.lgy.spring_15.domain.MemberDTO;


public interface Dao {
	
	
	public MemberDTO findByName(String name);
	
	public List<MemberDTO> findAll();
	
}
