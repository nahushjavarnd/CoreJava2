package com.app.java8.STREM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.*;

import com.app.java8.functionalinterface.Student;

import sun. applet.Main;
public class stremClass {

	//Streams can be defined as a sequences of elements from a source which support data processing operations. You can treat streams as operations on data.
	// with Java 8 Streams API to write more complex data processing operations with much of ease.

//Streams are not the data structures
//	Streams doesn’t store the data. You can’t add or remove elements from streams. Hence, they are not the data structures. They are the just operations on data.
	
//Stream Consumes a data source
//	Stream consumes a source, performs operations on it and produces the result. Source may be a collection or an array or an I/O resource. Remember, stream doesn’t modify the source.
	
//  Intermediate And Terminal Operations
	
// The operations which return stream themselves are called intermediate operations. For example – filter(), distinct(), sorted() etc.
// The operations which return other than stream are called terminal operations. count(). min(), max() are some terminal operations.
	
	
	
//Parallel Execution
//	To gain the performance while processing the large amount of data, you have to process it in parallel and use multi core architectures. 
//	Java 8 Streams can be processed in parallel without writing any multi threaded code. 
	
	public static void main (String[] arg) {
	
	
	
	List<String> names = new ArrayList<>();
    
	names.add("David");
	         
	names.add("Johnson");
	         
	names.add("Samontika");
	         
	names.add("Brijesh");
	         
	names.add("John"); 
	         
	//Normal Execution
	         
	names.stream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
	         
	//Parallel Execution
	         
	names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
	
	
	System.out.println("=============================================================================================================================");
	
	// Streams are traversable only once
	
	List<String> nameList = Arrays.asList("Dinesh", "Ross", "Kagiso", "Steyn");
	
	Stream<String> stream = nameList.stream();
	

			
	stream.forEach(System.out::println);
			// apn ekdach loop mashe pass kru shkto
//	stream.forEach(System.out::println); 
	
	System.out.println("=============================================================================================================================");
	
//  Short Circuiting Operations
	
//	Short circuiting operations are the operations which don’t need the whole stream to be processed to produce a result.
//  For example – findFirst(), findAny(), limit() etc.
	

// empty() : Creates an empty stream
	
System.out.println("=============================================================================================================================");
	Stream<Student> emptyStream = Stream.empty();
    
	System.out.println(emptyStream.count());
	         
	//Output : 0
System.out.println("=============================================================================================================================");	
	Stream<Student> singleElementStream = Stream.of(new Student());
    
	System.out.println(singleElementStream.count());
	
System.out.println("=============================================================================================================================");
	Stream<Integer> streamOfNumbers = Stream.of(7, 2, 6, 9, 4, 3, 1);
    
	System.out.println(streamOfNumbers.count());
	
System.out.println("=============================================================================================================================");
	
	names.stream().forEach(System.out::println);
System.out.println("=============================================================================================================================");


//Selecting names containing more than 5 characters


names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);

System.out.println("=============================================================================================================================");

//Selecting only unique names

names.stream().distinct().forEach(System.out::println);

System.out.println("=============================================================================================================================");

//Selecting first 4 names

names.stream().limit(4).forEach(System.out::println);

System.out.println("=============================================================================================================================");

//Skipping first 4 names

names.stream().skip(4).forEach(System.out::println);

System.out.println("=============================================================================================================================");

//Returns length of each name
names.stream().map(String::length).forEach(System.out::println);

//Sorting the names according to natural order

names.stream().sorted().forEach(System.out::println);

System.out.println("=============================================================================================================================");

//Sorting the names according to their length

names.stream().sorted((String name1, String name2) -> name1.length() - name2.length()).forEach(System.out::println);

System.out.println("=============================================================================================================================");

//What It Does? : This method performs reduction operation on elements of a stream using initial value and binary operation.

int sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce(0, (a, b) -> a+b);

System.out.println("=============================================================================================================================");

OptionalInt sum1 = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce((a, b) -> a+b);


System.out.println("=============================================================================================================================");

OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();

//Output : OptionalInt[1]

//Here, min() of IntStream will be used as we are passing an array of ints


System.out.println("=============================================================================================================================");

OptionalInt max = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).max();

//Output : OptionalInt[9]

//Here, max() of IntStream will be used as we are passing an array of ints

System.out.println("=============================================================================================================================");

//Storing first 3 names in an array

Object[] streamArray = names.stream().limit(3).toArray();

System.out.println(Arrays.toString(streamArray));

System.out.println("=============================================================================================================================");

Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);


System.out.println("=============================================================================================================================");


names.stream()
.filter(name -> name.length() > 5)
.peek(e -> System.out.println("Filtered Name :"+e))
.map(String::toUpperCase)
.peek(e -> System.out.println("Mapped Name :"+e))
.toArray();


System.out.println("=============================================================================================================================");


System.out.println("=============================================================================================================================");
System.out.println("=============================================================================================================================");

System.out.println("=============================================================================================================================");



	}
}
