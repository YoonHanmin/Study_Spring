package com.lgy.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgy.mybatis.userDao.UserDao;
import com.lgy.mybatis.userDto.User;


@Service
public class UserService {
	
	private UserDao userDao;
	
	@Autowired
	public UserService(UserDao userDao) {
	
		this.userDao = userDao;
	}
	
	public User findByUserNum(int userNum) {
		return userDao.findByUserNum(userNum);
	}
	
	public int findByName(String name) {
		return userDao.findByName(name);
	}
	
	
}
