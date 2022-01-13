package javaKeywords;

public class UseOfThis {

		int i;
		
	public UseOfThis()
	{
		System.out.println("This constructor");
	}
	
	public void setValue(int i)
	{
		this.i=i;
	}
	
	public void getValue()
	{
		System.out.println(i);
	}
	
	public static void main(String[] args) 
	{	
		UseOfThis ut = new UseOfThis();
		ut.setValue(40);
		ut.getValue();
	}

}
