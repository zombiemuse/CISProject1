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
        System.out.println("Welcome to this fake ass car dealership!"
                + "\nTo see what you can do, enter Commands: ");
        Scanner sc = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        Dealership dealership = new Dealership();
        outer:
        while(true){
            System.out.print("> ");
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
                            "Quit: terminate the program\n");
                    break;
                case "list":
                    String list = dealership.ListAllCars();
                    System.out.println(list);
                    break;
                case "compare":
                    break;
                case "select":
                    if (sc.hasNextInt()){
                        int sel = sc.nextInt();
                        if (sel < 11 && sel > -1){
                            String select = dealership.SelectedCar(sel);
                            System.out.println(select);
                        }
                        else {
                            sc.nextLine();
                        System.out.println("Please enter a valid number.\n");
                        }
                    }
                    else {
                        sc.nextLine();
                        System.out.println("Please enter a valid number.\n");
                    }
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
                    while(true){
                    System.out.println("Hey! Where are you going? You sure you want to leave? (Y/N): ");
                    String answer = sc.next();
                    answer = answer.toLowerCase();
                    if (answer.equalsIgnoreCase("n")){
                        System.out.println("That's what I thought, bitch");
                        break;
                    }
                    else if (answer.equalsIgnoreCase("y")){
                        System.out.println("Bye, Felicia!");
                        break outer;
                    }
                    else 
                        System.out.println("Really? " + answer + "?" + "\nTry again fuckwad");
                    }
                    break;
                default:
                    System.out.println("Dude! " + command + " was not an option!\nDo it again!");
                    
            }
        }
            
    }
    
}
