package javabasics;

public class ThreadDemo  {
	public static void main(String [] args)
	{
		  
	      ThreadA r = new ThreadA();   // Thread built in class 
	      Thread t1  = new Thread(r);
	      
	       t1.start();
	       
	       
	       ThreadB r1 = new ThreadB();
	       Thread t2 = new Thread(r1);
	       t2.start();   
	      for(int i = 0;i<10;i++)
	      {
	    	  System.out.println("Main thread");
	      }
	}
}
