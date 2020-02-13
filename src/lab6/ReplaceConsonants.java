package lab6;
import java.util.*;
public class ReplaceConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String st=s.nextLine();
		//StringBuffer sbr=new StringBuffer(st);
		//String array[]=new String[sbr];
		int i=0;
		char arr[]=st.toCharArray();
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]=='a'|| arr[i]=='e' || arr[i]=='i'||arr[i]=='o' || arr[i]=='u')
			{	
				arr[i]=arr[i];
			}
			else
			{
				arr[i]=(char) (arr[i]+1);
			}
		System.out.println(arr[i]);
		}
	}

}
