package com.app;

import com.app.CarShop;

import java.util.Scanner;

public class CarShopMain {
	

		
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner(System.in); 
			System.out.println("\n_______________________________________________________________");
			System.out.println("\n================***  CAR SHOP  ***=====================");
			System.out.println("hi, Welcome to the car shop");
			System.out.println("\n_______________________________________________________________");

			System.out.println("Enter Car Details : ");
			System.out.println("How many Car Details do You want to add");
			int no = sc.nextInt();
			CarShop[] cs = new CarShop[no]; 
			
			for (int i = 0; i < no; i++) {
				cs[i] = new CarShop();
				System.out.print("\nEnter the speed of Car : ");
				cs[i].setSpeed(sc.nextInt());
				System.out.print("Enter the Type of Car : ");
				cs[i].setCar_type(sc.next());
				System.out.print("Enter the Owner of Car : ");
				cs[i].setCar_owner(sc.next());
				System.out.print("Enter the Staus of Car (sold/unsold) : ");
				cs[i].setCar_status(sc.next());	
			}
			sc.close();
			System.out.println("\n=================***  CAR DETAILS  ***===================");
			System.out.println("_________________________________________________________________");
			System.out.println("\n|  Car Type\t| Car Speed\t| Car Owner\t| Car Status\t|");
			System.out.println("_________________________________________________________________");
			
			for (int i = 0; i < cs.length; i++ ) {
				System.out.print("\n|"+cs[i].getCar_type()+"\t\t|   "+cs[i].getSpeed()+"\t\t|"+cs[i].getCar_owner()+"\t\t|   "+cs[i].getCar_status()+"\t|");
			}
			System.out.println("\n_________________________________________________________________");
			
			statusCalcultion(cs);
		}
		
//		method for calculate the number of cars sold by the car shop.
		public static void statusCalcultion(CarShop[] cs) {
			
			int sold = 0;  
			int unsold = 0;  

			for (int i = 0; i < cs.length ; i++ ) {
				if(cs[i].getCar_status().equals("sold")) {
					sold++;
				} 
				else {
					unsold++;
				}
			}
			System.out.println("\n\nTotal Number of cars = "+cs.length+"\nNumber of Car Sold   = "+sold+"\nNumber of Car UnSold = "+unsold);
				
		}
		
	}
