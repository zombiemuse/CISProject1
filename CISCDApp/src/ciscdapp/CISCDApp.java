/*
 * Stuff and thangs
 */
package ciscdapp;

import java.util.Scanner;

/**
 *
 * @author Gary McCormack
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
                    System.out.println("Commands: shows a list of all available commands\n\n" +
                            "List: lists the inventory of cars\n\n" +
                            "Compare [n1] [n2]: compares two cars\n\n" +
                            "Select [n]: selects car No. n and shows the details\n\n" +
                            "Engine: shows the details of the engine of the selected car\n\n" +
                            "Interior: Show the details of the interior of the selected car\n\n" +
                            "Trunk: Show the items in the trunk of the selected car\n\n" +
                            "Options: show the details of options installed on the selected car\n\n" +
                            "Quit: terminate the program\n");
                    break;
                case "list":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;
                case "compare":
                    System.out.println("Enter number of first car: ");
                    
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
