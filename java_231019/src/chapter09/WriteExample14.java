package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	public static void main(String[] args)throws Exception {
		Writer writer =new FileWriter("D:\\output.txt");
//		문자열을 문자 하나씩 배열로 가져온다 .
//		char[] data="홍길동2".toCharArray();
		String data = "안녕 자바 프로그램";
//		writer.write(data,1,2); // 길동 : 홍길동2에서 인덱스 1~2를 읽어 파일로 저장.
		writer.write(data,3,2); // 인덱스 3에서 2글자를 읽어서 파일로 저장
		writer.close();
}
}
