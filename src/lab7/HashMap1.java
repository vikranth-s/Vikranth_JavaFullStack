package lab7;
import java.util.*;
public class HashMap1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> obj=new HashMap<>();
		obj.put("abc",100);
		obj.put("def",210);
		obj.put("xyz",110);
		int a=obj.get("abc");
		System.out.println(a);
	}
}
