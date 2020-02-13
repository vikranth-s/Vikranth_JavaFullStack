package lab6;
import java.util.*;
public class FileSize {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[i+1])
			{
				System.out.println("false");
				break;
			}
			else
			{
				System.out.println("true");
				break;
			}
		}
		
		

	}

}
