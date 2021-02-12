package day13Collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-
 HashMap hm=new HashMap();
 hm.put(1, "sachin");
 hm.put(1,"mayuri");
 System.out.println(hm);
 
 HashMap<Integer, String> hm1=new HashMap<Integer, String>();
 
 HashMap<String, String> hm2 =new HashMap<String, String>();
 hm2.put("sachin", "batsman ");
 hm2.put("kohli", "sixer");
 hm2.put("dhoni", "captain ");
 hm2.put("sachin", "batsman ");
 System.out.println("hashmap :"+hm2);
	}

}
