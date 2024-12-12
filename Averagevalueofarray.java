package javaprogram;

public class Averagevalueofarray {
public static void main(String[] args) {
	int[] number = {20,5,5,20,50,299};
	
	int sum = 0;
	for(int num : number) {
		sum = sum + num ;
	}
	
	double avg = (double) sum/number.length;
	System.out.println(" Average value of Array is : "+avg);

}
}
