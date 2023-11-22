package chapter09;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;

	public class ReadExample {
	
		public static void main(String[] args) throws IOException {
//			InputStream : 바이트 단위 입력을 위한 최상위 스트링 클래스
//			FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
//			File을 꺼내서 내부를 읽는 FileInputStream을 upcasting
			InputStream is = new FileInputStream("D:\\text.txt");
			int readByte;
			byte[] readBytes = new byte[3];
			String data="";
			while(true){
				readByte = is.read(readBytes); // 3byte 단위로 읽는다(정수로 받음)
			if(readByte == -1) {
				break;
			}
//			System.out.print((char)readByte); // 3byte 단위로 읽으니 유니코드 문자 3개로 잘려서 인코딩 오류 발생.
//			System.out.println(readByte); 
//			readBytes 를 0인덱스에서 readByte 길이만금 읽는다.
			data += new String(readBytes, 0, readByte);
			System.out.println(data); 
			
			}
			is.close();
				
			}

	}
