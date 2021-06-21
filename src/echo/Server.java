package echo;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	//fields
	
	//constructors
	
	//method g/s
	
	//method
	
	public static void main(String[]args)throws IOException {
		
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.5", 10001)); //ip포트번호
		
		System.out.println("서버시작");
		System.out.println("=========================================");
		System.out.println("연결을 기다리고 있습니다.");
		
		//반복구간
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("[클라이언트가 연결되었습니다.]");
			
			//출장 --> 세팅 + 메세지 주고받기
			Thread thread = new ServerThread(socket);
			thread.start();
			
			//탈출조건 --> 서버는 계속 돌아야함 (생략)
			
		}
		
		/*
		System.out.println("======================================");
		System.out.println("<서버 종료>");
		
		//br.close(); socket.close()에 포함되는듯?
		//bw.close();
		socket.close();
		serverSocket.close();
		*/
	}
	
}
