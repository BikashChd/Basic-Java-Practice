package javabasics;

import java.util.Scanner;

public class Box {

	//data members
	private int length;            
	private int breadth;
	private int height;
	
	// methods
	public Box()   // default constructor
	{
		length = 10;
		breadth = 5;
		height = 2;
	}
	public Box(int l, int b, int h)  //parametric contractor
	{
		length = l;
		breadth = b;
		height = h;
	}
	
	public void display()
	{
		System.out.println("Length = " + length);
		System.out.println("Breadth = " + breadth);
		System.out.println("Height = "+ height);
	}
	
	public int findVolume()
	{
		int vol = length * breadth * height;
		return vol;
	}
	
	int findSurfaceArea()
	{
		int sa = 2 * ( length * breadth + breadth * height + length * height);
		return sa;
	}
	
	
}
