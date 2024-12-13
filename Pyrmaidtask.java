package javaprogram;

public class Pyrmaidtask {
	public static void main(String[] args) {
		int num= 10;
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= num - i; j++)
				System.out.print(" ");
			
			for(int j = 1; j <= i; j++) 
				System.out.print(" *");
			System.out.println();
		}
	}

}
