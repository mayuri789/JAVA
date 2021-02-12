package day13Collection;

import java.util.HashMap;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		 HashMap<String, String> hm2 =new HashMap<String, String>();
		 hm2.put("sachin", "batsman ");
		 hm2.put("kohli", "sixer");
		 hm2.put("dhoni", "captain ");
		 hm2.put("sachin", "batsman ");
		 
		 System.out.println("hashmap :"+hm2);
		 System.out.println("get the value from key ="+hm2.get("kohli"));
		 hm2.replace("dhoni", " vice captain");
	System.out.println("hashmap : "+hm2);
	
	hm2.remove("sachin");
	System.out.println("hashmap after removing :"+hm2);
	
	System.out.println("it returns all the keys :"+hm2.keySet());
	System.out.println("");
	}

}
