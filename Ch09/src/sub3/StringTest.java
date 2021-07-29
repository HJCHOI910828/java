package sub3;

public class StringTest {
	public static void main(String[] args) {
		String str = "Hello";
		char[] arr = {'H','e','l','l','o'};
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = "Hello";
		
		
		//문자열 비교
		if (str1 == str2) {
			System.out.printf("참");	
		} else {
			System.out.printf("거짓\n");
		}
			
		if (str3 == str4) {
			System.out.println("str3과 str4의 참조값이 같다");
		} else {
			System.out.println("str3과 str4의 참조값이 다르다");
		}
		
		if (str.equals(str4)) {
			System.out.println("str1과 str4의 문자열값 서로 같다");
		} else {
			System.out.println("str1과 str4의 문자열값 서로 다르다");
		}
	}
}
