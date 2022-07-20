package javabasics;

public class BoxWeight extends Box1
{
	int weight;
		
	public BoxWeight(int l, int b, int h, int wt)
	{
	          super(l,b,h);	  // calls super class constructor
	          weight = wt;
	          
	}
	void display()
	{
		System.out.println("Weight = " + weight);
	}

}
