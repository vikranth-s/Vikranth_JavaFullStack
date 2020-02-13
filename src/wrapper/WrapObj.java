package wrapper;
import java.util.*;
public class WrapObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		int i=11;
		char c='a';
		//Autoboxing
		Byte byteObj=b;
		Integer intObj=i;
		Character charObj=c;
		System.out.println("object of byte"+byteObj);
		System.out.println("object of int"+intObj);
		System.out.println("object of char"+charObj);
		//Unboxing 
		byte byteType=byteObj;
		int intType=intObj;
		char charType=charObj;
		System.out.println("object of byte"+byteType);
		System.out.println("object of int"+intType);
		System.out.println("object of char"+charType);
		

	}

}
