package javabasics;

public class Student extends Person {

	String major;
	
	Student(String name, String address, String phone, String major)
	{
		super(name, address, phone);
		this.major = major;
		
	}
	
	public void displayData()
	{
		System.out.println(" Student Details: ");
		System.out.println("Name:  " + name );
		System.out.println("Address:  "+ address);
		System.out.println("Major: " + major);
	}
	
}
