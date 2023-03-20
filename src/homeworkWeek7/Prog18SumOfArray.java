/**
 * 18. Write a Java program to sum values of an array.
 */
package homeworkWeek7;

public class Prog18SumOfArray {
    public static void main(String[] args) {
        // Numeric array declaration
        int arr[]={10,20,30,40,50};
        int sum=0;
        // Calculating the Sum of arrays value using for loop
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print("Value of the elements of Array are : ");
        //Printing the value of an array using for loop on the console
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        //displaying the value of Sum on the console
        System.out.println("\nSum of this array is : " +sum);
    }
}
