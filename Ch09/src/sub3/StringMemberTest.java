package sub3;

public class StringMemberTest {
	public static void main(String[] args) {
		
		String str = "Hello Korea";
		//length - 문자 갯수
		System.out.println("length of str: "+str.length());
		//charAt - 특정 문자 추출
		System.out.println("1st char of str: "+str.charAt(0));
		System.out.println("7rd char of str: "+str.charAt(7));
		//substring
		System.out.println("0~5 char of str: "+str.substring(0,5));
		System.out.println("6~end char of str: "+str.substring(6));
		//indexOf,lastIndexOf - 특정문자 인덱스 추출
		System.out.println("e까지 앞 인덱스"+str.indexOf("e"));
		System.out.println("e까지 뒤 인덱스"+str.lastIndexOf("e"));
		//replace - 문자열 교체
		System.out.println("str 문자열에서 'Korea'문자를 'Busan'으로 교체:"+
				str.replace("Korea","Busan"));
		System.out.println("str 문자열에서 'Korea'문자를 'Busan'으로 교체:"+
				str.replace("Hello","Welcome"));
		//valueOf - 기본타입 변수를 문자열로 변환
		int var1 = 1;
		double var2 = 2.13;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = String.valueOf(var2);
		String s3 = ""+var3;
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		System.out.println("s3 : "+s3);
		
	}
}
