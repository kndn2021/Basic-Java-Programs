package javaFinalizeMethod;

public class FinalizeMethod {

	//The finalize() method is used just before object is destroyed and can be called just prior to object creation.
	
	public void finalize()
	{
		System.out.println("I will get called before garbage collection.");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeMethod f = new FinalizeMethod();  // Created Object of the class.
		f = null;  // Making object as null
		
		int a=50, b=10;
		int c = a + b;
		System.out.println(c);
		
		System.gc();  //Calling garbage collector which will call finalize method
		
	}

}
