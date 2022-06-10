package com.app.poymorphisum;

//Compiler checks method signature for duplicate methods or for method overloading.
//method signature consist of three things, 1) Method Name   2) Number Of Arguments   3) Types of arguments.

//If these three things are same for any two methods in a class, then compiler gives duplicate method error.

public class MethodOverlodind {
	
	void methodOverloaded()
    {
        //No argument method
    }
 
    void methodOverloaded(int i)
    {
        //One argument is passed
    }
 
    void methodOverloaded(double d)
    {
        //One argument is passed but type of argument is different
    }
 
    void methodOverloaded(int x, double d)
    {
        //Two argument method
        //Method signature of this method is methodOverloaded(int, double)
    }
 
    void methodOverloaded(double k, int i)
    {
        //It is also two argument method but type of arguments changes
        //Method signature of this method is methodOverloaded(double, int)
    }
 
    void methodOverloaded(double o, int m)
    {
                //It has same method signature methodOverloaded(double, int) as of above method
        //So, it is a Duplicate method, You will get compile time error here
    }
 
    void differentMethod()
    {
        //Different method
    }

}
