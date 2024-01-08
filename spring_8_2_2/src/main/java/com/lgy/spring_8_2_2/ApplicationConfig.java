package com.lgy.spring_8_2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {
	
//  2번 admin.properties 외부파일의 admin.id 값을 setter로 저장
	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;

	@Value("${sub_admin.id}")
	private String sub_adminId;

	@Value("${sub_admin.pw}")
	private String sub_adminPw;

	
	
//	context:property-placeholder와 동일(외부파일 설정) 1번 : 외부파일에서 property값을 가져옴
//	메소드형태로 Bean 객체를 생성하는 어노테이션
	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//		객체 배열 형태로 2개의 객체를 담은 인터페이스 객체 생성
		Resource[] locations =  new Resource[2];
//		ClassPathResource 클래스로 외부파일 설정
		locations[0] = new ClassPathResource("admin.properties");
		locations[1] = new ClassPathResource("sub_admin.properties");
//		setLocations 메소드 매개변수값으로 Resource 인터페이스에 있는 외부파일 정보를 사용
		configurer.setLocations(locations);
		return configurer;
	}
	
//	3번 : 외부파일에서 가져온 값(1번)들을 config클래스에 저장한뒤(2번) adminConnection 객체에 다시 setter 저장(3번)
	@Bean
	public AdminConnection adminConnection() {
	AdminConnection adminConnection = new AdminConnection();	
	adminConnection.setAdminId(adminId);
	adminConnection.setAdminPw(adminPw);
	adminConnection.setSub_adminId(sub_adminId);
	adminConnection.setSub_adminPw(sub_adminPw);
	
	return adminConnection;
	}
	
}
