package javabasics;

public class MainFigure {

	public static void main(String[] args) {
		
		
		Rectangle robj = new Rectangle(20, 15);
		Triangle tobj = new Triangle(50, 30);
		
		Figure f;
		
		f= robj;	  // reference variable of super class and object is of sub class			
		System.out.println(" Area of Rectangle = " + f.findArea());
		
		f = tobj;
		System.out.println(" Area of Triangle = " + f.findArea());
		
		

	}

}
