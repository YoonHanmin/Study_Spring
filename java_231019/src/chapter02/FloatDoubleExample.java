package chapter02;

public class FloatDoubleExample {
			public static void main(String[] args) {
				//float var1 = 3.14;
				// 오류 : 실수는 기본이 double
				float var1 = 3.14F;
				double var2 = 3.14;
				float var3 = 0.01234567890F;
				float var4 = 0.012345678901234567890f;
				// float의 한계값 012345678다음 반올림하여 출력.
				double var5 = 0.12345678901234567890;
				double var6 = 0.123456789012345678901234567890;
				double var7 = 3e6;
				double var8 = 3e6f;
				float var9 = 2e-3f;
				double var10 = 2e-3;
				
				
				System.out.println("var1 :"+ var1);
				System.out.println("var2 :"+ var2);
				System.out.println("var3 :"+ var3);
				System.out.println("var4 :"+ var4);
				System.out.println("var5 :"+ var5);
				System.out.println("var9 :"+ var9);
				System.out.println("var10 :"+ var10);
			
			
			
			
			
			}
}
