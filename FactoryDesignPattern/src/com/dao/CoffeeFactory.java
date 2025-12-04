package com.dao;

public class CoffeeFactory {
	
	public static Coffee getCoffee(String type) {
		
		switch(type.toLowerCase()) {
		
		case "latte" : return new Latte();
		case "expresso" : return new Expresso();
		case "cappuccino" : return new Cappaccino();
		
		default : throw new IllegalArgumentException("Coffee Type Not Availabe");
		
		
		}
	}

}