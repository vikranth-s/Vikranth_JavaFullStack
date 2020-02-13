package lab5;

import java.util.Scanner;

public class TrafficSignal {

public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
System.out.println("choose red or green or yellow for lights");
String choice;
choice = sc.nextLine();
TrafficException ne = new TrafficException();
try
{
System.out.println(ne.displayMessage(choice));
}
catch(InputMismatchException e)
{
System.out.println(e);
}

}

}
