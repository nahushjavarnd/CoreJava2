package com.app.java8.STREM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import com.app.java8.functionalinterface.Student;

public class CollectorClass {
	
	
	 public static void main(String[] args) 
	    {
	        List<Integer> numbers = Arrays.asList(8, 2, 5, 7, 3, 6);
	         
	        //collect() method returning List of OddNumbers
	         
	        List<Integer> oddNumbers = numbers.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
	         
	        System.out.println(oddNumbers);
	         
	        //OUTPUT : [5, 7, 3]
	        
	     
	        
	        System.out.println("=============================================================================================================================");
	        
	        
	        List<Student> studentList = new ArrayList<Student>();
	         
	        studentList.add(new Student( 11,"Paul", 78.9, "Economics"));
	        studentList.add(new Student( 12, "Zevin", 91.2,"Computer Science"));
	        studentList.add(new Student( 13, "Harish", 83.7,"History"));
	        studentList.add(new Student( 14, "Xiano", 71.5 ,"Literature"));
	        studentList.add(new Student( 15, "Soumya", 77.5 ,"Economics"));
	        studentList.add(new Student( 16,"Asif", 89.4 , "Mathematics"));
	        studentList.add(new Student( 17, "Nihira", 84.6 , "Computer Science"));
	        studentList.add(new Student( 18, "Mitshu", 73.5,"History"));
	        studentList.add(new Student( 19,"Vijay", 92.8 , "Mathematics"));
	        studentList.add(new Student( 20, "Harry", 71.9 , "History"));
	        
	        
	        List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
	         
	        System.out.println(top3Students);
	        
	        
	    
	        System.out.println("=============================================================================================================================");	
	        
	        
	    
	    
	    }

}
