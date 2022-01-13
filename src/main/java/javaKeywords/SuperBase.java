package javaKeywords;

public class SuperBase extends SuperDerive {

	public SuperBase()
	{
		super();
	}
	
	public void getName(String newName)
	{
		super.name = newName;
		System.out.println(super.name);
	}

	public static void main(String[] args) {
		
		SuperBase b = new SuperBase();
		b.getName("Kundan Bhagat");
		
	}

}
