package day12Collection;

import java.util.ArrayList;
import java.util.Collections;

public class UtilityMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList o1=new ArrayList();
		o1.add(10);
		o1.add(20);
		o1.add(30);
		o1.add(40);
		o1.add(50);
		System.out.println("elements of o1"+o1);
		Collections.sort(o1);
		
		System.out.println( " after sorting elements of o1:"+o1);
		Collections.reverse(o1);
		
		System.out.println("after sorting elements of o1:"+o1);
		
		System.out.println(Collections.min(o1));
		System.out.println(Collections.max(o1));

	}

}
