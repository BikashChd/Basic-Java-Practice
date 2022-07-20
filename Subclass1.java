package javabasics;

public class Subclass1 extends AbstractClassDemo {
	
	public void display()
	{
		System.out.println(" i = " + i + "\t j = " + j);
	}
	
	public  int sum()
	{   
		return i + j;
	}
	
	public static void main(String [] args)
	{
		Subclass1 obj = new Subclass1();
		
		obj.display();
		System.out.println("sum = " + obj.sum());
		
	}

}
