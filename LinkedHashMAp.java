package HashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMAp {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(3,"nag");
		lhm.put(1, "hi");
		lhm.put(2,"hello");
		lhm.put(4, "bye");
		lhm.put(null, null);
		
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.get(3));
		System.out.println(lhm.containsKey(3));
		System.out.println(lhm.containsValue("nag"));
		System.out.println(lhm.size());
		lhm.replace(1,"hii");
		System.out.println(lhm);
		lhm.remove(null);
		System.out.println(lhm);
		for (Map.Entry entry : lhm.entrySet()) {
			 
			 if(entry.getValue()=="hello") {
				 System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
				 
			 }
	        }
	}

}
