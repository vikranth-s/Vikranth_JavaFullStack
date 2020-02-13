package lab3;
import java.util.*;
public class ArrayChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter length:");
		int length=s.nextInt();
		char array[]=new char[length];
		char array1[]=new char[length];
		for(int i=0;i<length;i++)
		{
			array[i]=s.next().charAt(0);
			
		}
		int i=0,j=0,count=1;
			Arrays.sort(array);
			for( i=0;i<length;i++)
			{
				System.out.println("sorted alphabets are:"+array[i]);
			}
			for(i=0;i<length;i++)
				for(j=0;j<length;j++)
				{
			if(array[i]==array[j])
			{
				
				count+=1;
				System.out.println(count+array[i]);
			}
	}

}
}