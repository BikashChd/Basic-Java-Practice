package javabasics;

public class Thread2 extends Thread{
	
	Counter c;
	
	Thread2( Counter c)
	{
		this.c = c;
	}
	
	public void run()
	{
		for(int i =0;i<10000;i++)
			c.increment();
	}


}
