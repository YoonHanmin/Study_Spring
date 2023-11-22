package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {
	public static void main(String[] args)throws Exception {
		
		// FileoutputStream output.txt를 가지고 객체를 생성한다.
		OutputStream os = new FileOutputStream("d:\\output.txt");
		// 바이트 단위로 문자열을 읽는다.
		byte[] data = "DEF".getBytes();
			os.write(data);
			
			os.write(data,1,2); // EF : 인덱스 1(E)에서 2글자
			
			
			
//		for (int i = 0; i < data.length; i++) {
//			// FileOutputStream 객체에 바이트 배열 원소를 넣어 write 메소드를 통해서 output.txt파일에 넣는다(출력한다)
//			os.write(data[i]);
//		}
	}
}

