package sub1;

public class ExceptionTest {
	public static void main(String[] args) {
		
		int n1 = 1;
		int n2 = 0;
		
		int r1=0,r2=0,r3=0,r4 =0 ;
		try {
			r1 = n1 + n2;
			r2 = n1 - n2;
			r3 = n1 * n2;
			r4 = n1/n2;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
		
		
		System.out.println("r1 : "+r1);
		System.out.println("r2 : "+r2);
		System.out.println("r3 : "+r3);
		System.out.println("r4 : "+r4);
		
		System.out.println("Program Exit...");
	}
}
