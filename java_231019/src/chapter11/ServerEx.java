package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 서버쪽 클래스 
public class ServerEx {
	public static void main(String[] args) {
		ServerSocket listener = null; // 서버 소켓 선언
		Socket socket = null; //클라이언트 소켓 선언
		BufferedReader in =null; //입력 : 클라이언트에서 들어오는 데이터
		BufferedWriter out = null; // 출력 : 서버에서 클라이언트로 보내는 데이터
		Scanner scanner = new Scanner(System.in); // 서버에서 클라이언트로 데이터를 출력하는 상황을 위해 스캐너 객체 사용
		
		try {
			listener = new ServerSocket(9996); // 9999번 포트에 서버소켓 객체 생성
			System.out.println("연결을 기다리고 있습니다..");
			socket = listener.accept(); // accept 메소드를 통해 클라이언트가 접속하기를 기다다가, 접속하는 socket 객체로 데이터를 주고받는다.
//			클라이언트에서 들어오는 데이터를 받기위해 inputstream을 이용한 하나의 방식
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
//			계속해서 메세지를 주고받기위해 while반복
			while(true) {
				String inputMessage = in.readLine(); // 한 행(\n)의 문자열을 읽는 BufferedReader 메소드
				if(inputMessage.equals("bye")) { // 클라이언트의 메시지가 bye 일때,접속 종료
					System.out.println("클라이언트에서 bye를 입력하여 연결을 종료하였음.");
					break;
				}
				System.out.println("클라이언트 : "+inputMessage);
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine(); // 서버에서 클라이언트에게 보내는 메시지 입력
				out.write(outputMessage+"\n"); // 클라이언트로 메시지 보내기
				out.flush(); // 비정상적인 종료일때 메시지 재전송(남은 버퍼 전부다 내보내는 메소드)
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally { // 접속 종료시 자원 반납 ++객체 반납은 주로 만든순서 반대로 반납함.
			try {
				scanner.close(); 
				socket.close();
				listener.close();
			} catch (Exception e2) { // 서버와 클라이언트 간 입출력시 예외 발생
				System.out.println("클라이언트와 채팅중 오류가 발생했습니다.");
			}
		}
	}
}
