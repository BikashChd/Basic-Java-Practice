package javabasics;
import java.io.*;

public class DataInputStreamDemo {

	public static void main(String[] args) throws IOException {
		
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\file1.txt"));
		
		System.out.println("The contents of file1: ");
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		
		dis.close();
			
	}

}
