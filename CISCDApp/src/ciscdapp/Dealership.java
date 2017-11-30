/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author xxzom
 */
public class Dealership {
    private Car[] cars;
    private Car selectedCar = null;
    private Car car1 = null;
    private Car car2 = null;
    
    public Dealership() {
        String columns[];
        cars = new Car[10];
        Engine engine;
        Interior interior;
        Trunk trunk;
        Option options;
       
        try{
            int count = 0;
            File inventoryFile = new File("autos.txt");
            FileReader reader = new FileReader(inventoryFile);
            BufferedReader bReader = new BufferedReader(reader);
            String line = bReader.readLine();
            while (line != null)
           
            {
               
                columns = line.split(",");
                Car car = new Car(columns[0], Integer.parseInt(columns[1]), columns[2], Integer.parseInt(columns[3]), columns[4], CarType.valueOf(columns[5]));
                engine = new Engine(FuelType.valueOf(columns[6]), Integer.parseInt(columns[7]), Integer.parseInt(columns[8]), Integer.parseInt(columns[9]), Float.parseFloat(columns[10]));
                car.SetEngine(engine);
                interior = new Interior(columns[11], columns[12], Boolean.valueOf(columns[13]), Boolean.valueOf(columns[14]));
                car.SetInterior(interior);
                trunk = new Trunk(Boolean.valueOf(columns[15]), Boolean.valueOf(columns[16]), Boolean.valueOf(columns[17]), Boolean.valueOf(columns[18]), columns[19]);
                car.SetTrunk(trunk);
                options = new Option(columns[20], columns[21]);
                car.AddOption(options);
                options = new Option(columns[22], columns[23]);
                car.AddOption(options);
                options = new Option(columns[24], columns[25]);
                car.AddOption(options);
               
                cars[count] = car;
                count++;
                line = bReader.readLine();
            }
            bReader.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
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
        String s = "The " + selectedCar.carSelect() + " is great! You can view engine, interior, and trunk of the car";
        return s;
    }
    public String OpenTrunk(){
        return selectedCar.OpenTrunk().toString();
    }
    public String CheckEngine(){    
        return selectedCar.CheckEngine().toString();
    }
    public String CheckInterior(){
        return selectedCar.CheckInterior().toString();
    }
    public String Compare (int firstCarIndex, int secondCarIndex){
        car1 = cars[firstCarIndex - 1];
        car2 = cars[secondCarIndex - 1];
        return car1.CompareTo(car2);
        
    }
    public String ShowOptions(){
        return selectedCar.ShowOptions().toString();
    }
    public String addCar(int year, String make, String model, int price, String color, CarType carType){
        try {
            Car car = new Car(make, year, model, price, color, carType);
            cars = java.util.Arrays.copyOf(cars, cars.length + 1);
            cars [cars.length - 1] = car;
            
            try{
            File inventoryFile = new File("autos.txt");
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(inventoryFile, true)));
            
            out.println(make + "," + year + "," + model + "," + price + "," + color + "," + carType + "," +
                    "Gas," + "4," + "1800,")
            
        
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    return "The car was successfully added to the inventory. The inventory now contains " + cars.length + " cars";
    
}
    
}