package test;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		PaPaGo ppg=new PaPaGo();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("번역할 문장을 입력하세요");
		String data=sc.next();
		
		
		System.out.println("번역 결과:"+ppg.testPaPaGo(data));
	}
}
