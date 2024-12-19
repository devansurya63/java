package javaprogram;
import java.time.*;
import java.time.format.DateTimeFormatter;
 class PrnitDMY {

	public static void main(String[] args) {
			
			DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");	
			System.out.println("Before the change =>");
			
			LocalDate cd = LocalDate.now();
			
			System.out.println("Current Date : "+cd.format(df));
			
			
			System.out.println();
			
			System.out.println("After the change =>");
			LocalDate after4d = cd.plusDays(4);
			LocalDate after4m = cd.plusMonths(4);
			LocalDate after4y = cd.plusYears(4);
			
			System.out.println("Current Date	: "+cd.format(df));
			System.out.println("After 4 days	: " +after4d.format(df));
		    System.out.println("After 4 months	: " +after4m.format(df));
		    System.out.println("After 4 years	: " +after4y.format(df));
			
		}

	}
