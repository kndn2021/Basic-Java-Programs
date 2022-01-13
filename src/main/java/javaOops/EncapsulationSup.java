package javaOops;

import java.util.Scanner;

public class EncapsulationSup {

//	Setting variables and classes into methods are nothing but encapsulation
//	using two methods i.e set and get/retrieve
//	Main reason for encapsulation is that user in main method can't give invalid input to data member
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the name : ");
		String newName = sc.next().toString();
		
		System.out.print("Please enter the age : ");
		int newAge = sc.nextInt();
		
		EncapsulationSub sub = new EncapsulationSub();
		
		sub.setName(newName);
		sub.setAge(newAge);
		
		System.out.println("The entered name is : " +sub.getName());
		System.out.print("The entered age is : " +sub.getAge());
	}

}
