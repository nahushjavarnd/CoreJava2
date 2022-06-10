package com.app.java8.interfaceChanges;

interface InterfaceTwo extends InterfaceOne {

	@Override
    default void anyMethod() 
    {
        System.out.println("Hi... From Interface Two");
    }
}
