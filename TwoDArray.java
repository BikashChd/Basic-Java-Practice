package javabasics;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int [][] mat1 = new int [2][2];
		int [][] mat2 = new int [2][2];
		int [][] mat3 = new int[2][2];
		
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter first 2 x2 matrix: ");
		for(i =0;i<mat1.length;i++)
		{
			for (j = 0;j<mat1[i].length;j++)
			{
				mat1[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("\n Enter Second 2 x2 matrix: ");
		for(i =0;i<mat2.length;i++)
		{
			for (j = 0;j<mat2[i].length;j++)
			{
				mat2[i][j]= sc.nextInt();
			}
		}
		
		// addition 
		for(i =0;i<mat2.length;i++)
		{
			for (j = 0;j<mat2[i].length;j++)
			{
				mat3[i][j]= mat1[i][j] + mat2[i][j];
			}
		}
		
		// display
		System.out.println(" Matrix 1: \n ");
		for(i =0;i<mat1.length;i++)
		{
			for (j = 0;j<mat1[i].length;j++)
			{
				System.out.print(mat1[i][j] + "   ");
			}
			System.out.println();
		}

		
		System.out.println(" Matrix 2: \n ");
		for(i =0;i<mat2.length;i++)
		{
			for (j = 0;j<mat2[i].length;j++)
			{
				System.out.print(mat2[i][j] + "   ");
			}
			System.out.println();
		}
	
	 System.out.println(" Result Matrix: \n ");
	for(i =0;i<mat3.length;i++)
	{
		for (j = 0;j<mat3[i].length;j++)
		{
			System.out.print(mat3[i][j] + "   ");
		}
		System.out.println();
	}
}
}