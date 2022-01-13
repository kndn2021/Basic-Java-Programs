package javaDataTypes;

public class WrapperClass {

	public static void main(String[] args) {

		String number = "4320";
		
		int newNumber = Integer.parseInt(number);
		long numberNew = Long.parseLong(number);
		
		System.out.println(numberNew);
		System.out.println("The number is : " +newNumber);
		
	}

}
