package javabasics;

public class Triangle extends Figure{
	
	Triangle(double base, double height)
	{
		super(base, height);
	}
	
	public double findArea()
	{
		return (1.0/2 * dim1 * dim2);
	}

}
