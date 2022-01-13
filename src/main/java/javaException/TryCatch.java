package javaException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {

	public static void main(String[] args) {
		
		fileInput();
	}
	
	public static void fileInput()
	{
		try {
			
			// Risky code
			FileInputStream fi = new FileInputStream("C://kundan.txt");
		} 
		catch (FileNotFoundException e) {
			// Handle Exception
			e.printStackTrace();
		}
		
	}
	

}
