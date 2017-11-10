/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

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
        cars = new Car[10];
        Car car = new Car("Ford", 2015, "Escape", 17500, "White", CarType.SUV);
        Engine engine = new Engine(FuelType.Gas, 4, 1600, 178, 22);
        car.SetEngine(engine);
        Interior interior = new Interior("black", "red", false, true);
        car.SetInterior(interior);
        Trunk trunk = new Trunk(true, true, true, true, "Black");
        car.SetTrunk(trunk);
        Option options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[0] = car;
        
        car = new Car("Ford", 2013, "Escape", 15000, "Black", CarType.SUV);
        engine = new Engine(FuelType.Gas, 4, 2500, 231, 22);
        car.SetEngine(engine);
        interior = new Interior("Beige", "Black", false, false);
        car.SetInterior(interior);
        trunk = new Trunk(true, false, true, true, "Beige");
        car.SetTrunk(trunk);
        options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        
        cars[1] = car;
        
        car = new Car("Honda", 2014, "Accord", 19000, "Silver", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 2400, 189, 28);
        car.SetEngine(engine);
        interior = new Interior("Bugandy", "Black", true, false);
        car.SetInterior(interior);
        trunk = new Trunk(true, false, false, true, "");
        car.SetTrunk(trunk);
        options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[2] = car;
        
        car = new Car("Honda", 2014, "Accord", 20000, "White Pearl", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 2400, 189, 28);
        car.SetEngine(engine);
        interior = new Interior("Grey", "Black", false, false);
        car.SetInterior(interior);
        trunk = new Trunk(false, true, true, false, "Grey");
        car.SetTrunk(trunk);
        options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[3] = car;
        
        car = new Car("Honda", 2015, "Accord Hybrid", 19500, "Black Pearl", CarType.Sedan);
        engine = new Engine(FuelType.Hybrid, 4, 2000, 141, 50);
        car.SetEngine(engine);
        interior = new Interior("White", "Charcoal", false, true);
        car.SetInterior(interior);
        trunk = new Trunk(true, true, true, true, "Charcoal");
        car.SetTrunk(trunk);
       options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[4] = car;
        
        car = new Car("Honda", 2016, "Civic", 19500, "Green", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 2000, 158, 27);
        car.SetEngine(engine);
        interior = new Interior("Beige", "Grey", true, false);
        car.SetInterior(interior);
        trunk = new Trunk(true, false, true, true, "Beige");
        car.SetTrunk(trunk);
       options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[5] = car;
        
        car = new Car("Toyota", 2017, "Corolla", 16000, "Silver Metallic", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 1800, 132, 28);
        car.SetEngine(engine);
        interior = new Interior("Grey", "Beige", false, false);
        car.SetInterior(interior);
        trunk = new Trunk(false, false, false, true, "");
        car.SetTrunk(trunk);
        options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[6] = car;
        
        car = new Car("Toyota", 2015, "Corolla", 14300, "Slate Metallic", CarType.Sedan);
        engine = new Engine(FuelType.Gas, 4, 1800, 132, 28);
        car.SetEngine(engine);
        interior = new Interior("Coffee", "Charcoal", false, true);
        car.SetInterior(interior);
        trunk = new Trunk(true, false, true, false, "Coffee");
        car.SetTrunk(trunk);
        options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
        cars[7] = car;
        
        car = new Car("Toyota", 2018, "C-HR", 23600, "Silver Metallic", CarType.CrossOver);
        engine = new Engine(FuelType.Gas, 4, 2000, 144, 27);
        car.SetEngine(engine);
        interior = new Interior("Wine", "Cream", true, false);
        car.SetInterior(interior);
        trunk = new Trunk(false, false, true, false, "Wine");
        car.SetTrunk(trunk);
        cars[8] = car;
        
        car = new Car("Chevrolet", 2015, "Silverado 1500", 30800, "Black", CarType.Truck);
        engine = new Engine(FuelType.Gas, 6, 4300, 285, 18);
        car.SetEngine(engine);
        interior = new Interior("Beige", "Grey", false, false);
        car.SetInterior(interior);
        trunk = new Trunk(false, false, false, true, "");
        car.SetTrunk(trunk);
        options = new Option("GPS", "Global Positioning System");
        car.AddOption(options);
        options = new Option("Heated Seats", "Warms your seats");
        car.AddOption(options);
        options = new Option("Cup Holders", "A handy holder for your cup");
        car.AddOption(options);
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
}
