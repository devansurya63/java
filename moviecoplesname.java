package javaprogram;
import java.util.*;

public class moviecoplesname {
public static void main (String []args){
	Scanner sc=new Scanner(System.in);
System.out.println("Enter a actress ");
String couple=sc.nextLine();
switch(couple)
{
case "nayanthara":
		System.out.println("Enter movie name ");
		String movie=sc.nextLine();
	switch(movie)
	{
	case "billa":
	System.out.println("The couple actors are ajith-nayanthara.");
	break;
	}
	break;
case "samantha":
	System.out.println("Enter movie name ");
	String movies=sc.nextLine();
switch(movies)
{
case "mersal":
System.out.println("The couple actors are samantha-vijay.");
break;
}
	break;
	case"chandra":
		System.out.println("Enter movie name ");
		String moviess=sc.nextLine();
	switch(moviess)
	{
	case "vada chennai":
	System.out.println("The couple actors are rajan-chandra.");
	break;
	

}
}
}
}