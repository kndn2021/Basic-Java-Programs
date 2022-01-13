package javaOops;

public class OverridingRunTime {
	
	
	float rateofInterest()
	{
		System.out.println("The respective banks rate of interest are : ");
		return 0f;
	}

	public static void main(String[] args) {

//	It is also callled as "Dynamic Polymorphism"		
//	Same method name with same parameters or signature
//	Method should be defines in different classes i.e. child class.
//	Simply child class methods will replace/overrides with parent class methods.
//  Return type of method may be different
//	Access modifier of child class should be high/greater than parent class 	
		
		
//  e.g lets say, there is bank class. In bank class there is rateOfInterest method which is applicable for every banks.
//      but every bank having different rateOfInterest according to their banks.
		
		OverrideSBI sbi = new OverrideSBI();
		System.out.println(sbi.rateofInterest());
		
		OverrideICICI icici = new OverrideICICI();
		System.out.println(icici.rateofInterest());
		
		OverrideAxis axis = new OverrideAxis();
		System.out.println(axis.rateofInterest());
		
	}

}
