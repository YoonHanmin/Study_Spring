package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {
	public static void main(String[] args)throws Exception {
//		Reader : 문자 단위 입력을 위한 최상위 스트림 클래스
//		FileReader : 문자 단위 입력을 위한 하위 스트림 클래스
		
		Reader reader = new FileReader("d:\\text.txt");
		int readData;
		char[] cduf = new char[2];
		String data="";
		
		while(true) {
//			readData = reader.read();// 한개의 문자 단위로 읽는다.
			readData = reader.read(cduf); // 배열길이 2개씩 읽는다. 
			if(readData ==-1) {
				break;
			}
			 String string = new String(cduf,0,readData);
//			System.out.print((char)readData);
			System.out.print(string);
		}
		reader.close();
		
	}
}
