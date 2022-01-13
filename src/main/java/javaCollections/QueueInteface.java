package javaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInteface {

	public static void main(String[] args) {

		Queue<String> set = new LinkedList<String>();

		set.add("Prepaid");
		set.add("Postpaid");
		set.add("Postpaid");
		set.add("Base verification");
		set.add("Neo");
		set.add("Simex");
		set.add("121 recharge");
		set.add("Prepaid MNP");

		set.remove();
		set.add("GST");

//		for (String str : set) {
//			System.out.println(str);
//		}
		
		set.forEach(show->{
			System.out.println(show);
		});

	}

}
