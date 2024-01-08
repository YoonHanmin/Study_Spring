package com.lgy.spring_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lgy.spring_15.domain.UserVO;

@RestController
public class UserController {
	private Map<String,UserVO> userMap;
	
//	객체 생성후 호출(초기값 설정을 위한 메소드)
	@PostConstruct
	public void init() {
		userMap = new HashMap<String,UserVO>();
		userMap.put("1",new UserVO("1", "leeGwanHee", "111-1111", "Seoul"));
		userMap.put("2",new UserVO("2", "YoonHaBin", "222-2222", "Busan"));
		userMap.put("3",new UserVO("3", "KinJinSeok", "333-3333", "Daegu"));
	}
//	Select
	@GetMapping("/user/{id}")
	public UserVO getUser(@PathVariable("id") String id) {
		return userMap.get(id);
		
	}
	
	@GetMapping("/user/all")
	public List<UserVO> getUser(){
		return new ArrayList<UserVO>(userMap.values());
	}
//	Insert
	@PostMapping("/user/{id}")
	public void postUser(@PathVariable("id")String id
			,@RequestParam("name")String name,@RequestParam("phone")String phone,
			@RequestParam("address")String address) {
//		UserVO userVO=new UserVO();
//		userVO.setId(id);
//		userVO.setName(name);
//		userVO.setPhone(phone);
//		userVO.setAddress(address);
		UserVO userVO = new UserVO(id,name,phone,address);
		userMap.put(id,userVO);
	}
//	Update : Map은 key값의 중복을 허용하지않기때문에 새로 생성하면 중복값 바뀜
	@PutMapping("/user/{id}")
	public void putUser(@PathVariable("id")String id
			,@RequestParam("name")String name,@RequestParam("phone")String phone,
			@RequestParam("address")String address) {
		UserVO userVO = new UserVO(id,name,phone,address);
		userMap.put(id,userVO);
	}
	
	@DeleteMapping("/user/{id}")
	public UserVO deleteUser(@PathVariable("id")String id) {
		return userMap.remove(id);
	}
	
	
}
