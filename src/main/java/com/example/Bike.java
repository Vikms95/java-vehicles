package com.example;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) {
		super(plate, brand, color);

		setPlate(plate);
		this.brand = brand;
		this.color = color;
	}
}


