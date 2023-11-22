package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket socket = null; //클라이언트 소켓 선언
		
		BufferedReader in = null; //입력:클라이언트에서 들어오는 데이터
		BufferedWriter out = null; //출력:서버에서 보내는 데이터
		Scanner scan = new Scanner(System.in);
		
		try {
//			서버 ip와 포트를 가지고 소켓객체 생성
//			소켓 객체로 데이터 주고받음
			socket = new Socket("localhost", 8853);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		while (true) {
				System.out.print("보내기>> ");
				String outputMsg = scan.nextLine(); //클라이언트에서 보내는 메시지
				
				if (outputMsg.equals("bye")) { //클라이언트의 메시지가 bye일때
					out.write(outputMsg+"\n"); //서버로 메시지 보내기
					out.flush(); //비정상적 종료일때 메시지 재전송
					break;
				}
				out.write(outputMsg+"\n"); //서버로 메시지 보내기
				out.flush(); //비정상적 종료일때 메시지 재전송
				String inputMsg = in.readLine(); //한 행의 문자열을 읽음
				System.out.println("서버: "+inputMsg); //서버에서 온 메시지
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				자원 반납(예외발생까지 고려):보통 늦게 만든 객체 순으로 닫음(반대)
				scan.close();
				socket.close();
			} catch (Exception e2) { //서버와 클라이언트 간에 입출력시 예외 발생
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}

}






















