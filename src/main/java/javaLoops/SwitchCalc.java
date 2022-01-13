package javaLoops;

import java.util.Scanner;

public class SwitchCalc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Timepass Calculator");
		
		System.out.println("Please enter 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("Please enter 2nd number");
		int num2 = sc.nextInt();
		
		System.out.println("Select number of operation you want to perform" +" \n1. +  \n2. -  \n3. *  \n4. /");
		int op = sc.nextInt();
		
		switch(op)
		{
		case 1 : 
		{
			int total = num1 + num2;
			System.out.println("Addition of " +num1 +" and " +num2 +" is : " +total);
			break;
		}
		case 2 : 
		{
			int total = num1 - num2;
			System.out.println("Substraction of " +num1 +" and " +num2 +" is : " +total);
			break;
		}
		case 3 : 
		{
			int total = num1 * num2;
			System.out.println("Multiplication of " +num1 +" and " +num2 +" is : " +total);
			break;
		}
		case 4 : 
		{
			int total = num1 / num2;
			System.out.println("Division of " +num1 +" and " +num2 +" is : " +total);
		}
	}
		main(args);
		sc.close();
  }
}
