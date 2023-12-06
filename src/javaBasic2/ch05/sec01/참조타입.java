package javaBasic2.ch05.sec01;

import java.util.Scanner;

public class 참조타입 {

	public static void main(String[] args) {
		
		int n=10;
		
		Scanner sc = new Scanner(System.in); //new 힙 메모리에 Scanner 클래스를 올려주세요.
		
		//힙 메모리에 주소를 스택공간에 변수에 저장해야한다
		
		System.out.println(n);
		
		//변수형식  자료형 변수명;
		//st = new Student();
		
		//Teacher class 를 사용하려면 힙 메모리에 올려주어야 한다.

		//person class를 만들고
		Person person  = new Person();
		
		//guide 클래스 생성
		Guide guide = new Guide();
	}

}
