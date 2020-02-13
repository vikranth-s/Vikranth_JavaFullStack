package lab6;
import java.util.*;
public class ConsNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter integer");
		int n=s.nextInt();
		String st=String.valueOf(n);
		char arr[]=st.toCharArray();
		int arr1[] = new int[arr.length];
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
		 arr2[i]=Integer.parseInt(String.valueOf(arr));
		}
		
		for(int i=0;i<arr2.length-1;i++)
		{
			arr1[i]=arr2[i]+arr2[i+1];
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		}

}
