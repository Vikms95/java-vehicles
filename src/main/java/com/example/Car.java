package com.example;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) {
		super(plate, brand, color);
		
		setPlate(plate);
		this.brand = brand;
		this.color = color;
	}
}
