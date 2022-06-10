package com.app.java8.interfaceChanges;

interface  InterfaceWithDefaultAndStaticMethod  {
	
	void abstractMethod();           //Abstract Method
    
    default void defaultMethod()
    {
        System.out.println("It is a default method");
    }
     
    static void staticMethod()
    {
        System.out.println("It is a static method");
    }

}
