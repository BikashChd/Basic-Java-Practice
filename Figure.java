package javabasics;

 public abstract class Figure {
	
	double dim1;
	double dim2;
	
	Figure(double d1, double d2)
	{
		dim1 = d1;
		dim2 = d2;
	}
	
	public abstract double findArea();
	
	
}
