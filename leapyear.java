package javaprogram;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Year : ");
		int year = sc.nextInt();

		if ( year % 4 == 0) {
			System.out.println(year+" It is a Leap Year ");
		} else {
			System.out.println(year+" It is not a Leap Year ");
		}
	}

}

