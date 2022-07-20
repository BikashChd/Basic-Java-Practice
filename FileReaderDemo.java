package javabasics;
import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("E:\\file2.txt"); 
		int ch;
		
		while((ch = fr.read()) != -1)
			System.out.print((char)ch);
		fr.close();
	}

}
