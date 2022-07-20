package javabasics;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		
		File fobj = new File("E:\\demofile.txt");
		
	    if(fobj.createNewFile())
	    {
	    	System.out.println(" File Created: " + fobj.getName());
	    }
	    else
	    {
	    	System.out.println(" File already exists.");
	    }
	    
			
		
	}

}
