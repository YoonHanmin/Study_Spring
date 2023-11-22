package package1;

public class ExceptionEx {
	
	public static void dataLength(String data) {
		
			try{ int result = data.length();	/* 예외가 발생할수 있는 코드, 
	String 파라미터의 문자열 수를 int로 받는데,
	null값을 받게 되면 NullpointerException이 발생한다	.
 */							
				System.out.println("문자수:"+ result);  
				}
			
			catch(NullPointerException e) {		// NullpointerException이 발생할 경우 (= catch) 어떻게 처리할것인가?
				e.printStackTrace();
				}
			
			finally {					// 예외가 발생하든, 안하든, 마지막으로 실행되는 코드
					System.out.println("예외후 마무리실행");
					}
			}
	
	
public static void main(String[] args) {
			System.out.println("시작\n");
			dataLength("This");
			dataLength(null);
			System.out.println("종료");
			}
}
