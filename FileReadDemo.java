package javabasics;

import java.util.Scanner;
import java.io.*;

public class FileReadDemo {

	public static void main(String[] args) throws IOException{
		
		File f = new File("E:\\demofile.txt");
		
		Scanner scan = new Scanner(f);
		
		while(scan.hasNextLine()) {
			String str = scan.nextLine();
			System.out.println(str);
			}
	      scan.close();
	      
	}

}
