package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// Crear 3 setters para dar placa, 

public class App 
{
    
    public static void main( String[] args ) throws Exception
    {   
        //Fase 1
        /*Scanner input = new Scanner(System.in);
    
        
        System.out.println("Input plate number: ");
        String plate = input.nextLine();
        System.out.println("Input brand name: ");
        String brand = input.nextLine();
        System.out.println("Input vehicle color: ");
        String color = input.nextLine();*/
        
        Car ford = new Car("2345KJ", "Ford", "Red");
        Bike decat = new Bike("2345KJ", "Decat", "Red");
        

        /*
        System.out.println("Input wheel brand: ");
        String wheelBrand = input.nextLine();
        
        System.out.println("Input wheel diameter in decimals: ");
        double wheelDiameter = input.nextDouble();*/

        Wheel wheel = new Wheel("Ford", 2.2);
        
        List<Wheel> wheelsInput = new ArrayList<Wheel>();
        
        wheelsInput.add(wheel);
        wheelsInput.add(wheel);

        ford.addWheels(wheelsInput, wheelsInput);
        
        
        
    }
}
