package day12Collection;

import java.util.ArrayList;
import java.util.Collections;
class removeDuplicate{
	
}


public class ArraylistDemo1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("mayuri");
		a.add("nishi");
		a.add("shubhda");
		a.add("prasad");
		
		System.out.println("java batch :"+a);
		
		ArrayList<String> b=new ArrayList<String>();
		b.add("mayuri");
		b.add("nishi");
		b.add("vishal");
		b.add("omkar");
		
		System.out.println("Softskill batch :"+b);
		b.removeAll(a);
		System.out.println("after adding :"+b);
		
		b.addAll(a);
		System.out.println("after adding :"+b);
		
		Collections.sort(a);
		System.out.println("after sorting : "+a);

	}

}
