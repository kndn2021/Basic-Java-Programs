package javaLoops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to print a series");
		int number = sc.nextInt();
		
		System.out.println("The Series is : ");
		while(i<=number)
		{
			System.out.println(i);
			i++;
		}
		
		sc.close();
	}

}
