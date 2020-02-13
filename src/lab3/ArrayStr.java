package lab3;
import java.util.*;
public class ArrayStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of strings");
		int lenStr = s.nextInt();
		String array[]=new String[lenStr];
	for(int i=0;i<lenStr;i++)
	{
		array[i] = s.next();
	}
	Arrays.sort(array);
	for(int i=0;i<lenStr;i++)
	{
		System.out.println("sorted strings are:"+array[i]);
	}
	if (lenStr%2==0)
	{
	for(int i=0;i<lenStr/2;i++)
	{
		System.out.println("first half:"+array[i].toUpperCase());
	}
	for(int i=(lenStr/2);i<lenStr;i++)
	{
		System.out.println("second half:"+array[i].toLowerCase());
	}
	}
	else
	{
		for(int i=0;i<(lenStr/2)+1;i++)
		{
			System.out.println("first half:"+array[i].toUpperCase());
		}
		for(int i=(lenStr/2)+1;i<lenStr;i++)
		{
			System.out.println("second half:"+array[i].toLowerCase());
		}

	}

}
}
