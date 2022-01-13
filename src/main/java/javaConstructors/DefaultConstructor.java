package javaConstructors;

public class DefaultConstructor {

	String name;
	int age;	
	
	public static void main(String[] args) {
		
		DefaultConstructor dc = new DefaultConstructor();
		
		System.out.println("The name of tester is : " +dc.name);
		System.out.println("The age of " +dc.name +" is : " +dc.age);
	}
}


/*		Constructor is a block similar to method having same name of the class name.
 * 		It does not have return type.
 * 		Applicable modifiers for constructor are default, public, private and protected.
 * 		Constructor is used to initialise the Object
 * 		i.e Animal a = new Animal();  Here new is used to create new constructor or object
 * 
 * 		3 Types of Constructor
 * 		In default constructor, Compiler(JRE) creates constructor automatically without arguments, not buy JVM
 * 		User creates contructor of current class without passing arguments is nothing but user defined constructor.
 * 		Parameter constructor is constructor in which passing parameters through object reference and storing into the reference variables.
 * */
 