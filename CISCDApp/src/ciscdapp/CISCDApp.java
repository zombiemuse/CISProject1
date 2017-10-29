/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciscdapp;

import java.util.Scanner;

/**
 *
 * @author xxzom
 */
public class CISCDApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to this fake ass car dealership!"
                + "\nTo see what you can do, enter Commands: ");
        Scanner sc = new Scanner(System.in);
        Dealership dealership = new Dealership();
        
        while(true){
            String command = sc.next();
            command = command.toLowerCase();
            switch(command){
                case "commands":
                    System.out.println("Commands: shows a list of all available commands\n" +
                            "List: lists the inventory of cars\n" +
                            "Compare [n1] [n2]: compares two cars\n" +
                            "Select [n]: selects car No. n and shows the details\n" +
                            "Engine: shows the details of the engine of the selected car\n" +
                            "Interior: Show the details of the interior of the selected car\n" +
                            "Trunk: Show the items in the trunk of the selected car\n" +
                            "Options: show the details of options installed on the selected car\n" +
                            "Quit: terminate the program");
                    break;
                case "list":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;
                case "compare":
                    break;
                case "select":
                    break;
                case "engine":
                    break;
                case "interior":
                    break;
                case "trunk":
                    break;
                case "options":
                    break;
                case "quit":
                    break;
                    
            }
        }
            
    }
    
}
