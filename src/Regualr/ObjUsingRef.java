package Regualr;
import java.util.*;
public class ObjUsingRef {
	int regno;
	String name;
	int age;
	public static void main(String args[])
	{
		ObjUsingRef obj=new ObjUsingRef();
		obj.regno=25;
		obj.name="helo";
		System.out.println("regno:"+obj.regno+" name:"+obj.name+" age:"+obj.age);
	}

}
