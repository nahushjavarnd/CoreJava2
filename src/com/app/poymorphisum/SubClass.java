package com.app.poymorphisum;

public class SubClass extends SuperClass {

	
	void methodOfSuperClass()
    {
        //SuperClass method is overrided
        //We can keep any tasks here according to our requirements.
        System.out.println("From Sub Class");
    }
	
	//Return Type
	
	int firstMethodOfSuperClass()
    {
        //Compile time error, return type must be void not int
    }
 
    void secondMethodOfSuperClass()
    {
        //Complie time error, return type must be double not void
    }
 
    String thirdMethodOfSuperClass()
    {
        //No Compile time error,
        //return type is compatible with super class method, because
        //String is sub class of Object class
        return new String();
    }
    
    //Visibility Of Overrided method :
   // Note : Visibility goes on decreasing from public to protected to default to private members.
    // you can see overrided method how effect
    
    private void methodOfSuperClass1()
    {
        //Compile time error, can't reduce visibility of overrided method
        //here, visibility must be protected or public but not private or default
    }
    
    public void methodOfSuperClass1()
    {
        //Compile time error, can't reduce visibility of overrided method
        //here, visibility must be protected or public but not private or default
    }
	
}
