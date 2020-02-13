package lab7;
import java.util.*;
public class HashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
		hmap1.put(1,"a");
		hmap1.put(2,"b");
		System.out.println("hashmap values");
		for(Map.Entry<Integer, String> m:hmap1.entrySet())
		{	
			System.out.println(m.getKey()+":"+m.getValue());
		}
		hmap1.putIfAbsent(2,"b");
		hmap1.putIfAbsent(5,"z");
		hmap1.putIfAbsent(1,"a");
		System.out.println("hashmap values after invoking");
		for(Map.Entry<Integer, String> m:hmap1.entrySet())
		{	
			System.out.println(m.getKey()+":"+m.getValue());
		}
		HashMap<Integer,String> hm2=new HashMap<Integer,String>();
		hm2.put(4,"d");
		hm2.putAll(hmap1);
		System.out.println("hashmap hm2 which invokes hm1 and hm2 values");
		for(Map.Entry<Integer, String> m:hm2.entrySet())
		{	
			System.out.println(m.getKey()+":"+m.getValue());
		}
	}
}
