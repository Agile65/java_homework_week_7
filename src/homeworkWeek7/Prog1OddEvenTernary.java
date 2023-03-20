/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog1OddEvenTernary {
    public static void main(String[] args) {                //main method
        Scanner s1 = new Scanner(System.in);                //creating an object for the scanner class
        System.out.println("Input Number : ");              //asking for user input
        int a = s1.nextInt();                               //user can enter input and storing user input into the variable
        Prog1OddEvenTernary obj = new Prog1OddEvenTernary();//creating object to call instance method
        obj.ternary(a);                                     //calling instance method using object
        s1.close();
    }

    public void ternary(int a) {                             //creating an instance method for ternary operator
        String result = (a % 2 == 0) ? "even" : "odd";      //ternary operator
        System.out.println("Number is " + result);          //printing result
    }
}

