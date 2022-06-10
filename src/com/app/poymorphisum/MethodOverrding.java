package com.app.poymorphisum;

public class MethodOverrding {
	
	 public static void main(String[] args)
	    {
	        SuperClass superclass = new SuperClass();
	        superclass.methodOfSuperClass();         //Output : From Super Class
	        SubClass subclass = new SubClass();
	        subclass.methodOfSuperClass();          //Output : From Sub Class
	    }

	 //Name of the overrided method must be same as in the super class. You can’t change name of the method in subclass.
}
