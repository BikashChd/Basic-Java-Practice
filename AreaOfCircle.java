package javabasics;
// Program:  reads the radius of a circle and finds area of circle with area = PI * r*r 
import java.util.Scanner;

public class AreaOfCircle {

	private double radius;
	final private double PI = 3.1415;
	
	public AreaOfCircle()   // constructors
	{
		radius =0;
	}
	
	public AreaOfCircle(double radius)
	{
		this.radius = radius;
	}
	
	public double calcArea()
	{
		return PI * radius *radius;
	}
	
    public void showData()
	{
		System.out.println(" Radius of Circle =" + radius);
		System.out.println(" Area of Circle = "+ this.calcArea());
	}
	
	public static void main(String[] args) {
		
		AreaOfCircle c1 = new AreaOfCircle(10.5);
		c1.showData();
		System.out.println("End of the Program !");

	}

}
