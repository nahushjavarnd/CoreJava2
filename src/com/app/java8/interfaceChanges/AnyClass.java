package com.app.java8.interfaceChanges;

public class AnyClass implements InterfaceWithDefaultAndStaticMethod
{
    @Override
    public void abstractMethod() 
    {
        System.out.println("Abstract Method implemented");
    }
     
    //No need to implement defaultMethod()
     
    //Can't implement staticMethod()
}
//2) Why Static Methods?
//Do you know? Collection and Collections.
//
//Collection is an interface and Collections is an utility class containing only static methods which operate on Collection objects.
//
//Java API developers have followed this pattern of supplying an utility class along with an interface to perform basic operations on such objects.
//But from Java 8, they have break this pattern by introducing static methods to interfaces.
//
//With the introduction of static methods to interface, such utility classes will disappear and methods to
//perform basic operations will be kept as static methods in interface itself.