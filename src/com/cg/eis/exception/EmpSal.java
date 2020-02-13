package com.cg.eis.exception;
import java.util.*;
public class EmpSal {
	public void displaySalary(int sal) throws InputSalMismatchException
	{
		if(sal>3000)
		{
			System.out.println("Salary is good");
		}
		else
		{
			throw new InputSalMismatchException("enter valid salary");
		}
	}
}
