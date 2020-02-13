package com.cg.eis.exception;
import java.util.*;
public class EmployeeException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter salary");
		int sal=s.nextInt();
		EmpSal b=new EmpSal();
		try
		{
			b.displaySalary(sal);
		}
		catch(InputSalMismatchException e)
		{
			{
				System.out.println(e);
			}
		}

	}

}
