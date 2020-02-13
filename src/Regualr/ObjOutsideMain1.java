package Regualr;
import java.util.*;
public class ObjOutsideMain1 {
	int regno;
	String name;
	String sec;
}	
class ObjOutsideMain{
	public static void main(String[] args) {
		ObjOutsideMain1 obj=new ObjOutsideMain1();
		System.out.println(obj.regno);
		System.out.println(obj.name);
		System.out.println(obj.sec);
}
}