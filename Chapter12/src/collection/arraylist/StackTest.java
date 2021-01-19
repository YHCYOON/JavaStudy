package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if ( len == 0) {		// underflow 에러 방지
			System.out.println("스택이 비었습니다");
			return null;
		}
		else {
			String data = arrayStack.remove(len - 1);		// remove 는 꺼내고 삭제
			return data;
		}
		
	}
	
	public String peek() {
		int len = arrayStack.size();
		if ( len == 0 ) {
			System.out.println("스택이 비었습니다");
			return null;
		}
		else {
			String data = arrayStack.get(len - 1);			// get 은 조회만 함
			return data;
		}
	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack mystack = new MyStack();
		
		mystack.push("a");
		mystack.push("b");
		mystack.push("c");
		
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		
		
		System.out.println(mystack.peek());
		System.out.println(mystack.peek());
		System.out.println(mystack.pop());
		
		System.out.println(mystack.pop());
		
	}

}
