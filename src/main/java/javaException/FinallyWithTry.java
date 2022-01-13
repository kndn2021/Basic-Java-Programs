package javaException;

public class FinallyWithTry {

	public static void main(String[] args) {

		arithMetic();
	}

	// Exception does not rise
	public static void arithMetic()
	{
		try {
			int a=30, b=5, c;
			c=a/b;
			System.out.println(c);
		}
		finally
		{
			System.out.println("I will executed always");
		}
	}
	
}
