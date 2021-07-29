package sub1;



public class MethodScopeTest {
		//전역변수(멤버변수) : 메서드 외부에 선언한 변수
		static int result = 0;
		
	public static void main(String[] args) {
		// 지역변수 : 메서드 내부에서 선언한 변수, 
		//메서드가 종료되면 메모리에서 해제
		
		int start = 1;
		int end = 10;
		
		int result = sum(start,end);
		System.out.println(result);
	}//main end
	
	public static int sum(int s, int e) {
		int sum = 0;
		
		for(int k = s; k <= e; k++) { 
			sum+=k;
		}
		return sum;
	}
}
