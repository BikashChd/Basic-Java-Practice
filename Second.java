package javabasics;

public class Second extends Thread{
	
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println(" C#");
			try {
			Thread.sleep(1500);
			}
			catch(InterruptedException e)
			{
				System.out.println(" Second Thread interrupted.");
				System.out.println(e);
			}
		}
	}

}
