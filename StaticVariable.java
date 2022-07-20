package javabasics;

public class StaticVariable {
	 
	int a, b;
	static int c = 20;
	
	public StaticVariable()
	{
		a = 10;
		b= 20;
	}
	public static void modify()
	{
		c = 40;
	}
	public StaticVariable(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void show()
	{
		System.out.println(" a = " + a+ "\t b =" +b + "\t c =" + c);
	}
	
	public static void main(String [] args)
	{
		StaticVariable.modify();
		
		StaticVariable obj1 = new StaticVariable();
		StaticVariable obj2 = new StaticVariable(5,7);
		StaticVariable obj3 = new StaticVariable(100,200);
		
		obj1.show();
		obj2.show();
		obj3.show();
		
	}

}
