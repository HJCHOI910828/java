package sub2;

import sub1.Apple;

public class ClassTest {
	public static void main(String[] args) {
		//class class : 객체 동적 생성 클래스
		
		Apple a = new Apple("한국",3000);
		a.toString();
		
		//동적객체
		
		try {
			Class c = Class.forName("sub1.Apple");// Static Method
			Apple apple = (Apple)c.newInstance();
			
			apple.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
