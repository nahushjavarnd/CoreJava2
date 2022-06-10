package com.app.abstractions;

public class Cat extends Animal{

	@Override
	void soundOfAnimal() { // is implemented
		System.out.println("Meoh Meoh"  );
		
		//This class must implement second abstract method also, otherwise, this class has to be declared as abstract
		
	}

	@Override
	void hightOfAnimals() { // is implemented
		System.out.println("2 ft");
		
	}
	
	void abstractMethod()
    {
        System.out.println("&quot;Abstract Method Implemented&quot;  from class Cat       &       //Concrete Method");
    }

}
