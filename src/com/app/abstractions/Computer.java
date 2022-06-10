package com.app.abstractions;

public abstract class Computer {
	
	void methodOne()
    {
        //Concrete Method
    }
 
    void methodTwo()
    {
        //Concrete Method
    }
    
    //It is not compulsory that abstract class must have abstract methods. It may or may not have abstract methods. 
    
    
    
    Computer()
    {
        //First Constructor
    }
 
    Computer(int i)
    {
        //Second Constructor
    }
    
//    Inside abstract class, we can keep any number of constructors. If you are not keeping any constructors,
//    then compiler will keep default constructor.

    
    
//    private abstract void abstractMethodOne();
    //Compile time error, abstract method can not be private.
    
    
  //  abstract int i;
    //Compile time error, field can not be abstract
 
 //   abstract AbstractClass()
    {
        //Compile time error, constructor can not be abstract
    }
    
    
  //  static abstract void abstractMethod();
    //Compile time error, abstract methods can not be static  
}
