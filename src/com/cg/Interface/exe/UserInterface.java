package com.cg.Interface.exe;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Name");
		String name=sc.next();
		System.out.println("enter Gender");
		String gender=sc.next();
		System.out.println("enter Category");
		String category=sc.next();
		System.out.println("enterSalary");
		Double salary=sc.nextDouble();
		Employee empObj=new Employee();
		empObj.setName(name);
		empObj.setGender(gender);
		empObj.setCatagory(category);
		empObj.setSalary(salary);
		try
		{
			empObj.displaySalary();
		}
		catch(InputSalaryNegativeException e)
		{
			System.out.println(e);
		}
		}

}
