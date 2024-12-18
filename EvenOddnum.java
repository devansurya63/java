package javaprogram;
class EvenThread extends Thread
{
	public void run() {
		for (int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println("Even numbers are:"+i);
			}
		}
		
	}
}
class OddThread extends Thread
{
	public void run() {
		for (int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println("Odd numbers are:"+i);
			}
		}
		
	}
}

public class EvenOddnum {
public static void main(String[] args) {
	EvenThread eventhread=new EvenThread();
	OddThread oddthread=new OddThread();
	eventhread.start();
	oddthread.start();
	
}
}
