package javaException;

public class FinalizeMethod {

	// We will use finalize method just for cleanup process of object
	//Garbage collector will remove unnecessory object from memory. Prior that finalize method will get call automatically.
	public void finalize()
	{
		System.out.println("All clean up process done successfully!");
	}
	
	public static void main(String[] args) {

		FinalizeMethod fm = new FinalizeMethod();
		fm = null;

		System.gc();
		
		System.out.println("Garbage collecctor is initializing..");
	}

}
