package javaCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<String>();      // showing output without insertion order and not showing duplicate element
		
//		Set<String> set = new LinkedHashSet<String>();     // showing output with insertion order and not showing duplicate element
		
		Set<String> set = new TreeSet<String>();     // showing output of element in ascending order of element
		
		set.add("Prepaid");
		set.add("Postpaid");
		set.add("Postpaid");
		set.add("Base verification");
		set.add("Neo");
		set.add("Simex");
		set.add("121 recharge");
		set.add("Prepaid MNP");
		
//		for(String str : set)
//		{
//			System.out.println(str);
//		}
		
//		Iterator<String> it = set.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
		
//		it = set.iterator();
//		it.forEachRemaining(show->{
//			System.out.println("show");
//		});
		
		set.forEach(show->{
			System.out.println(show);
		});
	}

}
