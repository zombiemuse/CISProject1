/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

import java.util.Arrays;

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
        cars[0] = car;
        
        car = new Car("Ford", 2013, "Escape", 15000, "Black", CarType.SUV);
        cars[1] = car;
        
        car = new Car("Honda", 2014, "Accord", 19000, "Silver", CarType.Sedan);
        cars[2] = car;
        
        car = new Car("Honda", 2014, "Accord", 20000, "White Pearl", CarType.Sedan);
        cars[3] = car;
        
        car = new Car("Honda", 2015, "Accord", 19500, "Black Pearl", CarType.Sedan);
        cars[4] = car;
        
        car = new Car("Honda", 2016, "Civic", 19500, "Green", CarType.Sedan);
        cars[5] = car;
        
        car = new Car("Toyota", 2017, "Corolla", 16000, "Silver Metallic", CarType.Sedan);
        cars[6] = car;
        
        car = new Car("Toyota", 2015, "Corolla", 14300, "Slate Metallic", CarType.Sedan);
        cars[7] = car;
        
        car = new Car("Toyota", 2016, "C-HR", 23600, "Silver Metallic", CarType.CrossOver);
        cars[8] = car;
        
        car = new Car("Chevrolet", 2015, "Silverado 1500", 30800, "Black", CarType.Truck);
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
    public void SelectedCar(int index){
        
    }
    public String OpenTrunk(){
        return null;
    }
    public String CheckEngine(){
        return null;
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

