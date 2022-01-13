package javaConstructors;

public class ParameterConstructor {

	 String name;
	 int age;
	
	ParameterConstructor(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {

		ParameterConstructor pm1 = new ParameterConstructor("Kundan Bhagat", 26);
		ParameterConstructor pm2 = new ParameterConstructor("Sanket Bhagat", 28);
		
		System.out.println(pm1.name);
		System.out.println(pm1.age);
		
		System.out.println(pm2.name);
		System.out.println(pm2.age);
	}
}
