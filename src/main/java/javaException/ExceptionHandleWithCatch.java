package javaException;

public class ExceptionHandleWithCatch {

	public static void main(String[] args) {
		handleExeption();
	}
	
	// Exception Rise And Handled by the catch block

	public static void handleExeption() {

		try 
		{
			int a = 50, b = 0, c;
			c = a / b;
			System.out.println(c);
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace();
			System.out.println("Exception is Handled.");
		} 
		finally 
		{
			System.out.println("I will executed always");
		}
	}

}
