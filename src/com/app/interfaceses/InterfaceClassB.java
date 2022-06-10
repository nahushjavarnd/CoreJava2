package com.app.interfaceses;

interface InterfaceClassB {
	
	//By default, All methods of an interface are public and abstract.
	

    void abstractMethodOne();  //Abstract method
 
    void abstractMethodTwo();  //Abstract Method
 
        //No need to use abstract keyword,
        //by default methods are public and abstract

    static
    {
        //compile time error
        //SIB's are not allowed in interfaces
    }
 
    {
        //Here also compile time error.
        //IIB's are not allowed in interfaces
    }
 
}
