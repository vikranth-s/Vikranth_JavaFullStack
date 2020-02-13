package lab6;
import java.util.*;
public class IntToken {
	public int displayIntToken(int n)
	
	{
		StringTokenzier p=new StringTokenzier();
		int sum=0;
		while(p.hasMoreTokens())
		{
			System.out.println(p.nextToken());
			sum=sum+p.nextToken();
		}
		System.out.println(sum);
	}
}
