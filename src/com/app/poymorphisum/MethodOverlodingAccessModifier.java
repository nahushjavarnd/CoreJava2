package com.app.poymorphisum;

public class MethodOverlodingAccessModifier {
	
//	Overloaded methods may have same access modifiers or different access modifiers. It also does not effect method overloading.


	private void methodOverloaded()
    {
        //No argument, private method
    }
 
    private int methodOverloaded(int i)
    {
        //One argument private method
        return i;
    }
 
    protected int methodOverloaded(double d)
    {
        //Protected Method
        return 0;
    }
 
    public void methodOverloaded(int i, double d)
    {
        //Public Method
    }
    
    //Overloaded methods may be static or non-static. This also does not effect method overloading.
    
    private static void methodOverloaded()
    {
        //No argument, private static method
    }
 
    private int methodOverloaded(int i)
    {
        //One argument private non-static method
        return i;
    }
 
    static int methodOverloaded(double d)
    {
        //static Method
        return 0;
    }
 
    public void methodOverloaded(int i, double d)
    {
        //Public non-static Method
    }

}
