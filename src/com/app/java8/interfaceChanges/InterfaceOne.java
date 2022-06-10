package com.app.java8.interfaceChanges;

interface InterfaceOne {
	
	default void anyMethod()
    {
        System.out.println("Hi... From Interface One");
    }

}
