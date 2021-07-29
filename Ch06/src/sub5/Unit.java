package sub5;
//추상클래스 : 1개이상 추상메서드를 갖는 클래스. 객체 생성 불가
/*
 
 */
public abstract class Unit {
	
	public void move() {
		System.out.println("유닛 움직임");
	}
	public abstract void attack();
}
