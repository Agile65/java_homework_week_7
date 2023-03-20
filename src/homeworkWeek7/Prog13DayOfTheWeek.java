/**
 * 13. Write a Java program which input any number between 1 and 7, and it prints The Days name
 * MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog13DayOfTheWeek {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week : ");
        int day = scanner.nextInt();
        Prog13DayOfTheWeek obj = new Prog13DayOfTheWeek();
        obj.dayOfTheWeek(day);
        //Closing the scanner object
        scanner.close();
    }

    // Finding the name of the day
    public void dayOfTheWeek(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");
        }
    }
}
