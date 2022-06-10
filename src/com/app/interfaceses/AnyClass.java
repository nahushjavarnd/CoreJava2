package com.app.interfaceses;

public class AnyClass implements InterfaceClassA {

	@Override
	public void oneMethod() {
		// TODO Auto-generated method stub
		
	}
	//Use 'implements' while implementing Interfaces
    //Don't use 'extends'

	@Override
	public void abstractMethodOne() {
		
		
        //It gives compile time error.
        //Interface methods must be implemented as public
	}

	@Override
	public void abstractMethodTwo() {
		//Following statement gives compile time error.
		InterfaceClassA.i = 10;
		//final field can not be re-assigned
	}
	
	
	
	
	//You can’t change the value of a field once they are initialized.
	//Because they are static and final. Therefore, sometimes fields are called as Constants.
}
