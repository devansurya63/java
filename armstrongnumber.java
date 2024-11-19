package javaprogram;

public class armstrongnumber {
	public static void main(String[] args) {
int num=156;
int sum =0;
int temp =num;
while(num > 0) {
	int mod = num % 10;
   sum = sum + (mod*mod*mod);
   num = num / 10;
}

   if (sum == temp) {
	   System.out.println("Armstrong number");
	   
   }else {
	   System.out.println("Not An Armsrong number");
   }
}
}


