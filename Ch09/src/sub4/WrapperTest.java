package sub4;

public class WrapperTest {
	public static void main(String[] args) {
		
		//기본타입 (primitive)
		
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		char var4 = 'A';
		
		//Wrapper Class Boxing
		Integer w1 = var1;
		Double w2 = var2;
		Boolean w3 = var3;
		Character w4 = var4;
		
		System.out.println("w1 : "+w1);
		System.out.println("w2 : "+w2);
		System.out.println("w3 : "+w3);
		System.out.println("w4 : "+w4);
		
		//wrapper 활용 : 문자열 -> 기본타입
		String str1 = "1";
		String str2 = "2.13";
		String str3 = "true";
		
		int val1 = Integer.parseInt(str1);
		double val2 = Double.parseDouble(str2);
		boolean val3 = Boolean.parseBoolean(str3);
		//wrapper 활용 : 문자열 -> wrapper
		
		Integer wr1 = Integer.valueOf(str1);
		Double wr2 = Double.valueOf(str2);
		Boolean wr3 = Boolean.valueOf(str3);
		//wrapper 활용 : wrapper -> 문자열
		
		String s1= wr1.toString();
		String s2= wr2.toString();
		String s3= wr3.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
