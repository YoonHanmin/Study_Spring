package chapter09;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample1 {
	public static void main(String[] args) throws IOException {
//		InputStream : 바이트 단위 입력을 위한 최상위 스트링 클래스
//		FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
//		File을 꺼내서 내부를 읽는 FileInputStream을 upcasting
		InputStream is = new FileInputStream("D:\\text.txt");
		int readByte;
		while((readByte= is.read())!=-1) {
			System.out.print((char)readByte);
			
		}
		
		
		
//		while(true) {
//			readByte=is.read(); //byte 단위로 읽어서 정수로 받음.
//			// 파일의 끝에는 -1이 존재(프로그래밍 언어 규칙) EOF (end of file)
//			if(readByte== -1) {
//				break;
//			}
//			System.out.print((char)readByte);
//		}
		is.close();
	}
	
}
