package javabasics;
import java.io.*;

public class DataOutputStreamDemo {

	public static void main(String[] args) {
		
		FileOutputStream f = null;
		DataOutputStream dos = null;
		
		try {
		f = new FileOutputStream("E:\\file1.txt");
		dos = new DataOutputStream(f);
		
		dos.writeInt(100);
		dos.writeFloat(20.5f);
		dos.writeBoolean(true);
		dos.writeDouble(400.75);
		dos.flush();
		}
		catch(IOException ioe )
		{
			ioe.printStackTrace();
		}
		finally
		{
		  try {
		   f.close();
	       dos.close();
	       System.out.println("successfully written to the file.");
		   }
		  catch(IOException e)
		  {
              System.out.println(" IO exception occurred !");
	       }
		}
   }
 }