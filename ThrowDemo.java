package javabasics;
// input : age,  if age <18 , throw exception: not valid for voting else welcome for voting

public class ThrowDemo {
	
	
	void validate(int age) throws ArithmeticException 
	{
		if(age <18)
			throw new ArithmeticException("Invalid Age !");
		else
			System.out.println("Welcome for voting !");
	}
	
	public static void main(String [] args) throws ArithmeticException
	{
		int age = 6;
		
		ThrowDemo obj= new ThrowDemo();
		
		obj.validate(age);
		  
		System.out.println("End of program.");
		
	}
	

}
