package lab3;
import java.util.*;
public class ArrayRev
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length");
		int length=s.nextInt();
		int array[]=new int[length];
		int array1[]=new int[length];
		int k=0;
		for(int i=0;i<length;i++)
		{
			array[i]=s.nextInt();
	    }
		
		for(int j=length-1;j>=0;j--)
		{
			array1[k]=array[j];
			k++;
		}
		for(int i=0;i<length;i++)
		{
			System.out.println("reversed order:"+array1[i]);
		}
		for(int i=0;i<length;i++)
			for(int j=i+1;j<length;j++)
		{
		if (array1[i]>array1[j]) 
				{
			temp=array1[i];
			array1[i]=array1[j];
			array1[j]=temp;
		}
		}
		for(int i=0;i<length;i++)
		{
			System.out.println(array1[i]);
		}
}
}