package lab6;
import java.util.*;
public class Strlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.nextLine();
		str=str.concat("_job");
		if((str.length()-4)>=8)
		{
			System.out.println("validation passed:-name is:"+str);
		}
		else
		{
			System.out.println("false");
			System.out.println("name should not be less than 8 characters");
		}

	}

}
