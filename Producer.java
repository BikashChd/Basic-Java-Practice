package javabasics;

public class Producer implements Runnable {
	
	Number obj;
	
	Producer(Number obj)
	{
		this.obj = obj;
	}
	
	public void run()
	{
		int i =0;
		
		while(true)
		{
			obj.set(i++);
			
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
