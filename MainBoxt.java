package javabasics;

public class MainBoxt {

	public static void main(String [] args)
	{
		BoxCost b1 = new BoxCost(10, 8, 5, 3, 200);
		
		b1.displayData();
		System.out.println(" Volume of the Box = " + b1.findVolume());
		
		
	}
}
