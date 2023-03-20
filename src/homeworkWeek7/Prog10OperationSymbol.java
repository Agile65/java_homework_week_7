/**
 * 10. Write a java program to input any two number and ask user to enter their symbol
 * (+, -, /, *) find addition, Subtraction, multiplication and division according
 * to their symbol (using if else)
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog10OperationSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int b = scanner.nextInt();
        System.out.print("Enter one symbol from (+ - * /) for operation : ");
        char symbol = scanner.next().charAt(0);
        Prog10OperationSymbol obj = new Prog10OperationSymbol();
        obj.operation(a, b, symbol);
        //Closing the scanner object
        scanner.close();
    }

    // Calculating operation based on symbol using method
    public void operation(int a, int b, char symbol) {
        if (symbol == '+') {
            System.out.println("Addition is " + (a + b));
        } else if (symbol == '-') {
            System.out.println("Subtraction is " + (a - b));
        } else if (symbol == '*') {
            System.out.println("Multiplication is " + (a * b));
        } else if (symbol == '/') {
            System.out.println("Division is " + (a / b));
        } else {
            System.out.println("Invalid operation symbol");
        }
    }
}
