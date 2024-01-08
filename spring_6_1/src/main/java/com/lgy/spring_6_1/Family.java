package com.lgy.spring_6_1;

public class Family {
	private String papaName;
	private String mamaName;
	private String ststerName;
	private String brotherName;
	
	public Family(String papaName, String mamaName) {
		this.papaName = papaName;
		this.mamaName = mamaName;
	}
	
	public String getPapaName() {
		return papaName;
	}
	public void setPapaName(String papaName) {
		this.papaName = papaName;
	}
	public String getMamaName() {
		return mamaName;
	}
	public void setMamaName(String mamaName) {
		this.mamaName = mamaName;
	}
	public String getStsterName() {
		return ststerName;
	}
	public void setStsterName(String ststerName) {
		this.ststerName = ststerName;
	}
	public String getBrotherName() {
		return brotherName;
	}
	public void setBrotherName(String brotherName) {
		this.brotherName = brotherName;
	}
}
