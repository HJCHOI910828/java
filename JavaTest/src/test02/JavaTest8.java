package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 팩토리얼 출력하기 
 */
public class JavaTest8 {
	public static void main(String[] args) {
		int rs1 = fac(3);
		int rs2 = fac(4);
		long rs3 = fac(30);
		
		System.out.println("3! = "+rs1);
		System.out.println("4! = "+rs2);
		System.out.println("55! = "+rs3);
	}
	
	public static int fac(int n) {
		if(n <=1 )
			return 1;
		
		return n * fac(n-1);
	}
}
