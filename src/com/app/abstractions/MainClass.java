package com.app.abstractions;

public class MainClass {

	public static void main(String[] args) {
		
		// Animal A = new Animal(); Can't create objects to Abstract class
		
		Cat C = new Cat();
		
		//Cat Class implements abstract method,
        //so we can create object to Cat
		C.hightOfAnimals();
		C.soundOfAnimal();
		C.abstractMethod();
		 
		Animal A = C; 
		//Cat Class object is auto-upcasted to AbsractClass (Animal Class)
		
	}

}
