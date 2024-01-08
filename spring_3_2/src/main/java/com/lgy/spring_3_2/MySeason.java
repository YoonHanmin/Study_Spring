package com.lgy.spring_3_2;

public class MySeason {
	private Season season;
	private int month;
	
	public void result() {
		season.rsSeason(month);
	}
	
	
	public Season getSeason() {
		return season;
	}
	public void setSeason(Season season) {
		this.season = season;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
}
