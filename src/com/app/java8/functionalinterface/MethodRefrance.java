package com.app.java8.functionalinterface;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodRefrance {
	
	public static void main(String[] args) 
    {
		
		// a) Method reference to static method
        //Calling parseInt() method using lambda
         
        Function<String, Integer> lambdaFunction = (String s) -> Integer.parseInt(s);
        System.out.println(lambdaFunction.apply("12"));
         
        //Calling parseInt() method using method reference
         
        Function<String, Integer> referenceFunction = Integer::parseInt;
        System.out.println(referenceFunction.apply("12"));
        
        // b) Method reference to instance method (ClassName::MethodName)
        
        //Calling toLowerCase() method using lambda
        
        Function<String, String> lambdaFunction1 = (String s) -> s.toLowerCase();
        System.out.println(lambdaFunction1.apply("JAVA"));
         
        //Calling toLowerCase() method using method reference
         
        Function<String, String> referenceFunction1 = String::toLowerCase;
        System.out.println(referenceFunction1.apply("JAVA"));
        
        
        
       //c) Method reference to instance method (ReferenceVariable::MethodName)
        Company c = new Company("My_Company");
        
        //Calling getName() of c using lambda
         
        Supplier<String> lambdaSupplier = () -> c.getName();
        System.out.println(lambdaSupplier.get());
         
        //Calling getName() of c using method reference
         
        Supplier<String> referenceSupplier = c::getName;
        System.out.println(referenceSupplier.get());
        
        
        // d) Constructor References
        
      //Creating objects using lambda
        
        Supplier<Company> lambdaSupplier1 = () -> new Company();
        lambdaSupplier1.get();
         
        //Creating objects using constructor references
         
        Supplier<Company> referenceSupplier1 = Company::new;
        referenceSupplier1.get();
        
        
        
        
    }

}
