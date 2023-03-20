/**
 * 2. Write a java program to input any year like (ex.2007) and
 * find out if it is leap year or not?
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog2LeapYear {
    public static void main(String[] args) {                //main method
        Scanner scanner = new Scanner(System.in);           //creating scanner class object for user input
        System.out.print("Input Year : ");                  //user can see message on the console
        int a = scanner.nextInt();                          //user can input the year and program is storing value into the variable
        Prog2LeapYear obj = new Prog2LeapYear();            //creating an object for calling instance class
        obj.leapYear(a);                                    //calling an instance method with parameter
        scanner.close();

    }

    public void leapYear(int year) {                                 //creating an instance method
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //if-else statement for checking the remainder is 0
            System.out.println("Year is a Leap Year");              //if body(true body)
        } else {
            System.out.println("Year is not a Leap Year");          //else body(false body)
        }
    }
}
