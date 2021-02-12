package day12Collection;

import java.util.ArrayList;

public class CollectionsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList o1=new ArrayList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		o1.add(17);
		 
		System.out.println(" elements of o1 : "+o1);
		
		ArrayList o2= new ArrayList();
		o2.add(2);
		o2.add(2);
		o2.add(7);
		o2.add(11);
		o2.add(2);
		o2.add(37);
		
		System.out.println(" elements of o2 : "+o2);
		
		o2.addAll(o1);
		
		System.out.println(" elements of o2 after adding o1"+o2);
		
		o2.removeAll(o1);
		System.out.println("after removing o1 from o2 :"+o2);
		
		o2.retainAll(o1);
		System.out.println("elements of o2 after retain from o1 :"+o2);

	}

}
