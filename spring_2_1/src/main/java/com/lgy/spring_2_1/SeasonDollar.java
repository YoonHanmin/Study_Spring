package com.lgy.spring_2_1;

public class SeasonDollar {
	public static void main(String[] args) {
		Season season = new Season();
		season.setMonth(9);
		won2dollar won = new won2dollar();
		won.setWon(3300);
		
		season.find();
		won.exchange();
		
	}
}
