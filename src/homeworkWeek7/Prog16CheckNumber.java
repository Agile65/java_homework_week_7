/**16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog16CheckNumber {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input Number : ");
        int number=scanner.nextInt();
        Prog16CheckNumber obj=new Prog16CheckNumber();
        obj.checkNumber(number);
        //Closing the scanner object
        scanner.close();
    }
    // Finding the number is Positive Negative or Zero
    public void checkNumber(int number){
        if (number<0){
            System.out.println("NEGATIVE");
        } else if (number>0) {
            System.out.println("POSITIVE");
        }else{
            System.out.println("ZERO");
        }
    }
}
