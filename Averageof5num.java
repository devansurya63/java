package javaprogram;
class Subject extends Thread
{
	public void run()
	{
		int[] mark=new int[5];
		mark[0]=80;
		mark[1]=90;
		mark[2]=65;
		mark[3]=68;
		mark[4]=75;
		
		float sum=mark[0]+mark[1]+mark[2]+mark[3]+mark[4];
		
		System.out.println("Total Value : "+sum);
		
		float average=sum/mark.length;
		
		System.out.println("Average Value : "+average);
	}
}

public class Averageof5num {
	
		public static void main(String args[])
		{
			Subject t1=new Subject();
			t1.start();
}
}
