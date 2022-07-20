package javabasics;

public class Faculty extends Person{
	
	String department;
	double salary;
	
	Faculty(String name, String address, String phone, String dept, double sal)
	{
		super(name, address, phone);
		department = dept;
		salary = sal;
	}
	
	public void displayData()
	{
		System.out.println(" Faculty Details: ");
		System.out.println("Name:  " + name );
		System.out.println("Address:  "+ address);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
	}
	
}
