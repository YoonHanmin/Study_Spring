package com.lgy.spring_9_1;

public class Singer {
	private String name;
	private String song;
	private int member;
	
	public void getSinger() {
		System.out.println(getName());
		System.out.println(getSong());
		System.out.println(getMember());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	
	
	
	
}
