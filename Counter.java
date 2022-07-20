package javabasics;

public class Counter {
	
	int count;
	
	public synchronized void increment()      // just counter of multithreading
	{
		count++;
	}

}
