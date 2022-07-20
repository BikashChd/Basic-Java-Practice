package javabasics;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;


public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("E:\\demofile.txt");
		FileWriter fw =  new FileWriter(f, true);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		
		fw.write(name);
		fw.write("\n This is demo file contents");
		fw.write("\n Thank you.");
		
		fw.close();
		scan.close();
		System.out.println("Successfully written to file.");
	}

}
