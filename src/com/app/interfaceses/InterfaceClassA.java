package com.app.interfaceses;

interface InterfaceClassA {
	
	// interface is not class
	
	//Some Abstract methods
	abstract void oneMethod();
	
	int i = 0;      //Field
	//By default, field is public, static and final
	 
    //Following statements give compile time errors
	
	abstract void abstractMethodOne();  //abstract method
	 
    abstract void abstractMethodTwo();  //abstract method
 
//    void concreteMethod()
//    {
//        //Compile Time Error.
//        //Concrete Methods are not allowed in interface
//    }
    
    private double d = 10;
    protected long l = 15;
 
    //You can't use any other modifiers other than public, static and final
    
    
    
    //Interface can have two types of members.  1) Fields     2) Abstract Methods.
    //By default, Every field of an interface is public, static and final
    //You can’t use any other modifiers other than these three for a field of an interface.
    
    
    
    
    
    
}
