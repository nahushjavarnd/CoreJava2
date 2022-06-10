package com.app.java8.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Objects;

import com.app.java8.functionalinterface.Student;;
public class Functionalinterface {

	
//	Functional interfaces are the interfaces which has exactly one abstract method. They may have any number of default methods but must have only one abstract method. 
//	Functional interfaces provide only one functionality to implement.
	public static void main(String[] args) {
	
	
	List<Student> listOfStudents = new ArrayList<Student>();
    
	
	listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));
	         
	listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));
	         
	listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));
	         
	listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));
	         
	listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));
	         
	listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));
	         
	listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));
	         
	listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));
	         
	listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));
	         
	listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));
	
	
	
	System.out.println("========================================================================================================================================== ");	
	
	
	
	
	Predicate<Student> mathematicsPredicate = (Student student) ->student.getSpecialization().equals("Mathematics");
	List<Student> mathematicsStudents = new ArrayList<Student>();

	for (Student student : listOfStudents) 
	{
	    if (mathematicsPredicate.test(student)) 
	    {
	        mathematicsStudents.add(student);
	        
	        
	        
	        System.out.println(student);
	        
	    }
	   
	}
	
	
	System.out.println("========================================================================================================================================== ");
	//For example, displaying all students with their percentage.
// Lambda expression implementing Consumer : Displaying all students with their percentage
	
	
	Consumer<Student> percentageConsumer = (Student student) -> { System.out.println(student.getName()+" : "+student.getPercentage()); };
         
for (Student student : listOfStudents) 
{
    percentageConsumer.accept(student);
    System.out.println(student);
}
	
System.out.println("========================================================================================================================================== ");

//For example, extracting only the names from listOfStudents.

// Lambda expression implementing Function : Extracting only the names of all students


Function<Student, String> nameFunction = (Student Student) -> Student.getName();
         
List<String> studentNames = new ArrayList<String>();
         
for (Student student : listOfStudents) 
{
    studentNames.add(nameFunction.apply(student));
    
    System.out.println(student);
}

System.out.println(" ========================================================================================================================================== ");

// Lambda expression implementing Supplier : Creating a new Student

Supplier<Student> studentSupplier = () -> new Student(111111, "New Student", 92.9, "Java 8");

listOfStudents.add(studentSupplier.get());

System.out.println(listOfStudents);


System.out.println(" ========================================================================================================================================== ");

	
	}
	
	
}
