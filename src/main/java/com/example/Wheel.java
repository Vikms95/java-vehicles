package com.example;

public class Wheel {
	private String brand;
	private double diameter;
	private final double diameterMinAllowed = 0.4;
	private final double diameterMaxAllowed = 4;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		setWheel(diameter);
		
	}
	
	public void setWheel(double diameter) {
		if(!isWheelDiameterValid(diameter)){
			throw new IllegalArgumentException("Wheel diameter must be among 0,4 and 4! Wheel not created.");
		}else{
			this.diameter = diameter;
		}
		
	}

	public boolean isWheelDiameterValid (double inputDiameter) {
		if(inputDiameter < diameterMinAllowed || inputDiameter > diameterMaxAllowed){
			return false;
		}else{
			return true;
		}

	}
	

}
