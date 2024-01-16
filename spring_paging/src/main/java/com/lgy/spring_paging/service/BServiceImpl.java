package com.lgy.spring_paging.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.spring_paging.dao.IBDao;
import com.lgy.spring_paging.dto.BDto;
import com.lgy.spring_paging.dto.Criteria;

import lombok.extern.slf4j.Slf4j;

@Service("BService")
@Slf4j
public class BServiceImpl implements BService{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<BDto> list() {
		IBDao dao = sqlSession.getMapper(IBDao.class);
		
		ArrayList<BDto> list = dao.list();
		
		return list;
	}
	@Override
	public ArrayList<BDto> list(Criteria cri) {
		log.info("@# BServiceImpl.list(Criteria)start ");
		IBDao dao = sqlSession.getMapper(IBDao.class);
		
		
		return dao.listWithPaging(cri);
	}
	
	

	@Override
	public void write(HashMap<String, String> param) {
		IBDao dao = sqlSession.getMapper(IBDao.class);
		dao.write(param);
	}

	@Override
	public BDto contentView(HashMap<String, String> param) {
		IBDao dao = sqlSession.getMapper(IBDao.class);
		BDto dto = dao.contentView(param);
		
		return dto;
	}

	@Override
	public void modify(HashMap<String, String> param) {
		IBDao dao = sqlSession.getMapper(IBDao.class);
		dao.modify(param);
		
	}

	@Override
	public void delete(HashMap<String, String> param) {
		IBDao dao = sqlSession.getMapper(IBDao.class);
		dao.delete(param);
		
	}

}
