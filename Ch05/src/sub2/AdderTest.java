package sub2;

public class AdderTest {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		
		Adder a = new Adder(100);
		
		a.add(100);
		System.out.println("°´Ã¼ aÀÇ ¸â¹öº¯¼ö x : "+a.getX());
		
		a.add(a);
		System.out.println("°´Ã¼ aÀÇ ¸â¹öº¯¼ö x : "+a.getX());
		
		a.add(arr);
		System.out.println("¹è¿­ arrÀÇ 1¹øÂ° ¿ø¼Ò :" +arr[0]);
		
		a=a.addNew(a);
		System.out.println("°´Ã¼ aÀÇ ¸â¹öº¯¼ö :"+a.getX());
	}
}
