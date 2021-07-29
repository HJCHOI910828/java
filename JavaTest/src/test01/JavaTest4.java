package test01;
/*
 * 
 * 날짜 : 2021/05/220
 * 이름 : 장경준	
 * 내용 : 자바 연산자 연습문제
 */
public class JavaTest4 {
	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int z = 0; 
		
		z = x+y;
		System.out.println("x + y = "+z);
		
		z = x-y;
		System.out.println("x - y = "+z);
		
		z = x*y;
		System.out.println("x * y = "+z);
		
		z = x/y;
		System.out.println("x / y = "+z);
		
		z = (x+y) * (x-y);
		System.out.println("(x+y) * (x-y) = " +z);
		
		z= (x*y) + (x/y);
		System.out.println("(x*y) + (x/y) = "+z);
	}
}
