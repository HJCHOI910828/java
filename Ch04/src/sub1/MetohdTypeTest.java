package sub1;

public class MetohdTypeTest {
	public static void main(String[] args) {
		
		double r1 = type1(1.0);
		double r2 = type1(1.2);
		double r3 = type1(1.3);
		
		System.out.println("r1 :"+r1);
		System.out.println("r2 :"+r2);
		System.out.println("r3 :"+r3);
		
		type2(true);
		
		boolean result = type3();
		System.out.println("type3() 리턴값 :"+result);
		
		type4();
	}//main end
	
	// type1 : 매개변수 0, 리턴값 0;
	public static double type1(double x) {
		double y = x + 3.14;
		return y;
	}
	// type1 : 매개변수 0, 리턴값 X;
	public static void type2(boolean status) {
		if(status) {
			System.out.println("참입니다");
		}else {
			System.out.println("거짓입니다");
		}
	}
	
	// type1 : 매개변수 X, 리턴값 0;
	public static boolean type3() {
		
		int num1 = 1, num2 = 2;
		
		if (num1 > num2) {
			return true;		
		} else {
			return false;
		}
		
	}	
	// type1 : 매개변수 X, 리턴값 X;
	public static void type4() {
	System.out.println("type4() 결과:"+type1(0.1));
}

	
}
