package test01;
/*
 * 
 * 날짜 : 2021/05/220
 * 이름 : 홍길동
 * 내용 : 자바 삼항연산자 연습문제
 */
public class JavaTest7 {
	public static void main(String[] args) {
		int x = 12;
		int y = 21;
		
		int max = x > y ? x : y;
		
		System.out.println("x와 y중 큰 수 : "+max);
	}
}
