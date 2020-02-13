package lab6;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public abstract class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		File obj=new File("C:\\Users\\dell\\Desktop\\final password.txt");
		if(obj.createNewFile())
		{
			System.out.println("file:"+obj.getName());
		}
		else
		{
			System.out.println("file already created");
		}
		System.out.println("successfully created file");
		
		FileWriter writer1=new FileWriter("C:\\Users\\dell\\Desktop\\final password.txt");
		 writer1.write("this is an java file");
		 writer1.close();
		 System.out.println("successfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("error occured");
			e.printStackTrace();
		}
}
}