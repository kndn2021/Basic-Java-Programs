package javaCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) {

//		HashMap is non synchronized. 
//		It is not-thread safe and can't be shared between many threads without proper synchronization code whereas Hashtable is synchronized. ... 
//		HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value.
		
		
		Hashtable<String, String> table = new Hashtable<String, String>();
		
		table.put("Kundan", "32");
		table.put("viraj", "45");
		table.put("Viraj", "45");
		table.put("Sanket", "35");
	//	table.put(null, "55");
		
		//To get a specific key
		System.out.println(table.get("Yash"));
		
		System.out.println(table.hashCode());  // returns the integer hash code value of the object
		System.out.println("=================");
		if(table.containsKey("Yash"))
		{
			System.out.println("Key is present");
		}else
		{
			System.out.println("Key is not present");
		}
		
		//Cloning
		
//		Clone() method in Java. Object cloning refers to creation of exact copy of an object. 
//		It creates a new instance of the class of current object and initializes all its fields with exactly the contents of the corresponding fields of this object. 
//		In Java, there is no operator to create copy of an object.
		
		Hashtable<String, String> table2 = new Hashtable<String, String>();
		
		table2 =(Hashtable)table.clone();
		System.out.println(table2);
		System.out.println("=============");
		
		//Printing the keys or values .element()
		
		Enumeration num = table2.keys();
		{
		while(num.hasMoreElements())
		{
			System.out.println(num.nextElement());
		}
		}
		
		System.out.println("========");
		
		//Printing the whole set
		Set set = table.entrySet();
		{
			System.out.println(set);
		}
		System.out.println("======");
		for(Map.Entry m:table2.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
		//To check Hashtables are same or not
		if(table.equals(table2))
		{
			System.out.println("Both tables are equal");
		}
		else
		{
			System.out.println("Both tables are unique");
		}
		System.out.println(table2.hashCode());
		

	}
	
}
