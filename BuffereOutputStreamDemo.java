package javabasics;

import java.io.*;

public class BuffereOutputStreamDemo  {

	public static void main(String[] args) throws IOException {
		
		//FileOutputStream fout = new FileOutputStream("E:\\file3.txt");
		
		BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("E:\\file3.txt"));
		
		String str = " hello";
		byte [] b = str.getBytes();
		
		bout.write(b);
	
		bout.flush();
		bout.close();
		
		
		
		

	}

}
