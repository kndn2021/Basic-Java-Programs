package javaOops;

public class OverloadingCompileTime {
	
//			It is also called as Static polymorphism
//			Same method name with different parameters or signature
//			return type should be same for methods
	
// 			 number of arguments	
	
//	void add(int a)
//	{
//		System.out.println("This is 1st method");
//		System.out.println(a);
//	}
//	
//	void add(int a, int b)
//	{
//		System.out.println("This is 2nd method");
//		System.out.println(a +" " +b);
//	}

//			 Sequence of arguments
//	void add(int a, String b)
//	{
//		System.out.println("This is 1st method");
//		System.out.println(a +" " +b);
//	}
//	
//	void add(String a, int b)
//	{
//		System.out.println("This is 2nd method");
//		System.out.println(a +" " +b);
//	}
	
//			Types of arguments
	void add(Object a)
	{
		System.out.println("This is 1st method");
		System.out.println(a);
	}
	
	void add(String a)
	{
		System.out.println("This is 2nd method");
		System.out.println(a);
	}

	public static void main()
	{
		System.out.println("HI");
	}
	
	public static void main(String[] args) {

		OverloadingCompileTime ot = new OverloadingCompileTime();
//		ot.add(13);
//		ot.add(12, 13);
		
//		ot.add(12, "Bhagat");
//		ot.add("Kundan", 13);
		
		ot.add(35);
		ot.add("Kundan Bhagat");
		main();
		
		
	}

}
