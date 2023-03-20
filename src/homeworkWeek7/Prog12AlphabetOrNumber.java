/**12. Write a program that tells us input value is number or an alphabet or symbol.
 */
package homeworkWeek7;

import java.util.Scanner;

public class Prog12AlphabetOrNumber {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner=new Scanner(System.in);
        System.out.print("Input value : ");
        char ch=scanner.next().charAt(0);
        //Object creation for calling instance method
        Prog12AlphabetOrNumber obj=new Prog12AlphabetOrNumber();
        obj.findValue(ch);
        //Closing the scanner object
        scanner.close();
    }
    //instance method to find the input value is ALPHABET, DIGIT or SYMBOL
    public void findValue(char ch){
        if((ch>='A'&& 'Z' >= ch)||(ch>='a'&& 'z' >= ch)){
            System.out.println(ch +" is an alphabet.");
        } else if (ch>='0' && ch<='9') {
            System.out.println(ch +" is a number.");
        }else{
            System.out.println(ch+" is a symbol.");
        }
    }
}
