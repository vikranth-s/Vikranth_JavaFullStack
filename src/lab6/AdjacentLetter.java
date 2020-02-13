package lab6;
import java.util.*;
public class AdjacentLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		int i;
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				arr[i+1]=arr[i+3];
			}
			else
			{
				arr[i]=arr[i];
			}
			System.out.println(arr[i]);
			
		}
		System.out.println(arr[i]);
	}

}
