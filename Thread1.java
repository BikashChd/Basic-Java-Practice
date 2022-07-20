package javabasics;

public class Thread1 extends Thread {
	
	Counter c;
	
	Thread1( Counter c)
	{
		this.c = c;
	}
	
	public void run()
	{
		for(int i =0;i<10000;i++)
			c.increment();
	}

}
