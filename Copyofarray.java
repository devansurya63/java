package javaprogram;
import java.util.*;

public class Copyofarray {
	public static void main(String[] args) {
		
	int[] arr1 = {1,2,3,4,5,6,7,8,9,10,90};
	int[] arr2 = new int[arr1.length];
	

	for(int i=0; i < arr1.length; ++i) {
		arr2[i] = arr1[i];
	}
	
	for(int num1 : arr1) {
		System.out.print(num1+" ");
	}
	
	System.out.println();
	
	for(int num : arr2) {
		System.out.print(num+" ");
	}
	
	System.out.println();
	
	if (Arrays.equals(arr1, arr2)) {
		System.out.println("Array Copied !!");
	}

	}
}