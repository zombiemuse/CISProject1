/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

import java.text.NumberFormat;

/**
 *
 * @author xxzom
 */
public class Car {
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    private String make;
    private int year;
    private String model;
    private int price;
    private String color;
    private CarType type;
    private Engine engine;
    private Interior interior;
    private Trunk trunk;
    private Option[] options;
    
    public Car(String make, int year, String model, int price, String color, CarType type){
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.type = type;
        options = new Option[3];
    }
    public Car(String make, int year, String model, int price, String color, CarType type, 
            Engine engine, Interior interior, Trunk trunk){
        this(make, year, model, price, color, type);
        this.engine = engine;
        this.interior = interior;
        this.trunk = trunk;
        
    }
    public void SetEngine(Engine engine){
        this.engine = engine;
    }
    public void SetInterior(Interior interior){
        this.interior = interior;
    }
    public void SetTrunk(Trunk trunk){
        this.trunk = trunk;
    }
    public void AddOption(Option option){
       for (int i = 0; i < options.length; i++){
           if(options[i] == null){
               options[i] = option;
               break;
           }
       }
    }
    public String OpenTrunk(){
        return trunk.toString();
    }
    public String CheckEngine(){
        return engine.toString();
    }
    public String CheckInterior(){
        return interior.toString();
    }
    public String ShowOptions(){
        String result = "";
        for (int i = 0; i < options.length; i++){
            result += options[i].toString() + "\n";
   
           }
        return result;
    }
    public String toString(){
        String s = color + " " + year + " " + make + " " + model + " " + nf.format(price);
        return s;
    }
    public String carSelect(){
        return color + " " + year + " " + make + " " + model;
    }
    public String CompareTo(Car otherCar){
        String result = "";
        if(this.price > otherCar.price)
            result += year + " " + make + " " + model + " is more expensive\n";
        else if (this.price < otherCar.price)
            result += otherCar.year + " " + otherCar.make + " " + otherCar.model + " is more expensive\n";
        else 
            result += "Both vehicles are the same price.\n";
        
        if (this.engine.getMpg() > otherCar.engine.getMpg())
            result += year + " " + make + " " + model + " has better mpg\n";
        else if (this.engine.getMpg() < otherCar.engine.getMpg())
            result += otherCar.year + " " + otherCar.make + " " + otherCar.model + " has better mpg\n";
        else
            result += "Both vehicles have the same mpg\n";
        
        if (this.year > otherCar.year)
            result += year + " " + make + " " + model + " is newer\n";
        else if (this.year < otherCar.year)
            result += otherCar.year + " " + otherCar.make + " " + otherCar.model + " is newer\n";
        else
            result += "Both vehicles were made in the same year\n";
        
        if (this.engine.getFuelType() == otherCar.engine.getFuelType())
            result += "Both vehicles use " + engine.getFuelType() + "\n";
        else 
            result += year + " " + make + " " + model + " uses " + this.engine.getFuelType() + " while the " 
                    + otherCar.year + " " + otherCar.make + " " + otherCar.model + " uses " + otherCar.engine.getFuelType() + "\n";
        
        if (this.engine.getHorsePower() > otherCar.engine.getHorsePower())
            result += year + " " + make + " " + model + " has a more powerful engine\n";
        else if (this.engine.getHorsePower() < otherCar.engine.getHorsePower())
            result += otherCar.year + " " + otherCar.make + " " + otherCar.model + " has a more powerful engine\n";
        else 
            result += "Both vehicles have the same horsepower\n";
        
        if (this.engine.getNoOfCylinders() > otherCar.engine.getNoOfCylinders())
            result += year + " " + make + " " + model + " has more cylinders\n";
        else if (this.engine.getNoOfCylinders() < otherCar.engine.getNoOfCylinders())
            result += otherCar.year + " " + otherCar.make + " " + otherCar.model + " has more cylinders\n";
        else
            result += "Both vehicles have the same number of cylinders\n";
        
        
                    
        return result;
    }
}

enum CarType {Sedan, SUV, CrossOver, Truck}