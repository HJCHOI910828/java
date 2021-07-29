package test02;

import java.util.Scanner;

/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 함수 연습문제
 */
public class JavaTest6 {
	public static void main(String[] args) {
		intro();
		
		int a = input("a");
		int b = input("b");
		
		int output = add(a, b);
		result(output);
	}
	
	public static void intro() {
		System.out.println("****** START ******");
		System.out.println("두 개의 정수 입력");
	}
	public static int input(String name) {
		System.out.println("변수" +name+"값 입력 : ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}
	
	public static void result(int val) {
		System.out.println("덧셈 결과: "+val);
		System.out.println("****** END ******");
	}
	public static int add(int x, int y) {
		return x+y;
	}
}
