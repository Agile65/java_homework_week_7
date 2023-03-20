/*7. Write a java program input sales id, seller's name, sales amount,
and salary basic and then find his sales Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
*/
package homeworkWeek7;

import java.util.Scanner;

public class Prog7SalesCommission {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Seller's name : ");
        String sName = scanner.nextLine();
        System.out.print("Enter Sales id : ");
        int salesId = scanner.nextInt();
        System.out.print("Enter Sales amount : ");
        int sAmount = scanner.nextInt();
        System.out.print("Enter Basic salary : ");
        int sBasic = scanner.nextInt();
        //Creating the object to call instance method
        Prog7SalesCommission obj = new Prog7SalesCommission();
        int grossSalary = sBasic + (obj.calculateCommission(sAmount));
        System.out.println("Seller name is            : " + sName);
        System.out.println("Seller id is              : " + salesId);
        System.out.println("Seller's sales amount is  : " + sAmount);
        System.out.println("Seller's basic salary is  : " + sBasic);
        System.out.println("Seller's gross salary is  : " + grossSalary);
        // closing the scanner object
        scanner.close();
    }

    // Calculating the sales commission
    public int calculateCommission(int sAmount) {
        int commission;
        if (sAmount >= 50000) {
            commission = (sAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (sAmount >= 30000) {
            commission = (sAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (sAmount >= 20000) {
            commission = (sAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (sAmount >= 10000) {
            commission = (sAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (sAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}
