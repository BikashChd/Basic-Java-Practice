package javabasics;

public class ExceptionDemo {

	
	public static void main(String []args) 
	{
		int a = 10;
		int b = 5;
		int c = 5;
		int d =0;
		try {
			
				d = a/(b-c);
		   }
		catch(Exception e)
		{
			System.out.println("Division by zero error !");
		}
		finally {
		System.out.println("This is in finally block.");
		System.out.println(" d = " + d);
	     }
	}
}
