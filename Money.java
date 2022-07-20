import javax.sound.sampled.SourceDataLine;

// package javabasics;

public class Money {
	int rupee;  // instance variables
	int paisa;
	
	void setMoney(int rupee, int paisa)  // local variables
	{
	       this.rupee = rupee;
	       this.paisa = paisa;
	}
	
	void displayMoney()
	{
		System.out.println("Rupees: " + rupee + "\t Paisa: " + paisa );
	}
	
	void addMoney(Money m1, Money m2)
	{
		 this.paisa = m1.paisa + m2.paisa;  // this indicates current object
		 this.rupee = m1.rupee + m2.rupee + this.paisa/100;
		 this.paisa = this.paisa % 100;
		 
	}
	void disp(){
		System.out.println("Rupee"+rupee);
		 System.out.println("Paisa"+paisa);
	}
	
	public static void main(String[] args){
		Money m1=new Money();
		Money m2=new Money();
		Money m=new Money();
		m1.setMoney(210,50);
		m1.displayMoney();
		m2.setMoney(110,80);
		m2.displayMoney();

		m.addMoney(m1,m2);
		m.disp();

	}

}


