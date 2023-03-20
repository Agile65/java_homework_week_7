/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * * Print in following format
 * _______________________________
 * | Salary Slip                  |
 * |______________________________|
 * | Employee Id : 2564           |
 * | Employee Name : Jay          |
 * |______________________________|
 * | Basic Salary : 25000.0       |
 * | HRA 10% : 2500.0             |
 * | DA 8% : 2250.0               |
 * | TA 9% : 2000.0               |
 * | PF - 20%; : 5000.0           |
 * |______________________________|
 * | Gross Salary : 26750.0       |
 * |==============================|
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog5EmpSalary {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name : ");
        String eName = scanner.nextLine();

        System.out.print("Enter Employee Id : ");
        int eId = scanner.nextInt();

        System.out.print("Enter Basic Salary :  ");
        int eSal = scanner.nextInt();

        // Calculating HRA,DA,TA and PF
        double hra = calculateHRA(eSal);
        double da = calculateDA(eSal);
        double ta = calculateTA(eSal);
        double pf = calculatePF(eSal);

        // Calculating the gross salary
        double grossSalary = eSal + hra + da + ta - pf;

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + eSal + "                    |");
        System.out.println("|Employee Name:" + eName + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + eSal + "                  |");
        System.out.println("|HRA 10%     : " + hra + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                 |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "               |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scanner.close();
    }

    // Calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    // Calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    // Calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    // Calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}
