package com.lgy.spring_8_1;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements InitializingBean,EnvironmentAware{
//	Environment : 시스템 설정 값들을 저장하기위한 환경 객체 선언
	private Environment env;
	private String adminId;
	private String adminPw;
	
//	1번 : 빈 객체 생성전 호출되므로 가장먼저 실행해서 외부 environment 설정 해야함
	@Override
	public void setEnvironment(Environment environment) {
		System.out.println("@# setEnvironment");
//		환경객체를 env 객체에 저장
		setEnv(environment);
	}

	
//	2번 : 빈 객체 생성할때 호출
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("@# afterPropertiesSet");
//		admin.properties에서 admin.id,pw를 가져와서 adminId에 저장
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}


	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public Environment getEnv() {
		return env;
	}
	
	
	public void setEnv(Environment env) {
		this.env = env;
	}
}
