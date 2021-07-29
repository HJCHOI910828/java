package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 역순 출력하기 
 */
public class JavaTest3 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i : arr) {
			System.out.print(i +", ");
		}
		System.out.println();
		
		for (int j = 0; j < 5; j++) {
			int temp = arr[j];
			arr[j] = arr[9 - j];
			arr[9 - j] = temp;
		}
		
		for( int arrs : arr) {
			System.out.print(arrs + ", ");
		}
		
	}
}
