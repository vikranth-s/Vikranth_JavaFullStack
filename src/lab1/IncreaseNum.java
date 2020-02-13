package lab1;
public class IncreaseNum 
{
	boolean flag;
	public boolean displayNum(int n)
	{
		String s=Integer.toString(n);
		char array[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			array[i]=s.charAt(i);
		}
		for(int i=0;i<array.length;i++)
			for(int j=i+1;j<array.length-1;j++)
			{
			if (array[i]<array[j])
			{
				flag = true;
			}
			else
			{
				flag = false;
				
			}
			}
		return flag;
			
	}
}
