package javabasics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileInputSteamDemo {

	public static void main(String[] args) throws IOException {
	
		File f = new File("E:\\file1.txt");		
		FileInputStream fin = new FileInputStream(f);
		FileOutputStream fout = new FileOutputStream("E:\\file2.txt", true);
		
		int i = fin.read();
		while(i != -1) {
			
			System.out.print((char)i);
			fout.write(i);
			i = fin.read();
		}
		
		fin.close();
		fout.close();
		
	}

}
