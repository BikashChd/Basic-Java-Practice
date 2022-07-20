package javabasics;
import java.io.*;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bwr = new BufferedWriter(new FileWriter("E:\\file3.txt",true));
		
	    String str = " Hello this is java IO streams !! \n";
	    
	    bwr.write(str);
	    
	    bwr.close();	
	    System.out.println("success !!");
		

	}

}
