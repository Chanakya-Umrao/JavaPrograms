package coding_questions;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(2);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		
		LinkedList<Integer> list1 = new LinkedList<>();
		//LinkedList descendingIterator() returns an iterator that iterates over the element in reverse order.
		
		list.descendingIterator().forEachRemaining(list1::add);
		System.out.println(list1);
	}

}
