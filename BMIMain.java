package javabasics;
import java.util.Scanner;

public class BMIMain {

	public static void main(String[] args) {
		
     float wt, ht;
     Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter weight in Kilogram: ");
     wt = scan.nextFloat();
     
     System.out.println("Enter height in meters: ");
     ht = scan.nextFloat();
     
     BIMCalculator obj1 = new BIMCalculator(wt,ht); // object will be initialized with these parameters
     
     float bmi = obj1.bmiCalc();
     System.out.println(" User Details: ");
     System.out.println("Weight = " + wt + "\n Height = " + ht);
     System.out.println("BMI value = " + bmi);
     
     if(bmi <18.5)
    	 System.out.println(" You are underweight! ");
     else if(bmi < 25)
    	 System.out.println(" You are Normal. ");
     else if(bmi < 30)
    	  System.out.println(" You are overweight. ");
     else 
    	 System.out.println("You have obesity.");
     }

}
