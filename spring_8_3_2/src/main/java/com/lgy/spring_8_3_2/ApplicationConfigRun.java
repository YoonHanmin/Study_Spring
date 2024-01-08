package com.lgy.spring_8_3_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run") // Profile 찾아오기위한 name 설정
public class ApplicationConfigRun {

	@Bean
	public ServerInfo serverInfo() {
		ServerInfo info = new ServerInfo();
		info.setIpNum("213.186.229.29");
		info.setPortNum("80");
		return info;
		
	}
	
	
}
