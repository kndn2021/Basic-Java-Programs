package javaConditionalStatements;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your browser name");
		String browserName = sc.next();

		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Chrome browser will be initialized...");
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.out.println("IE browser will be initialized...");
		}
		
		else if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.out.println("FireFox browser will be initialized...");
		}
		
		else
		{
			System.out.println("No browser found...");
		}
		sc.close();
		main(args);
		
	}

}
