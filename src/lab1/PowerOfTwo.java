package lab1;

import java.util.Scanner;

public class PowerOfTwo
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(PowerOfTwoOrNot.powerOfTwo(n));
	}

}
class PowerOfTwoOrNot
{
	public static boolean powerOfTwo(int n)
	{
		if (n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}
}
