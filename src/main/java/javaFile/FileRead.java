package javaFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	static String file = "C:\\Users\\Bhushan\\Desktop\\kundan.txt";
	
	public static void main(String[] args) throws FileNotFoundException {

//		File fileReader = new File(file);
//		FileReader fileReader = new FileReader(file);  // Filereader reading streams of characters
		FileInputStream fileReader = new FileInputStream(file);	 //For reading stream of raw bytes such as image data

		Scanner sc = new Scanner(fileReader);

		while(sc.hasNext())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
