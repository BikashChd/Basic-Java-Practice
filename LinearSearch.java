package javabasics;
import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String [] args)
	{
		 int [] list = { 10, 2, 23 ,25, 15, 17, 33, 40,50,60};
		 int key;
		 boolean found =false;
		
	// int [] list = new int[10]; 
		
		Scanner scanner = new Scanner(System.in);
		
	/*	System.out.println("Enter 10 number: ");
		for(int i=0; i<list.length;i++)
		{ 
		      list[i] = scanner.nextInt();
		}
		*/
		System.out.println(" Enter search Item: ");
		key = scanner.nextInt();
		
		System.out.println(" The list elements are: ");
		for (int i=0;i<list.length; i++)
			System.out.print(list[i]+ "   ");
		
		// searching logic
		int i;
		for(i=0;i<list.length;i++)
		{
			if(key == list[i])
			{
				found = true;
				break;
			}
		}
		
		if(found)
			System.out.println(" \n Key = " + key + " is found at index "+ i);
		else
			System.out.println("\n Key = " + key + " is not found in the list.");
				
	}

}
