package chapter02;

public class EscapeExample {
		public static void main(String[] args) {
			/* \t : 탭만큼 띄움
			 * \n : 줄바꿈
			 */
			
			System.out.print("번호\t이름\t직업\n");
			System.out.print("번호\t이름\t직업\n");
			System.out.print("번호\t이름\t직업");
			System.out.print("우리는 \"개발자\"입니다.");
			System.out.print("봄\\여름\\가을\\겨울");
		}
}
