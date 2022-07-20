package javabasics;
import java.io.*;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("E:\\file3.txt");
		
		BufferedReader br = new BufferedReader( fr);
		
//		int ch;
//		while((ch = br.read()) != -1)
//			System.out.print((char)ch);
		String line = null;
		
		while((line = br.readLine()) != null)
		    System.out.println(line);
			
		
		br.close();
		fr.close();
		

	}

}
