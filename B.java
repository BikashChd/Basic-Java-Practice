package javabasics;

public class B implements Demo, Demo2{
	
	public void display()
	{
		System.out.println(" x = " + x);
	}
	
	public int update()
	{
		return x + 100;
	}
	
	public int sum(int x, int y)
	{
		 return x + y;
	}
	
	public double multiply(double x, double y)
	{
		return x*y;
	}

}
