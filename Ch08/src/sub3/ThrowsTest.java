package sub3;

public class ThrowsTest {
	public static void main(String[] args) {
		
		Calc c = Calc.getInstance();
		int r1=0,r2=0,r3=0;
		try {
			r1 =c.div(1, 2);
			r1 =c.div(1, 0);
			r1 =c.div(1, -1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("r1: "+r1);
		System.out.println("r2: "+r2);
		System.out.println("r3: "+r3);
		
	}
}
