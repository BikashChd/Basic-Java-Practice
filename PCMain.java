package javabasics;

public class PCMain {
	
	public static void main(String [] args)
	{
		Number obj = new Number();
		
		Producer p = new Producer(obj);
		Thread t1 = new Thread(p);
		
		Consumer c = new Consumer(obj);
		Thread t2 = new Thread(c);
		
		
		t1.start();
		t2.start();
		
	}

}
