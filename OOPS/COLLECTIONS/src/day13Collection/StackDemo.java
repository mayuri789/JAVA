package day13Collection;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack();
		
		s.add(1);
		s.push(2);
		s.push(3);
		
		System.out.println("elements in stack :"+s);
		System.out.println("top element : "+s.peek());
		System.out.println("elements in stack  :"+s);
		
		System.out.println("remove :"+s.remove(2));
		s.pop();
		System.out.println("element in stack : "+s);
		
		
		System.out.println("empty stack : "+s.empty()); 
		
		
	}
	

}
