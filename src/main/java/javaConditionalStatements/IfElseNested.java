package javaConditionalStatements;

import java.util.Scanner;

public class IfElseNested {

	// The nested if statement represents the if block within another if block.
	// Here, the inner if block condition executes only when outer if block condition is true.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your age");
		int age = sc.nextInt();

		System.out.println("Please enter your weight");
		int weight = sc.nextInt();


		if (age >= 18)
		{
			if (weight > 50) 
			{
				System.out.println("You are eligible to donate blood");
			} 
			else 
			{
				System.out.println("You are not eligible to donate blood");
			}
		} 
		else 
		{
			System.out.println("Age must be greater than 18");
		}
		sc.close();
	}

}
