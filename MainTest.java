package javabasics;
import java.util.Scanner;

public class MainTest {
	public static void main(String [] args)
	{
		Money m1 = new Money();
		Money m2  = new Money();
		Money m3  = new Money();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Rupees and paisa for first object: ");
		int r = s.nextInt();
		int p = s.nextInt();
		m1.setMoney(r, p);
		
		System.out.println("Enter Rupees and paisa for second object: ");
		r = s.nextInt();
		p  =s.nextInt();
		m2.setMoney(r, p);
		
		m3.addMoney(m1, m2); // addMoney() is called by m3 passing two objects
		
		System.out.println("Money1: ");
		m1.displayMoney();
		System.out.println("Money2: ");
		m2.displayMoney();
		System.out.println("Money3: ");
		m3.displayMoney();
		
		s.close();
		
	}

}
