package javabasics;
import java.io.File;


public class FileOperation2 {

	
	public static void main(String [] args)
	{
		File f = new File("E:\\demofile.txt");
		
        if(f.exists())
        {
        	System.out.println(" file name: " + f.getName());
        	System.out.println(" Absolute path of the file: " + f.getAbsolutePath());
        	System.out.println(" file size in bytes: " + f.length());
        	System.out.println(" can write: " + f.canWrite());
        	System.out.println(" File deleted: " + f.delete());
        	
        }
        else
        	System.out.println(" File doesnot exit.");
	}
}
