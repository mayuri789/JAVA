package day13Collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList l= new ArrayList();
		l.add( 2);
		
		LinkedList l1 =new  LinkedList();
		l1.add(12);
		l1.add(3);
		l1.addFirst(30);
		l1.addLast(45); 
		l1.add(67);
		
		System.out.println("linked list : "+l1);
		
		l1.removeFirst();
		System.out.println(" after removing first ele :"+l1);
		l1.removeLast();
		System.out.println(" after removing last ele :"+l1);
	}

}
