package com.example;

import java.util.ArrayList;
import java.util.List;


public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) {
		
		this.plate = plate;
		this.brand = brand;
		this.color = color;

	}

	public void setPlate(String plate){

		if(!isPlateValid(countIntegersOnString(plate)
						,countAlphabeticOnString(plate))){
			throw new IllegalArgumentException("Plate must have 4 digits and 2-3 letters! Vehicle not created!");
		}else{
			this.plate = plate;
		}
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	public int countIntegersOnString(String plate){
		int count = 0;

		for (int i = 0; i < plate.length(); i++){
			if(Character.isDigit(plate.charAt(i))){
				count++;
			}
		}
		return count;
	}
	
	public int countAlphabeticOnString(String plate){
		int count = 0;
		
		for (int i = 0; i < plate.length(); i++) {
			if(Character.isAlphabetic(plate.charAt(i))){
				count++;
			}
		}
		return count;
	}

	public boolean isPlateValid (int amountOfDigits, int amountofAlphabetic){

		if(amountOfDigits == 4 && amountofAlphabetic == 2){
			return true;

		}else{
			return false;
			
		}
	}
}
