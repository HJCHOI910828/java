package test01;
/*
 * 
 * 날짜 : 2021/05/220
 * 이름 : 홍길동
 * 내용 : 자바 피라미드 연습문제
 */
public class JavaTest8 {
	public static void main(String[] args) {
		int n = 6;
		
		for(int i = 0; i < n; i++) {
			for(int j = n - 1;j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
