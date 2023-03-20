/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

package homeworkWeek7;

import java.util.Scanner;

public class Prog6OddEven {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = scanner.nextInt();
        Prog6OddEven obj = new Prog6OddEven();
        System.out.println("The number is " + obj.isItOddEven(a));
        // Closing the scanner object
        scanner.close();
    }

    // Checking the odd or even method
    public String isItOddEven(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else
            return "Odd";
    }
}
