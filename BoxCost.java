package javabasics;

public class BoxCost extends BoxWeight{
	
	int cost;
	
		
	public BoxCost(int l, int b, int h, int wt, int c)
	{
		super(l, b, h, wt);
		cost = c;
	}
     
	void displayData()
	{
		System.out.println(" Box Details: ");
		System.out.println(" Length = " + length + " \n Breadth = "+ breadth + " \n height = " + height);
		System.out.println(" Weight = " + weight + " \n Cost = "+ cost);
		//System.out.println(" Volume = "+ this.findVolume());
		
	}
}
