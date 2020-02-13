package Regualr;
import java.util.*;
public class ObjUsingMeth {
	int age;
	int salary;
	String name;
	void takeValues(int a,int s,String n)
	{
		age=a;
		salary=s;
		name=n;
	}
	void displayValues()
	{
		System.out.println("age:"+age+"salary:"+salary+"name:"+name);
	}
	public static void main(String[] args) {
		ObjUsingMeth obj=new ObjUsingMeth();
		ObjUsingMeth obj1=new ObjUsingMeth();
		obj.takeValues(21,1000,"a");
		obj1.takeValues(22,2000,"j");
		obj.displayValues();
		obj1.displayValues();
	}

}
