package sub2;

public class ExeceptionsTest {
	public static void main(String[] args) {
		
		// 배열 인덱스 참조 에러
		int arr[] = new int[3];
		
		for (int i = 0; i <= 3; i++) {
			try {
				arr[i] = i+1;
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			for (int arrs:arr) {
				System.out.println(arrs);
			}
			
		}
		// NullPointer Exception
		try {
			Tiger tiger = null;
			
			tiger.move();
			tiger.hunt();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Casting
		Animal a1 = new Eagle();
		Animal a2 = new Shark();
		
		Eagle eagle = (Eagle)a1;
		Shark shark = (Shark) a1;
		
	}
}
