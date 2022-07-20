package javabasics;

public class Number {
	
	int num;
	boolean valueSet = false;
	
	public synchronized void set(int num)
	{
		while(valueSet)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Producer:  " + num);
		this.num = num;
		valueSet = true;
		notify();   // it wakes up the waiting method
	}
	
	public synchronized void get()
	{
		while(!valueSet)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		System.out.println(" Consumer:  " + num);
		valueSet = false;
		notify();
		
	}

}
