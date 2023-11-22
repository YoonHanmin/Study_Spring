package question06;

import chapter06.EqualsEx;



public class MyPoint {
	int x,y;
	public MyPoint(int x ,int y) {
		this.x = x;
		this.y = y;
		
	}
	@Override
	public String toString() {
		return "point("+ x + ","+ y +")";
	}
	
	public static void main(String[] args) {
	
//		System.out.println(p); 
//		if(p.equals(q)) {
//			System.out.println("같은 점");
//		}else {
//			System.out.println("다른 점");
//		}
	}
}
