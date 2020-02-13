package Regualr;
import java.util.*;
public class ConstrOverload {
	int age;
	int regno;
	String name;
	ConstrOverload(int a, int r)
	{
		age=a;
		regno=r;
	}
	ConstrOverload(int a, int r,String n)
	{
		age=a;
		regno=r;
		name=n;
	}
	void display()
	{
		System.out.println("age:"+age+"regno:"+regno+"name:"+name);
	}
	public static void main(String[] args) {
		ConstrOverload c1=new ConstrOverload(11,2555,"a");
		ConstrOverload c2=new ConstrOverload(12,3555);
		c1.display();
		c2.display();

	}

}
