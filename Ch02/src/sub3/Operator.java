package sub3;

public class Operator {	
	public static void main(String[] args) {
		// 산술연산자
		int n1=1, n2 = 2, n3 = 3, n4 = 4;
		
		int rs1 = n1 + n2;
		int rs2 = n1 - n2;
		int rs3 = n1 * n2;
		int rs4 = n1 / n2;
		int rs5 = n1 % n2;
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		System.out.println("rs3 : " + rs3);
		System.out.println("rs4 : " + rs4);
		System.out.println("rs5 : " + n1%n2 + "입니다.");
		//증감 연산자
		
		n1++;
		++n1;
		
		n2--;
		--n2;
		
		System.out.println("n1 : "+ n1);
		System.out.println("n2 : "+ n2);
		//복합대입 연산자
		int var1 = 1;
		int var2 = 2;
		int var3 = 3;
		int var4 = 4;
		
		var1 += 1;
		var2 -= 2;
		var3 *= 3;
		var4 /= 4;

		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
		System.out.println("var4 : " + var4);
		//비교 연산자
		int val1 = 1;
		int val2 = 2;
		
		boolean res1 = val1 > val2;
		boolean res2 = val1 < val2;
		boolean res3 = val1 >= val2;
		boolean res4 = val1 <= val2;
		boolean res5 = val1 == val2;
		boolean res6 = val1 != val2;
		
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		System.out.println("res4 : " + res4);
		System.out.println("res5 : " + res5);
		System.out.println("res6 : " + res6);
		//논리 연산자
	}
}
