package sub5;

public class AbstractTest {
	public static void main(String[] args) {
		
		Unit m = new Marin();
		Unit z = new Zealot();
		Unit g = new Zergling();
		
		m.move();
		z.move();
		g.move();
		
		m.attack();
		z.attack();
		g.attack();
	}
}
