/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math,
 * Science and English marks (marks is between 0 and 100 and if it is out of range print
 * error message “Invalid Input, Marks should between 0 and 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _______________________________ |
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________|
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog3ResultMarksheet {
    public static void main(String[] args) {                    //main method
        Scanner scanner = new Scanner(System.in);               //creating an object for scanner class
        System.out.print("Enter Student Name : ");
        String sName = scanner.nextLine();                      //user can input name
        System.out.print("Enter Roll Number : ");
        int rollNo = scanner.nextInt();                         //user can input roll number
        System.out.print("Enter Maths Marks : ");
        int mathsMarks = scanner.nextInt();                     //user can input maths marks
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid Input. Marks should between 0 to 100");
            System.out.print("Please enter correct marks  :  ");
            mathsMarks = scanner.nextInt();
        }
        System.out.print("Enter Science Marks : ");
        int scienceMarks = scanner.nextInt();                   //user can input science marks
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid Input. Marks should between 0 to 100");
            System.out.print("Please enter correct marks  :  ");
            scienceMarks = scanner.nextInt();
        }
        System.out.print("Enter English Marks : ");
        int englishMarks = scanner.nextInt();                   //user can input english marks
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input. Marks should between 0 to 100");
            System.out.print("Please enter correct marks  :  ");
            englishMarks = scanner.nextInt();
        }
        Prog3ResultMarksheet obj = new Prog3ResultMarksheet();
        int add = total(mathsMarks, scienceMarks, englishMarks);
        double percentage = percentage(add);
        String calculateResult = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String calculateGrade = calculateGrade(percentage, calculateResult);
        printMarksheet(sName, rollNo, mathsMarks, scienceMarks, englishMarks, add, percentage, calculateResult, calculateGrade);
        scanner.close();                                                //Closing the scanner
    }

    //calculating sum
    public static int total(int mathsMarks, int scienceMarks, int englishMarks) {
        int add = (mathsMarks + scienceMarks + englishMarks);
        return add;
    }

    //calculating percentage
    public static double percentage(int add) {
        double result = (add / 3);
        return result;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(double percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else
                grade = "C";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printMarksheet(String sName, int rollNumber, int mathsMarks, int scienceMarks, int englishMarks, int add, double percentage, String result, String grade) {
        System.out.println(" _______________________________");
        System.out.println("|         Mark Sheet            |");
        System.out.println("|-------------------------------|");
        System.out.println("|       Name :  " + sName + "\t\t\t\t|");
        System.out.println("|    Roll No :  " + rollNumber + "\t\t\t\t|");
        System.out.println("|   Subjects :     Marks        |");
        System.out.println("|-------------------------------|");
        System.out.println("|    Math    :" + mathsMarks + "\t\t\t\t|");
        System.out.println("|  Science   :" + scienceMarks + "\t\t\t\t|");
        System.out.println("|  English   :" + englishMarks + "\t\t\t\t|");
        System.out.println("|    Total   :" + add + "\t\t\t\t|");
        System.out.println("|Percentage  :" + percentage + "\t\t\t\t|");
        System.out.println("|   Result   :" + result + "\t\t\t\t|");
        System.out.println("|    Grade   :" + grade + "\t\t\t\t|");
        System.out.println(" _______________________________");

    }
}
