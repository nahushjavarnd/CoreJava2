package com.app.Collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class ArrayLists {
	
	public static void main(String[] args)
    {
        //ArrayList with no size defined
 
        ArrayList<Integer> list9 = new ArrayList<>();
 
        //Adding elements to ArrayList
 
        list9.add(10);
 
        list9.add(20);
 
        list9.add(30);
 
        list9.add(40);
 
        System.out.println(list9.size());     //Output : 4
 
        //Removing an element at index 0
 
        list9.remove(0);
 
        System.out.println(list9.size());    //Output : 3
        
      //Retrieving element at index 2
        
        System.out.println(list9.get(2)); 
        
      //Setting value of element at index 2
        
        list9.set(2, 2222);
 
        System.out.println(list9);
        
      //Inserting element at index 1
        
        list9.add(1, 1111);
 
        System.out.println(list9);  
      //Removing element from index 3
        
        list9.remove(3);
 
        System.out.println(list9);

        
        //ArrayList can have any number of null elements.
	
	ArrayList<Integer> list1 = new ArrayList<>();
	 
    //Adding elements to ArrayList

    list1.add(100);

    list1.add(null);

    list1.add(2000);

    list1.add(null);

    list1.add(null);

    //ArrayList having 3 null elements

    System.out.println(list1);     //Output : [100, null, 2000, null, null]
    
    
    //ArrayList can have duplicate elements.

    
    ArrayList<Integer> list11 = new ArrayList<>();
    
    //Adding elements to ArrayList

    list11.add(100);

    list11.add(100);

    list11.add(100);

    list11.add(100);

    //ArrayList having 4 duplicate elements

    System.out.println(list11);     //Output : [100, 100, 100, 100]
    
    
 //   ArrayList is not synchronized. That means, multiple threads can use same ArrayList simultaneously.
 //   If you know the element, you can retrieve the position of that element.

    String[] namesArray = new String[1000];
    long startTime = System.currentTimeMillis();
    
    for (int i = 0; i < namesArray.length; i++)
    {
        namesArray[i] = "Name"+i;
    }
    long endTime = System.currentTimeMillis();          
    
    System.out.println("Time taken by Array : "+(endTime - startTime)+"ms");

    ArrayList<String> nameList = new ArrayList<String>();     

    startTime = System.currentTimeMillis();

    for (int i = 0; i <= 1000; i++)
    {
        nameList.add("Name"+i);
    }

    endTime = System.currentTimeMillis();

    System.out.println("Time taken by ArrayList : "+(endTime-startTime)+"ms");
    
    
    ArrayList<String> list = new ArrayList<String>();
    
    list.add("ONE");
     
    list.add("TWO");
     
    list.add("THREE");
     
    list.add("FOUR");
    
    
    ListIterator iterator = list.listIterator();
    
    System.out.println("Elements in forward direction");
     
    while (iterator.hasNext())
    {
        System.out.println(iterator.next());
    }
     
    System.out.println("Elements in backward direction");
     
    while (iterator.hasPrevious())
    {
        System.out.println(iterator.previous());
    }
    
    //Now 'list' can hold 20 elements.

  	 list.ensureCapacity(20);
  	 
  	list.trimToSize();
    
    
	
	//Sorting the list in the reverse order
	
	Collections.sort(list, Collections.reverseOrder());
	
	System.out.println("Reverse Order");
	
	System.out.println(list);
	//Output : Size Of ArrayList
	System.out.println(list.size());
	
	
	//find out whether the given ArrayList is empty or not?
	
	//Checking whether list conatins 'null'
	
	System.out.println(list1.contains(null));
	
	System.out.println(list.indexOf("THREE"));
	
	System.out.println(list.lastIndexOf("ONE"));
	
	System.out.println(list.get(2));
	
	list.set(3, "FIVE");
	System.out.println(list);
	
	
	
	 String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
	 
	 // one way
	 ArrayList<String> list111 = new ArrayList<String>(Arrays.asList(array));
	 // second way
	 Collections.addAll(list111, array);
	 
	 System.out.println(list111);
	 
	 
	 Vector<Integer> vector = new Vector<Integer>(3);
	 
	 System.out.println(vector.capacity());
	 
	 vector.add(10);
	 
     vector.add(20);

     vector.add(30);

     vector.add(40);

     //again Printing Current Capacity of Vector

     System.out.println(vector.capacity());  
	
	//You can traverse the vector using Enumeration object.
     // Vector class has a method called elements() which returns an Enumeration object consisting of all elements of Vector.
	
     Enumeration<Integer> en = vector.elements();
     
     //traversing elements of Vector using Enumeration

     while (en.hasMoreElements())
     {
         System.out.println(en.nextElement());
     }
     
     System.out.println("first"+vector.firstElement());     //Output : 10
     
     //Getting last element

     System.out.println("last "+vector.lastElement());      //Output : 40
     
     
    }

	
	// DIFFRANCE BETWEEN VECTOR AND ARRAYLIST
  
//	Performance
//	ArrayList has better performance compared to Vector. It is because, Vector class is synchronized.
//	It makes the threads to wait for object lock to enter into vector object. 
//	Where as ArrayList class is not synchronized. Threads need not to wait for object lock to access ArrayList object.
//	This makes ArrayList faster than the Vector class.
	
	//Capacity Increment
//	Whenever the size of the ArrayList exceeds it’s capacity, the capacity is increased by half of the current capacity.
//	Where as in case of Vector, the capacity is increased by Capacity Increment passed while creating the Vector object. 
//	If Capacity increment is not passed, capacity will be doubled automatically when the size exceeds it’s capacity. 
	
	// Size
	 
//	 You can manually change the current size of the vector. Vector class has a method called setSize(). 
//	 Using this method, you can change the current size of the vector. 
//	 But in case of ArrayList, you can’t change the current size manually. It doesn’t have methods which alter it’s size. 
//	 The size of the ArrayList will be changed only when you add or delete it’s elements.
	
//	 Traversing The Elements.
//	 
//	 ArrayList elements can be traversed using Iterator, ListIterator and using either normal or
//	 advanced for loop. But, vector elements can be traversed using Enumeration.
//	 
//	 
//	 Searching The Elements.
//	 In ArrayList, you have to start searching for a particular element from the beginning of an Arralist. 
//	 But in the Vector, you can start searching for a particular element from a particular position in a vector.
//}
