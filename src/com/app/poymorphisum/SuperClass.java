package com.app.poymorphisum;

public class SuperClass {


    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
    
    
    //return type
    
    void firstMethodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
 
    double secondMethodOfSuperClass()
    {
        return 0.0;
    }
 
    Object thirdMethodOfSuperClass()
    {
        return new Object();
    }
    
    //The return type of the overrided method must be compatible with super class method. 
    //If super class method has primitive data type as its return type, then overrided method must have same return type in sub class also. 
    //If super class method has derived or user defined data type as its return type, then return type of sub class method must be of same type or its sub class
    
 
    
    
    //Visibility Of Overrided method :
   // You can keep same visibility or increase the visibility of overrided method 
    //but you can’t reduce the visibility of overrided methods in the subclass.
//Note : Visibility goes on decreasing from public to protected to default to private members.
    protected void methodOfSuperClass1()
    {
        System.out.println("From Super Class");
    }
}
