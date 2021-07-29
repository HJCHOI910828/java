package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 선택 정렬하기 
 */
public class JavaTest4 {
	public static void main(String[] args) {
		int arr[] = {4,2,1,5,3};
		
		for (int i = 0 ; i < 4; i++) {
			for (int j = i+1; j <5;j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]=temp;
				}
			}
		}
		for (int i:arr) {
			System.out.print(i+" ");
		}
	}
}
