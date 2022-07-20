package javabasics;

public class Room {
	
		  private int length;           // instance variable
		     private int breadth;
		    
		  public void setData(int l, int b)   // to set or initialize data members
		   {
		          length = l;
		          breadth = b;
		   }

		  public int findArea()   // to calculate area and return the result
		 { 
		        int a;
		        a = length * breadth;
		       return a;       
		}

		public void showData()   // displays the data members
		{
		      System.out.println(" Length = " + length);
		      System.out.println(" Breadth = " + breadth);              
		}

		public static void main( String [] args)
		{
		       Room      room1 = new Room( );

		       room1.setData(10,8);    // calling setData() method 
		       room1.showData();   // showing the data in the object
		       int area = room1.findArea();
		       System.out.println(" Area of Room = " + area);
		}

		
	}

