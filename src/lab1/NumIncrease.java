package lab1;
import java.util.Scanner;
public class NumIncrease
{
	public static void main(String[]args)
	{
	System.out.println("enter num");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	IncreaseNum o=new IncreaseNum();
	System.out.println(o.displayNum(n));
	}
}
