package javabasics;

public class OddThread implements Runnable {

	 public void run()
	 {
		 for(int i = 1; i<10;i++)
		 {
			 
			 if(i%2==1)
			   System.out.println("odd :"+ i);
			try {
					Thread.sleep(500);
		        }
			catch(InterruptedException e)
			{
				System.out.println("Interrupted Exception is generated.");
			}
	 
	 }
	 }

}
