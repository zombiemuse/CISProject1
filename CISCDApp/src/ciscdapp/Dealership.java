/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author xxzom
 */
public class Dealership {

    
    private Car[] cars;
    private Car selectedCar = null;
    
    public Dealership() {
        cars = new Car[10];
        Car car = new Car("Ford", 2015, "Escape", 17500, "White", CarType.SUV);
        Engine engine = new Engine(FuelType.Gas, 4, 1600, 178, 22);
        cars[0] = car;
        
        car = new Car("Ford", 2013, "Escape", 15000, "Black", CarType.SUV);
        engine = new Engine(FuelType.Gas, 4, 2500, 231, 22);
        cars[1] = car;
        
        car = new Car("Honda", 2014, "Accord", 19000, "Silver", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 2400, 189, 28);
        cars[2] = car;
        
        car = new Car("Honda", 2014, "Accord", 20000, "White Pearl", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 2400, 189, 28);
        cars[3] = car;
        
        car = new Car("Honda", 2015, "Accord Hybrid", 19500, "Black Pearl", CarType.Sedan);
        engine = new Engine(FuelType.Hybrid, 4, 2000, 141, 50);
        cars[4] = car;
        
        car = new Car("Honda", 2016, "Civic", 19500, "Green", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 2000, 158, 27);
        cars[5] = car;
        
        car = new Car("Toyota", 2017, "Corolla", 16000, "Silver Metallic", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 1800, 132, 28);
        cars[6] = car;
        
        car = new Car("Toyota", 2015, "Corolla", 14300, "Slate Metallic", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 1800, 132, 28);
        cars[7] = car;
        
        car = new Car("Toyota", 2018, "C-HR", 23600, "Silver Metallic", CarType.CrossOver);
        engine = new Engine(FuelType.Gas, 4, 2000, 144, 27);
        cars[8] = car;
        
        car = new Car("Chevrolet", 2015, "Silverado 1500", 30800, "Black", CarType.Truck);
        engine = new Engine(FuelType.Gas, 6, 4300, 285, 18);
        cars[9] = car;
    }
    
    public String ListAllCars() {
        String result = "";
        int index = 1;
        for (int i = 0; i < cars.length; i++) {
            result += index++ + ": " + cars[i].toString() + "\n";
        }
      return result;      
}
    public String SelectedCar(int index){
        selectedCar = cars[index - 1];
        String s = "Car no. " + index + " selected.\n" + cars[index - 1].toString();
        return s;
        
    }
    public String OpenTrunk(){
        return null;
    }
    public String CheckEngine(){
        
        return selectedCar.CheckEngine();
    }
    public String CheckInterior(){
        return null;
    }
    public String Compare (int firstCarIndex, int secondCarIndex){
        return "Comparing " + firstCarIndex + " & " + secondCarIndex;
    }
    public String ShowOptions(){
        return null;
    }
    
    
}

