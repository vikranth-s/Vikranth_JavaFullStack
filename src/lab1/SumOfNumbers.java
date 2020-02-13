package lab1;
import java.util.*;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Calculation.calculateSum(n));
		System.out.println(DiffOfSqr.calculateSqr(n));	
	}
}

class Calculation{
	public static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
		
		{
			sum=sum+i;
		}
	}
		return sum;
	}
}

