package sub3;
/*
 * 다형성(Polymorphism)
 * - 상속관계에 있는 부모클래스의 구체적인 기능을 자식클래그 다시 재정의.,
 * - 부모클래스 타입으로 객체 선언.
 * - 다형성을 이용해 프로그래밍 코드의 유연성을 높임.
 */
public class PolyTest {
public static void main(String[] args) {
	
	Animal tiger = new Tiger();
	Eagle eagle = new Eagle();
	Shark shark = new Shark();
	
	tiger.move();
	eagle.move();
	shark.move();
	
	tiger.hunt();
	eagle.hunt();
	shark.hunt();
	
	Animal t = new Tiger();
	Eagle e = new Eagle();
	Shark s = new Shark();
	
	Animal objects[]= {t,e,s};
	
	for(Animal obj : objects) {
		obj.move();
		obj.hunt();
	}
	
}
}
