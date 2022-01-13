package javaOops;

public class ClassMethodObject {

/*	ClassName : ClassMethodObject
	Class it is group of objects which have different properties.
	It is template or blueprint which creates the object.
	it is not a real world entity. Thats why it is not occuping memory.
*/
	
/*	ObjectName : ClassMethodObject
	Object it is instance of the class
	it is a real world entity. Thats why it is occuping memory.
	Each object is having its identity=name of the object, state=variable, behaviour=method.
*/
	
//	e.g = Animal class having Dog object which state is color and age and behaviour is run() and bark()
	
	String colour = "White";   // State
	int age = 5;		
	
	public static void main(String[] args) {

//      Declaration objectName = newInstantiation initialization(list of parameters)
		ClassMethodObject cm = new ClassMethodObject();
		cm.run();		
	}
	
	public void run()   // Behaviour
	{
		System.out.println(colour);
		System.out.println(age);
	}

}
