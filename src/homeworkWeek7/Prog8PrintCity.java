/**8. Input any alphabet from “A" to “F” and print their city name accordingly
 *  (use if else) if any other alphabet should be invalid entry
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog8PrintCity {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Alphabet from A to F :  ");
        char city=scanner.next().charAt(0);
        //object creation
        Prog8PrintCity obj=new Prog8PrintCity();
        obj.printCity(city);
        //Closing the scanner object
        scanner.close();
    }
    //printing city name using the method
    public void printCity(char city){
        if(city=='A'||city=='a'){
            System.out.println("Aberdeen");
        } else if (city=='B' || city=='b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Cambridge");
        } else if (city=='D'||city=='d') {
            System.out.println("Devan");
        } else if (city=='E'||city=='e') {
            System.out.println("Edinburgh");
        } else if (city=='F'||city=='f') {
            System.out.println("Feltham");
        }else {
            System.out.println("Invalid Alphabet");
        }
    }

}
