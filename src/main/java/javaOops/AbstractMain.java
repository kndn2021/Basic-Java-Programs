package javaOops;

public class AbstractMain {

	public static void main(String[] args) {
		
//	    abstract class are bunch of variables and methods with body that can be use to create other classes
//	    there is abstract method and implemented method in abstract class
		
		AbstractChild ac = new AbstractChild();
		
		ac.welcome();
		ac.numberLogic();
		ac.prepaid();
		ac.postpaid();
		
	}

}
