/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
package homeworkWeek7;

import java.util.Arrays;

public class Prog17SortArray {
    public static void main(String[] args) {
        // Numeric Array declaration
        int numArray[]={123,876,324,231,765,912};
        //String Array declaration
        String stringArray[]={"John","Ben","Zion","Dave","Almeda","Max"};
        System.out.println("Actual Numerical Array was: " + Arrays.toString(numArray));
        System.out.println("Actual String Array was: " + Arrays.toString(stringArray));
        //Numeric Array sorting
        Arrays.sort(numArray);
        //String Array sorting
        Arrays.sort(stringArray);
        System.out.println("After sorting Numerical Array is: " + Arrays.toString(numArray));
        System.out.println("After sorting String Array is: " + Arrays.toString(stringArray));
    }
}
