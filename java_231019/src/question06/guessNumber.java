package question06;

import java.util.Random;
import java.util.Scanner;


public class guessNumber {
public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in); 

	
	 int number=0;
	int guess =0;
	
	Random random = new Random();
	number = random.nextInt(10)+1; 
	
	System.out.print("추측한 숫자를 입력하세요: ");
	guess =scanner.nextInt();
	while(true) {
	    if(guess>number) {
	    	System.out.println("추측한 숫자가 너무 큽니다.");
	    	System.out.print("추측한 숫자를 입력하세요: ");
	    	guess =scanner.nextInt();
	    }else if(guess<number) {
	    	System.out.println("추측한 숫자가 너무 작습니다.");
	    	System.out.print("추측한 숫자를 입력하세요: ");
	    	guess =scanner.nextInt();
	    }else if(guess==number){
	    	System.out.println("맞추셨습니다.");
	    	break;
	    }
	}
	
	
}

}