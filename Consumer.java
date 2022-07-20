package javabasics;

public class Consumer implements Runnable {
Number obj;
	
	Consumer(Number obj)
	{
		this.obj = obj;
	}
	
	public void run()
	{
		while(true)
		{
			obj.get();
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}

}
