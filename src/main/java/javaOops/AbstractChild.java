package javaOops;

import java.util.Scanner;

public class AbstractChild extends AbstractClass implements InterfaceMain {
	
	private String number;

	public void numberLogic()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 10 digit number");
		String newNumber = sc.next();
		this.number = newNumber;
		
		System.out.println("The entered number is : " +number);
		sc.close();
	}
	
	public void prepaid()
	{
		System.out.println("This is prepaid method of interface");
	}
	
	public void postpaid()
	{
		System.out.println("This is postpaid method of interface");
	}
	
	
}
