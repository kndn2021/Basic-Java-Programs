package javaFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public static void main(String[] args) throws IOException {

		String path ="C:\\Users\\Bhushan\\eclipse-workspace\\BasicJava\\src\\main\\java\\javaFile\\kundan.properties";

		FileInputStream fi = new FileInputStream(path);
		Properties pro = new Properties();
		
		pro.load(fi);
		
		System.out.println(pro.getProperty("Username"));
		System.out.println(pro.getProperty("Password"));
		
	}

}
