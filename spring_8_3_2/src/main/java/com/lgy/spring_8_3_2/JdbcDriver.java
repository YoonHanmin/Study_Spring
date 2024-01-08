package com.lgy.spring_8_3_2;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class JdbcDriver implements EnvironmentAware,InitializingBean {
	private Environment env;
	private String oracle;
	private String mysql;
	
	
	@Override
	public void setEnvironment(Environment environment) {
		setEnv(environment);
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		setOracle(env.getProperty("oracle"));
		setMysql(env.getProperty("mysql"));
	}
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getOracle() {
		return oracle;
	}
	public void setOracle(String oracle) {
		this.oracle = oracle;
	}
	public String getMysql() {
		return mysql;
	}
	public void setMysql(String mysql) {
		this.mysql = mysql;
	}

	

}
