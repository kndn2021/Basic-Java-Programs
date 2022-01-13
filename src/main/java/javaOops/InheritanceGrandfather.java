package javaOops;

public class InheritanceGrandfather {

//	interface is only list of variables and methods without body

//It's mostly used for solving the multiple inheritance problem in java.
//If new to java, the inheritance problem is that each class in java can have only one parent (master class). 
//So in example, a dog-class is a sub-class of an animal class. So we declare it as  dog extends animal. 
//Now out dog has all the properties and methods that the animal class has. But what if we want to treat our dog as something else at the same time? Say, a pet?
//Then we write a pet interface. And now we declare our dog as dog extends animal implements pet. 
//Now our dog can have methods and variables from both the animal class and the pet interface.


//Notes on Interfaces:
//Like abstract classes, interfaces cannot be used to create objects (in the example above, it is not possible to create an "Animal" object in the MyMainClass)
//Interface methods do not have a body - the body is provided by the "implement" class
//On implementation of an interface, you must override all of its methods
//Interface methods are by default abstract and public
//Interface attributes are by default public, static and final
//An interface cannot contain a constructor (as it cannot be used to create objects)

//Why And When To Use Interfaces?
//1) To achieve security - hide certain details and only show the important details of an object (interface).

//2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). 
//However, it can be achieved with interfaces, because the class can implement multiple interfaces. 

//Note: To implement multiple interfaces, separate them with a comma (see example below).
//class DemoClass implements FirstInterface, SecondInterface 
	
	public static void main(String[] args) {
		InheritanceChild ic = new InheritanceChild();
		
		ic.childDetails();
		ic.fatherDetails();
		
	}

}
