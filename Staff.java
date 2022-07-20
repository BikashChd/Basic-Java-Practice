package javabasics;

public class Staff extends Person {
   
	  String post;
	
	Staff(String name, String address, String phone, String post)
	{
		super(name, address, phone);
		this.post = post;
		
	}
	
	public void displayData()
	{
		System.out.println(" Staff Details: ");
		System.out.println("Name:  " + name );
		System.out.println("Address:  "+ address);
		System.out.println("Post: " + post);
	}

}
