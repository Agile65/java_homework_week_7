/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
package homeworkWeek7;

public class Prog19AverageOfArray {
    public static void main(String[] args) {
        // Numeric array declaration
        int arr[]={10,11,12,13,14};
        int sum=0;
        // Calculating the sum of arrays value
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        //Printing array values on the console using for loop
        System.out.print("The array elements are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        // Finding the average of arrays value and printing on the console
        System.out.println("\nAverage value of this array elements are : " +(sum/arr.length));
    }
}
