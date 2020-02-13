package lab6;
import java.util.*;
public class StringMirrorImage {
	public static void displayMirrorImage(String st) {
		StringBuffer sbr=new StringBuffer(st);
		sbr.reverse();
		System.out.println(st+"|"+sbr);
	}
}
