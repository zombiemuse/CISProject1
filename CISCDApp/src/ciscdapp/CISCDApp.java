/*
 * Stuff and thangs
 */
package ciscdapp;

import java.text.NumberFormat;
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
        System.out.println("Welcome to CIS department's Car Dealership!"
                + "\nTo view a list of commands, enter Commands: ");
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Dealership dealership = new Dealership();
        outer:
        while(true){
            System.out.print("> ");
            String command = sc.nextLine();
            String[] components = command.split(" ");
            command = command.toLowerCase();
            String message;
            switch(components[0]){
                case "commands":
                    System.out.println("Commands: shows a list of all available commands\n" +
                            "List: lists the inventory of cars\n" +
                            "Compare [n1] [n2]: compares two cars\n" +
                            "Select [n]: selects car No. n and shows the details\n" +
                            "Engine: shows the details of the engine of the selected car\n" +
                            "Interior: Show the details of the interior of the selected car\n" +
                            "Trunk: Show the items in the trunk of the selected car\n" +
                            "Options: show the details of options installed on the selected car\n" +
                            "Quit: terminate the program\n");
                    break;
                case "list":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;
                case "compare":
                    try {
                    int carIndex1, carIndex2;
                    carIndex1 = Integer.parseInt(components[1]);
                    carIndex2 = Integer.parseInt(components[2]);
                    message = dealership.Compare(carIndex1, carIndex2);
                    System.out.println(message);
                    }
                    catch (Exception e){
                        System.out.println("Please enter a valid number");
                    }
                    break;
                case "select":
                    try {
                    int index = Integer.parseInt(components[1]);
                    message = dealership.SelectedCar(index);
                    System.out.println(message);
                    }
                    catch (Exception e){
                        System.out.println("Please enter the vehicle number. \"select (number)\"");
                    }
                    break;
                case "engine":
                    try {
                    message = dealership.CheckEngine();
                    System.out.println(message);
                    }
                    catch (Exception e){
                        System.out.println("You first need to select a car to view its engine details");
                    }
                    break;
                case "interior":
                    try {
                    message = dealership.CheckInterior();
                    System.out.println(message);
                    }
                    catch (Exception e){
                        System.out.println("You first need to select a car to view its interior details");
                    }
                    break;
                case "trunk":
                    try {
                    message = dealership.OpenTrunk();
                    System.out.println(message);
                    }
                    catch (Exception e){
                        System.out.println("You first need to select a car to view its trunk details");
                    }
                    break;
                case "options":
                    try {
                    message = dealership.ShowOptions();
                    System.out.println(message);
                    }
                    catch (Exception e){
                        System.out.println("You first need to select a car to view its options");
                    }
                    break;
                case "quit":
                    while(true){
                    System.out.println("Do you wish to leave the dealership? (Y/N): ");
                    String answer = sc.next();
                    answer = answer.toLowerCase();
                    if (answer.equalsIgnoreCase("n")){
                        System.out.println("Please enter a command");
                        sc.next();
                        break;
                    }
                    else if (answer.equalsIgnoreCase("y")){
                        System.out.println("Thank you for using CIS department's car dealership application!");
                        break outer;
                    }
                    else 
                        System.out.println(answer + " is not a valid option");
                    }
                    continue;
                    
                default:
                    System.out.println(command + " is not a valid option!\nTry again!");
                    break;
            }
        }
            
    }
    
}
