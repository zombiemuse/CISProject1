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
    
    
    public String ListAllCars() {
        String result = "";
        for (int i = 0; i < cars.length; i++){
            result += cars[i].toString() + "\n";
        }
      return result;      
}
    
}

