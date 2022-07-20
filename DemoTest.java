package javabasics;

public class DemoTest {
	
	public static void main(String [] args)
	{
		A aobj  = new A();
		
		aobj.display();
		System.out.println(" new value of x = "+ aobj.update());
		System.out.println(" sum of given values = " + aobj.sum(10,50));
		System.out.println(" product of given values = " + aobj.multiply(10,50));
		
		B bobj = new B();
		bobj.display();
		int x = bobj.update();
		System.out.println(" New value of x in B : "+ x);
		
		Demo d  = new B();
		d.display();	
		
		
		
		
	}
}
