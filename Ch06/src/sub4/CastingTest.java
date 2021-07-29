package sub4;

import sub3.Animal;
import sub3.Eagle;
import sub3.Shark;
import sub3.Tiger;

public class CastingTest {
	public static void main(String[] args) {
		
		int n1 = 1;
		double n2 = n1;
		int n3 = (int)n2;
		
		System.out.println("n : "+n1);
		System.out.println("n : "+n2);
		System.out.println("n : "+n3);
		
		Animal a1 = new Tiger();
		Animal a2 = new Eagle();
		Animal a3 = new Shark();
		
		Tiger tiger = (Tiger) a1;
		Eagle eagle = (Eagle) a2;
		Shark shark = (Shark) a3;
		
		if(a1 instanceof Tiger) {
			System.out.println("a1 is Tiger");
		}else if(a1 instanceof Eagle) {
			System.out.println("a1 is Eagle");
		}else if(a1 instanceof Shark) {
			System.out.println("a1 is Shark");
		}
	}
}
