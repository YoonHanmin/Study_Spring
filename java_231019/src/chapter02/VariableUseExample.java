package chapter02;

import java.util.Scanner;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour=3;
		int minute=5;
		String time = hour + "시간" + minute;
		System.out.println(hour+"시간"+minute+"분");
		int total = hour*60+minute;
		System.out.println(total);
	}
}
