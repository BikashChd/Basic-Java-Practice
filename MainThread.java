package javabasics;

public class MainThread {

	public static void main(String [] args) throws InterruptedException
	{
		
		OddThread t1 = new OddThread();
		EvenThread t2 = new EvenThread();
		
		Thread one = new Thread(t1);
		Thread two = new Thread(t2);
		
		one.start();		
		two.start();
		
		System.out.println(" thread One Id : "+ one.getId());
		System.out.println("Current state of One: " + one.getState());
		System.out.println(" thread One: isalive?: "+ one.isAlive());
		//one.join();
		System.out.println("Current Thread priority = " + Thread.currentThread().getPriority());
		System.out.println("Thread one priority = " + one.getPriority());
		System.out.println("Thread two priority = " + two.getPriority());
		
		for(int i = 1; i<=10;i++)
			System.out.println("This is main thread.");
		
		}
}
