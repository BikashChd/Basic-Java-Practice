package javabasics;

public class Main {
	
	public static void main(String [] args) throws Exception
	{
		Counter obj = new Counter();
		
		Thread1 t1 = new Thread1(obj);
		Thread t2 = new Thread2(obj);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(" Count = " + obj.count);
		
		
		
	}

}
