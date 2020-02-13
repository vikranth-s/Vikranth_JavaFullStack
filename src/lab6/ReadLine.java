package lab6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class ReadLine {
	public static void main(String args[]) throws IOException
	{
		File obj=new File("C:\\Users\\dell\\Desktop\\final password.txt");
		{
			FileReader obj1=new FileReader(obj);
			BufferedReader br=new BufferedReader(obj1);
			String s;
			int linecount = 0;
			while((s=br.readLine())!=null)
			{
				linecount++;
			}
			obj1.close();
			System.out.println("line count:"+linecount);
		}
	}
}
