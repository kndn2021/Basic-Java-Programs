package javaException;

public class ExceptionNotHandleWithCatch {

	public static void main(String[] args) {

		nullPointer();
	}

// Exception Rise but Not Handled by the catch block	
	public static void nullPointer()
	{
		
		try{
			int a=50, b=0,c;
			c = a/b;
			System.out.println(c);
		}
		catch(NullPointerException e)
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
