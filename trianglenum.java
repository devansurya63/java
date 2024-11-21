package javaprogram;

import java.util.Scanner;

public class trianglenum {
	public static void main(String[]args) {
int i,j,n;
System.out.print("Input number of rows:");
Scanner in=new Scanner(System.in);
n=in.nextInt();
for(i=1;i<=n;i++)
{
	for(j=5;j>=i;j--)
	System.out.print(j);
	System.out.println(" ");
}
}
}