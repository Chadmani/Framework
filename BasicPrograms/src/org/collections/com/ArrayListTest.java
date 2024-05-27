package org.collections.com;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	
	public void ArrayListExample()
	{
		List<String> arraylist = new ArrayList<String>();
		
		arraylist.add("Benz");
		arraylist.add("BMW");
		arraylist.add("Bugatti");
		arraylist.add("Bentley");
		arraylist.add("BMW");
		
		System.out.println(arraylist);
		System.out.println(arraylist.indexOf("BMW"));
		System.out.println(arraylist.get(2));
		System.out.println(arraylist.lastIndexOf("BMW"));
		
		List <String> AnotherList = new ArrayList<String>();
		AnotherList.addAll(arraylist);
		
		System.out.println(AnotherList);
		AnotherList.clear();
		System.out.println(AnotherList);
		
		arraylist.add(null);
		System.out.println("Finding Size : "+arraylist.size());
		System.out.println(AnotherList.isEmpty());
		
		//Iteration
		
		for (String string : arraylist)
		{
			System.out.println(string);
		}
		
		for(int i=0; i<arraylist.size();i++)
		{
			System.out.println("for loop : "+arraylist.get(i));
		}
		System.out.println("--------------------------");
		
		ListIterator<String> iterator = arraylist.listIterator();
				
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		while(iterator.hasPrevious())
		{
			System.out.println(iterator.previous());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayListTest example = new ArrayListTest();
		example.ArrayListExample();
		
		

	}

}
