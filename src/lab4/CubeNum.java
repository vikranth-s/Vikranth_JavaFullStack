package lab4;
import java.util.*;
public class CubeNum {

	public static int SumCube(int num)
	{
		int sum=0;
		while(num!=0) {
		int a;
		a=num%10;
		sum=sum+(a*a*a);
		num=num/10;
	}
		return sum;
		
}
}
