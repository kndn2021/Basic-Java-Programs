package javaLoops;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the number of rows to print Series");
//		int number = sc.nextInt();
//		
//		System.out.println("The Series is : ");
//		for(int i=1; i<=number; i++)
//		{
//			System.out.println(i);
//		}
		
		System.out.println("The alphabet series is : ");
		for(char i = 'A'; i<='Z'; i++)
		{
			System.out.println(i);
		}
		
		sc.close();
	}

}
