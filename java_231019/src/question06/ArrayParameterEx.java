package question06;

import java.util.Scanner;

public class ArrayParameterEx {
	
	public static void printStringArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static String[] replaceBe(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("be")){
				arr[i]="eat";
			}
		}
		return arr;
	}
	 
		
	
	public static void main(String[] args) {
		
		
		String[] arr = {"to","be","or","not","to","be"};
		printStringArray(arr);
		System.out.println();
		replaceBe(arr);
		printStringArray(arr);
		
	}
}
