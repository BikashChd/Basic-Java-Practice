
public class PersonMain {

	public static void main(String [] args) 
	{
	Faculty f1 = new Faculty("Kumar ", " Kathmandu", "9851425864", " CSIT", 50000);
	Student s1 = new Student("Hari", " Surkeht", "985124587", "CSIT");
	Staff sf1 = new Staff("Pawan", "Dhanagadhi", "985412564", "clerk");
	
	f1.displayData();
	System.out.println();
	s1.displayData();
	System.out.println();
	sf1.displayData();
	
	Person p = f1;;
	p.displayData();
	}
	
		
}
