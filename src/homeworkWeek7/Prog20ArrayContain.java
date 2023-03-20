/**
 * 20. Write a Java program to test if an array contains a specific value.
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog20ArrayContain {
    public static void main(String[] args) {
        // Declaring the numeric array
        int arrNumber[]={98,30,45,50,78,87,12};
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.print("Testing value : ");
        int a=scanner.nextInt();
        Prog20ArrayContain obj=new Prog20ArrayContain();
        obj.findValue(arrNumber,a);
        //closing the scanner
        scanner.close();

    }
    // This method will find the if array contains value or not?
    public static boolean findValue(int arrNumber[], int a) {
        boolean isContain = false;
        for (int i = 0; i < arrNumber.length; i++) {
            if (arrNumber[i] == a) {
                isContain = true;
                System.out.println("Yes Array contains this value");
                break;
            }else{
                System.out.println("No Array does not contain this value");
                break;
            }
        }
        return isContain;
    }
}
