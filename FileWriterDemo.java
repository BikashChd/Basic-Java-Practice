package javabasics;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		
		FileWriter fwr = new FileWriter("E:\\file2.txt");
		
		String str = " This is FileWriter class demo !!!";
		fwr.write(str);
		
//		for(int i = 0;i<str.length();i++)
//		{
//			 fwr.write(str.charAt(i));
//		}
//		
		fwr.close();
		System.out.println("successfully completed.");
		
		
		
	}

}
