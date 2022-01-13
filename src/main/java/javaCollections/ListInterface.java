package javaCollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterface {

	public static void main(String[] args) {
	
//		ArrayList<String> set = new ArrayList<String>();
		
		LinkedList<String> set = new LinkedList<String>();
		
		set.add("Prepaid");
		set.add("Postpaid");
		set.add("Postpaid");
		set.add("Base verification");
		set.add("Neo");
		set.add("Simex");
		set.add("121 recharge");
		set.add("Prepaid MNP");
		
		for(String str : set)
		{
			System.out.println(str);
		}
		
	}

}
