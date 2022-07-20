package javabasics;

import java.util.Scanner;



public class BoxMain {
	
	public static void main(String [] args)
	{
	        Box  box1;  // box1 is reference variable
	        box1 = new Box();  // object is created
	                	                
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter length, breadh and height :");
	        int l = sc.nextInt();
	        int b = sc.nextInt();
	        int h = sc.nextInt(); 
	        
	        Box box2 = new Box(l, b, h);
	        
	        box1.display();
	        int a = box1.findSurfaceArea();
	        int v = box1.findVolume();
	        
	        System.out.println("Surface Area = " + a);
	        System.out.println("Volume = " + v);
	              
	        box2.display();
	        sc.close();
	}
	

}