package lab5;

public class TrafficException {
String msg;
public String displayMessage(String choice) throws InputMismatchException
{
switch(choice)
{
case "red":msg = "stop";
break;
case "yellow":msg = "ready";
break;
case "green":msg = "go";
break;
default : throw new InputMismatchException("enter correct word");
}
return msg;
}
}

