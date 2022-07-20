package javabasics;

public class Rectangle extends Figure{
	
	Rectangle(double length, double breadth)
	{
		super(length, breadth);
	}
	
	public double findArea()
	{
		return dim1 * dim2;
	}

}
