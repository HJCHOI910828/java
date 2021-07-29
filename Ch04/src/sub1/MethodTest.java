package sub1;

public class MethodTest {
	public static void main(String[] args) {
	//main Method : Java Program Start
		int x=231, y=919304;
		int res = f(x,y);
		System.out.println(res);
		
		int res2 = sum(1,100);
		System.out.println(res2);
	}
	
	//Method define
	public static int f(int x, int y) {
		int res = x*y;
		return res;
		
		
		
	}
	public static int sum(int start, int end) {
		
		int sum = 0;
		
		for (int k = start; k <= end; k++) {
			sum += k;
		}
		return sum;
	}
}
