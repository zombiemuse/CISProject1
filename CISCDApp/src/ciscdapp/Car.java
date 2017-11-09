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
    private Option[] option;
    
    public Car(String make, int year, String model, int price, String color, CarType type){
        this.make = make;
        this.year = year;
        this.model = model;
        this.price = price;
        this.color = color;
        this.type = type;
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
        for (int i = 0; i < Car.Option[].length; i++){
            
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
        return option.toString();
    }
    public String toString(){
        String s = color + " " + year + " " + make + " " + model + " " + nf.format(price);
        return s;
    }
    public String carSelect(){
        return color + " " + year + " " + make + " " + model;
    }
    public String CompareTo(Car otherCar){
        return null;
    }
}

enum CarType {Sedan, SUV, CrossOver, Truck}