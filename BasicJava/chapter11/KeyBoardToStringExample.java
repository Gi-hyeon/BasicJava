package chapter11;

import java.io.IOException;

public class KeyBoardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
//		String(byte[] bytes, int offset, int length)형태로
//	    length 매개값으로 배열 길이에서 2를 빼준 이유는 캐리지리턴(\r) + 라인피드(\n) 제거
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}
}
