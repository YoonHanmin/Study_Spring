package Exam;

import java.util.Scanner;
/*
 * 기본 로직 : 가위 =0,바위=1,보=2로  컴퓨터는 random으로 자동할당하여
 *  0,1,2의 조건비교를 통한 조건문을 작성하여 상황에 맞는 결과 출력.
 */
public class Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		사용자 입력 스트링 str과 0,1,2로 바꾼 정수형 user 변수
//		컴퓨터는 cptStr과 0,1,2중 랜덤값인 정수형 cpt 변수
		String str = "";
		String cptStr = "";
		int user = 0;
		int cpt = 0; 
//		"그만"이라고 입력할 때까지 무한루프
		while(true) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		System.out.print("가위 바위 보!>>");
		str = scan.next();
//		"그만"입력시 break를 통해 종료
		if(str.equals("그만")) { System.out.println("게임을 종료합니다..."); break; } else {
//		컴퓨터 0,1,2중 랜덤으로 할당하여 cptStr과 매칭	
		cpt = (int) (Math.random()*3);		
		if(cpt==0) {
			cptStr="가위";
		}else if (cpt==1) {cptStr="바위"; } 
		else {cptStr="보";}
		
//		사용자도 같은 방식으로 0,1,2 할당
		switch(str) {
		case "가위" : user = 0; break;  
		case "바위" :  user = 1;break;  
		case "보" :  user =2;break;  
		}
		
//		사용자 == 컴퓨터일때 : 비겼을경우 
		if(user==cpt) {
			System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 비겼습니다.");
//      사용자,컴퓨터 모두 2(보)가 아닐경우에는 단순 대소비교를 통해 승패 조건 결정가능 			
		}else if(user!=2&&cpt!=2) {
			if(user>cpt) {
				System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 사용자가 이겼습니다.");
			}else {System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 컴퓨터가 이겼습니다."); }
//		사용자 또는 컴퓨터가 2(보)일때에는, 대소비교가 아닌 두 수의 차를 이용하여 승패 추론
//		user-cpt가 음수이면, 사용자는 0(가위),1(바위)이며 컴퓨터는 2(보)이기에 사용자가 0(가위)일경우 사용자 승리 	
		}else if(user-cpt<0) {
				if(user==0) {	System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 사용자가 이겼습니다.");
			}else {System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 컴퓨터가 이겼습니다."); 
			}
//		user-cpt가 양수이면, 사용자는 2(보)이며 컴퓨터는 0또는1이기에 컴퓨터가 0(바위)일경우 컴퓨터 승리 		
		}
		else if(cpt==0){
			System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 컴퓨터가 이겼습니다.");
		}else{	System.out.println("사용자는 = "+str+", 컴퓨터 = "+cptStr+", 사용자가 이겼습니다.");
		}
		
		}
	}
}
}

