package javaprogram;

public class Sumvalueofarray {
	public static void main(String[] args) {
		int[] number = {10,20,30,40,50,60,70,80,90,};
		
		int sum = calculateSum(number);
		System.out.println("The sum of Numbers in Array is : "+sum);
	}
	
	public static int calculateSum(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum = sum +num;
		}
		return sum;
	}
}
