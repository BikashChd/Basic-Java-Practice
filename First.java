package javabasics;

public class First extends Thread{
	
	public void run()
	{
		for(int i = 0 ; i<5;i++)
		{
			System.out.println(" Java ");
			Thread.yield();
		}
	}

}
