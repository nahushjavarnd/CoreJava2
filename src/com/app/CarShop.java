package com.app;

import java.util.List;


public class CarShop {
	
	// Step to Achieve Encapsulation
	// Wrapping of data in to single unite
	
	private int speed = 0;
	private String car_owner;  // Step 1 Data Hiding   (veriable of class is Private) 
	private String car_type ;
	private String car_status;

	
	// Step2 Provide public setter getter to view veribale value
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCar_owner() {
		return car_owner;
	}
	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}
	public String getCar_type() {
		return car_type;
	}
	public void setCar_type(String car_type) {
		this.car_type = car_type;
	}
	public String getCar_status() {
		return car_status;
	}
	public void setCar_status(String car_status) {
		this.car_status = car_status;
	}
	
	
}
