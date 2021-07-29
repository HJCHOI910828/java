package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 큐 출력하기 
 */
public class JavaTest10 {
	static int QUEUE_SIZE = 10;
	static int queue[] = new int[QUEUE_SIZE];
	static int front = 0,rear=0;
	
	public static void main(String[] args) {
		insert(100);
		insert(200);
		insert(300);
		
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
		System.out.println(delete());
	}
	
	public static void insert(int data) {
		if(rear == QUEUE_SIZE) {
			System.out.println("QUEUE IS FULL!!");
		}
		
		queue[rear++] = data;
	}
	public static int delete() {
		if(front == QUEUE_SIZE) {
			System.out.println("QUEUE IS EMPTY!!");
			return 0;
		}
		return queue[front++];
	}
}

