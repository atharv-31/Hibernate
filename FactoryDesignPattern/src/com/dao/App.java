package com.dao;

import com.Coffee;
public class App {
	public static void main(String[] args) {
		Coffee coffee=CoffeeFactory.getCoffee("Latte");
		
		Coffee.brew();
	}

}
