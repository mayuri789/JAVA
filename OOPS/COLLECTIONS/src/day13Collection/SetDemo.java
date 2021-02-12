package day13Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.xml.sax.HandlerBase;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h=new HashSet();
		h.add("mayuri");
		h.add("mayuri");
		h.add(1);
		h.add(15);
		h.add("sarthak");

		System.out.println("hashset : "+h);


		LinkedHashSet lh=new LinkedHashSet();
		lh.add("mayuri");
		lh.add("mayuri");
		lh.add(1);
		lh.add(15);
		lh.add("sarthak");

		System.out.println(" linked hashset : "+lh);

		TreeSet ts=new TreeSet();
		ts.add("mayuri");
		ts.add("mayuri");
		//lh.add(1);
		//lh.add(15);
		ts.add("sarthak");
		ts.add("rani");
		ts.add("omkar");
		System.out.println("treeset :"+ts);

	
	}

}
