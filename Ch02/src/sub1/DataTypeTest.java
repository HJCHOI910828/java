package sub1;

public class DataTypeTest {
public static void main(String[] args) {
	// 한줄 복사: Ctrl + Alt + 방향키 아래
	// 한줄 삭제 : Ctrl + d
	
	//정수형
	int num1 = 127515;
	byte num2 = 122;
	long num3 = 127124124;
	short num4 = 1000;
	
	System.out.println("num1 : " + num1);
	System.out.println("num2 : " + num2);
	System.out.println("num3 : " + num3);
	System.out.println("num4 : " + num4);

	//실수형
	float var1 = 1.123456789f; //소수점 7자리까지
	double var2 = 1.232323232323232323; // 소수점 16자리까지
	System.out.println("var1 : "+ var1);
	System.out.println("var2 : "+ var2);

	//논리형
	boolean value1 = true;
	boolean value2 = false;
	System.out.println("value1 : "+value1);
	System.out.println("value2 : "+value2);

	//문자형
	char ch1 ='A';
	char ch2 = '가';
	System.out.println("ch1 : "+ch1);
	System.out.println("ch2 : "+ch2);

	//문자열
	
	String str1 = "Apple";
	System.out.println("str1:"+str1 );
}
}
