package com.app.java8;

@FunctionalInterface
public interface Comparator {
	
	    int compare(T o1, T o2);       //Only one abstract method
	
}

//Lambda expressions are used where an instance of functional interface is expected.
//Functional interface is an interface which has only one abstract method. Functional interfaces can have any number of default methods.
//But, they must have only one abstract method. Comparator, Runnable AndActionListener are some examples of functional interfaces.