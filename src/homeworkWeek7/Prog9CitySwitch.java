/**
 * 9. Same as above program-8 using switch statement.
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog9CitySwitch {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Alphabet from A to F :  ");
        String city = scanner.next().toUpperCase();

        //Creating object to call instance method
        Prog9CitySwitch obj = new Prog9CitySwitch();
        obj.printCity(city);
        //Closing the scanner object
        scanner.close();
    }

    //Printing city name using switch
    public void printCity(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Devan");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("Invalid entry");


        }

    }
}
