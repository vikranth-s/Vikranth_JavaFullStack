package lab1;
import java.util.*;
public class DiffOfSquares {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(SumOfSqr.calculateSqr(n));
		
	}

}
class SumOfSqr{
	public static int calculateSqr(int n)
	{
		int sum=0, sum1=0, sum2=0;
		for(int i=0;i<n;i++)
		{
			sum1=sum1+i*i;
		}
		for(int i=0;i<n;i++)
		{
			sum2=(sum2+i)^2;
		}
		sum=sum1-sum2;
		return sum;
	}
}