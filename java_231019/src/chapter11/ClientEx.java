package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in =null; //입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null; // 출력 : 서버에서 클라이언트로 보내는 데이터
		Scanner scanner = new Scanner(System.in); // 서버에서 클라이언트로 데이터를 출력하는 상황을 위해 스캐너 객체 사용
	
	try {
//		접속할 ip와 포트로 클라이언트 소켓 객체 생성
		socket = new Socket("localhost", 9996);
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		서버에서 보내는 데이터
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		while(true) {
			System.out.println("보내기>>");
//			클라이언트에서 보내는 메시지
			String outputMessage = scanner.nextLine();
			if(outputMessage.equals("bye")) { // 
				out.write(outputMessage+"\n"); //'bye'라도 메시지는 보내야함. 서버로 메시지 보내기
				out.flush();
				break;
			}
			out.write(outputMessage+"\n"); //'bye'아니면 서버로 메시지 보내기
			out.flush();
			String inputMessage = in.readLine(); //한 행의 문자열을 읽는다.
			System.out.println("서버 : "+inputMessage); //서버에서 온 메시지
		}
	
	}catch (Exception e) {
		e.printStackTrace();
	
	
	
	}
	finally {
		try {
			//자원반납
			scanner.close();
			socket.close();
		} catch (Exception e2) {
			// TODO: handle exception
		}


}
}
}
