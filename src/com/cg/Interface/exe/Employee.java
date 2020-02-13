package com.cg.Interface.exe;

import lab5.InputAgeMismatchException;

public class Employee {
private String Name;
private String Gender;
private String Catagory;
private double Salary;
private int getSalary;
	public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
public String getCatagory() {
	return Catagory;
}
public void setCatagory(String catagory) {
	Catagory = catagory;
}
public double getSalary()
{
	return Salary;
}
public void setSalary(double salary) {
	this.Salary=salary;
	
}
public void displaySalary()throws InputSalaryNegativeException
{
	if(this.getSalary>0)
	{
		System.out.println(Salary);
	}
	else
	{
		throw new InputSalaryNegativeException("enter valid salary");
	}
		
}

}
