package com.dao;

public class CoffeeFactory {
	public static Coffee getCoffee(String type) {
		
		switch(type.toLowerCase()) {
		case "latte" : return new Latte();
		case "expresso" : return new Latte();
		case "cappaccino" : return new Latte();
		}
		
		return null;
		
	}

	
}
