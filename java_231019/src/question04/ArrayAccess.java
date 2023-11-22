package question04;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ArrayAccess {
	public static void main(String[] args) {
		int max = 0;
		int[] result = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
		for (int i = 0; i < result.length; i++) {
			result[i] = scan.nextInt();
		}
		for (int i = 0; i < result.length; i++) {
			if(max<result[i]) {
				max = result[i];
			}
		} 		
			
		System.out.println("가장 큰 수는 "+ max+"입니다");
		}
	}

