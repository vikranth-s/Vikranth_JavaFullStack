package lab5;
import java.util.*;
public class ValidAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		AgeVerify a=new AgeVerify();
		try
		{
	          a.displayAge(age);
		}
		catch(InputAgeMismatchException e)
		{
			System.out.println(e);
		}
	}

}
