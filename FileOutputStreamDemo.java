package javabasics;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("E:\\file1.txt",true);
		int a = 120;
		fout.write(100);
		fout.write(a);
		fout.write('\n');
		fout.write(50);
		
		String str = "Hello this is java program demonstrating FileOutputStream";
		byte [] b = str.getBytes();
		fout.write(b);
		
		byte [] x = {'J', 'A', 'V', 'A'};
	    fout.write(x);	
	
		
		System.out.println("Successfully written to the file.");
		
		fout.flush();		
		fout.close();
			

	}

}
