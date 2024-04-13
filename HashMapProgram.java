package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm=new HashMap();
		hm.put(3,"nag");
		hm.put(1, "hi");
		hm.put(2,"hello");
		hm.put(4, "bye");
		
//		System.out.println(hm);
//		 for (Map.Entry entry : hm.entrySet()) {
//			 
//			 if(entry.getValue()=="hello") {
//				 System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//				 
//			 }
//	     }
		 
		 HashMap<Integer, Mobile> hash=new HashMap<Integer, Mobile>();
		 hash.put(1, new Mobile("iphone", 18000, 8));
		 hash.put(2, new Mobile("mi", 16000, 4));
		 hash.put(3, new Mobile("onePlus", 28000, 6));
		 
//		 System.out.println(hash);
		 for(Map.Entry<Integer,Mobile> entry: hash.entrySet()) {
			 
			 Mobile m=entry.getValue();
			 if(m.getPrice()>20000) {
				 System.out.println(entry);
			 }
		 }
	}
}
