package javaprogram;

public class printoddevennuber {
	public static void main(String[] args) {
	
		   
		        int[]n= {1,2,3,4,5,6,7,8,9,10};

		        
		        System.out.println("Even numbers:");
		        for (int num : n) {
		            if (num % 2 == 0) {
		                System.out.print(num + " ");
		            }
		        }

		        System.out.println("\nOdd numbers:");
		        for (int num : n) {
		            if (num % 2 != 0) {
		                System.out.print(num + " ");
		            }
		        }
		    }
}