package test02;
/*
 * 날짜 : 2021/05/20
 * 이름 : 홍길동
 * 내용 : 배열 자료구조 스택 출력하기 
 */
public class JavaTest9 {
	
	static int STACK_SIZE = 10;
	static int stack[] = new int[STACK_SIZE];
	static int top = 0;
	
	public static void main(String[] args) {
	
		push(100);
		push(200);
		push(300);
		
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		
	}
	public static void push(int data) {
		if(top == STACK_SIZE) {
			System.out.println("Stack is Full!!");
		}
		stack[top++] = data;
	}
	
	public static int pop() {
		if(top == 0) {
			System.out.println("Stack is Empty!!");
			return 0;
		}
		return stack[--top];
	}
}
