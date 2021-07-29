package sub1;

public class ObjectTest {
	public static void main(String[] args) {
		
		/*Object 클래스 : 자바의 최상위 클래스, 자바의 모든
		*클래스는 object 클래스를 상속받음
		*/ 
		
		Apple a = new Apple("한국",3000);
		Banana b = new Banana("대만",59159);
		
		a.toString();
		b.toString();
	}
}
