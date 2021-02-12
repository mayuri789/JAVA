package day12Collection;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList o= new ArrayList(); //capacity 10
ArrayList o1= new ArrayList(100); //capacity 100
System.out.println("size of array list : "+o.size());
System.out.println("element of arraylist : "+o);
o.add(100);
o.add("mayuri");
o.add(230);
o.add("sarthak");
o.add(100.89);
System.out.println("size of array list : "+o.size());
System.out.println("element of arraylist : "+o);

o.add(1,"welcome to java");
System.out.println("element of arraylist : "+o);

o.remove(0);
System.out.println("element of arraylist : "+o);

o.remove(Integer.valueOf(3));
System.out.println("element of arraylist : "+o);

System.out.println("check whether it contains or not : "+o.contains("mayuri"));
	}

}
