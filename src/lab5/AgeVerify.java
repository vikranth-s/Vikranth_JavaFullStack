package lab5;
import java.util.*;
public class AgeVerify {
	public void displayAge(int choice) throws InputAgeMismatchException
	{
		if(choice>15)
		{
			System.out.println("age valid");
		}
		else
		{
			throw new InputAgeMismatchException("enter valid age");
		}
			
	}
}
