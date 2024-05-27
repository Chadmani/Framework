package org.collections.com;

import java.util.LinkedList;

public class LinkedListTest {
	
	public void LinkedListExample()
	{
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(2);
		linkedlist.add(3);
		linkedlist.add(4);
		linkedlist.add(52);
		
		
		System.out.println("Linked List :"+ linkedlist);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTest linktest = new LinkedListTest();
		linktest.LinkedListExample();
		

	}

}
