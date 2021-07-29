package sub5;

public class MathTest {
	public static void main(String[] args) {
		
		System.out.println("PI : "+Math.PI);
		System.out.println("절대값: " + Math.abs(-5));
		System.out.println("절대값: " + Math.abs(-3.14));
		System.out.println("제곱근: " + Math.sqrt(667));
		System.out.println("올림값: " + Math.ceil(1.2));
		System.out.println("올림값: " + Math.ceil(1.7));
		System.out.println("내림값: " + Math.floor(1.2));
		System.out.println("내림값: " + Math.floor(1.7));
		System.out.println("반올림: " + Math.round(1.2));
		System.out.println("반올림: " + Math.round(1.7));
		
		double n1 = Math.random();
		System.out.println("n1 : "+n1);
		
		double n2 = n1 * 10;
		System.out.println("n2 : "+n2);
		
		double n3 = Math.ceil(n2);
		System.out.println("n3 : "+n3);
		
		double n = Math.ceil(Math.random() *10);
		System.out.println("1~45 Random Int:"+n);
	}
}
