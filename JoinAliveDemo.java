package javabasics;

public class JoinAliveDemo {
	
	public static void main(String [] args) throws InterruptedException
	{
		First t1 = new First();
		Second t2 = new Second();
		
		System.out.println(" Current state of main thread:" + Thread.currentThread().getState());
		System.out.println(" current state of t1:  " + t1.getState());
		System.out.println(" Current state of t2 : " + t2.getState());
		
		System.out.println(" The priority of main: "+ Thread.currentThread().getPriority());
		System.out.println(" Priority of t1: "+ t1.getPriority());
		System.out.println(" Priority of 2: "+ t2.getPriority());
		
		Thread.currentThread().setPriority(2);
		t1.setPriority(7);
		t2.setPriority(8);
				
		t1.start();
		t2.start();
		
		System.out.println(" The priority of main: "+ Thread.currentThread().getPriority());
		System.out.println(" Priority of t1: "+ t1.getPriority());
		System.out.println(" Priority of 2: "+ t2.getPriority());
		
		//t1.join();  // main thread waits until t1 completes 
		
		 t2.interrupt();
		  
		System.out.println(" Current state of main thread:" + Thread.currentThread().getState());
		System.out.println(" current state of t1:  " + t1.getState());
		System.out.println(" Current state of t2 : " + t2.getState());
		
		System.out.println(" Is main thread alive? :"+ Thread.currentThread().isAlive());
		System.out.println(" Is t1 alive? :" + t1.isAlive());
		System.out.println(" Is t2 is alive ?: " + t2.isAlive());
		
		for(int i = 0 ;i<5;i++)
		{
			System.out.println(" Main ");
		}
		
		System.out.println(" Is main thread alive? :"+ Thread.currentThread().isAlive());
		System.out.println(" Is t1 alive? :" + t2.isAlive());
		System.out.println(" Is t2 is alive ?: " + t2.isAlive());
		
		System.out.println(" Current state of main thread:" + Thread.currentThread().getState());
		System.out.println(" current state of t1:  " + t1.getState());
		System.out.println(" Current state of t2 : " + t2.getState());
		
		
	}

}
