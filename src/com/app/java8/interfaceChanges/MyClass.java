package com.app.java8.interfaceChanges;

public class MyClass implements InterfaceOne, InterfaceTwo
{
	
	//Rule 2 : Select most specific interfaces than general interfaces.
//    public static void main(String[] args) 
//    {
//        new MyClass().anyMethod();
//    }
    
    //Rule 3 : InterfaceName.super.methodName()
    
    @Override
    public void anyMethod()
    {
        InterfaceOne.super.anyMethod();
    }
     
    public static void main(String[] args) 
    {
        new MyClass().anyMethod();
    }

}
