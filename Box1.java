package javabasics;

public class Box1 {
	
	int length, breadth, height;
	
	// constructor
	public Box1(int l, int b, int h)
	{
		length = l;
		breadth = b;
		height = h;
	}
	
	int findVolume()
	{
		return length * breadth * height;
	}
	
	void display()
	{
		System.out.println(" length = " + length + " \t Breadth = " + breadth + "\t height = "+ height);
	}

} //  end of the class
