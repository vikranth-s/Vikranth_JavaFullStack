package lab3;
import java.util.*;
public class ArraySmall
{

	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int array[]=new int[length];
		for(int i=0;i<length;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int i=0;i<length;i++)
			for(int j=i+1;j<length;j++)
			{
				if(array[i]>array[j])
						{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
						}
						
			}
		for(int i=0;i<length;i++)
		{
			System.out.println("sorted elements are"+array[i]);
		}
		System.out.println("second smallest number:"+array[1]);
	}
}
