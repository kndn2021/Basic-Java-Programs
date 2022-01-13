package javaCollections;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;

public class DequeTest {

	public static void main(String[] args) {


		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Kundan");
		deque.add("Raju");
		deque.add("Shyam");
		
		// it will add element at the Head/first which is declare last
		deque.push("Babu");    //This method is used to add an element at the head of the queue.
		deque.addFirst("Viraj");   //If the Deque is capacity restricted and no space is left for insertion, it returns an IllegalStateException. The function returns true on successful insertion.
		deque.offerFirst("Yash");  // This method is preferable to addFirst() method since this method does not throws an exception when the capacity of the container is full since it returns false.
		
		// it will add element at the Tail/Last which is declare last
		deque.addLast("Sanket");
		deque.offerLast("Yashoda");
		deque.offer("Kumar");     // This method is preferable to add() method since this method does not throws an exception when the capacity of the container is full since it returns false.
		
		// 	To retrieve and remove the element at the head of the deque. This method returns null if the deque is empty.
		//deque.poll();
	//	deque.pollFirst();
	//	deque.pop();
		
		// To retrieve and remove the element at the tail of the deque. This method returns null if the deque is empty.
	//	deque.pollLast();
		
		System.out.println(deque);
		
	}

}
