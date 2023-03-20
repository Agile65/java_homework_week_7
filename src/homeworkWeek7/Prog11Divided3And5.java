/**11. Write a java program to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.
 */
package homeworkWeek7;

public class Prog11Divided3And5 {
    public static void main(String[] args) {
        Prog11Divided3And5 obj = new Prog11Divided3And5();
        System.out.println("Numbers divided by 3 ");
        for(int i=1;i<=100;i++){
            obj.divided3(i);
        }
        System.out.println("\nNumbers divided by 5 ");
        for(int i=1;i<=100;i++){
            obj.divided5(i);
        }
    }
    // Divided By Three method
    public void divided3(int i){
        if(i%3==0){
            System.out.print(i+"\t");
        }
    }
    // Divided By Five method
    public void divided5(int i){
        if(i%5==0){
            System.out.print(i+"\t");
        }

    }

//    // Divided By Three method
//    public void divided3() {
//        System.out.println("Numbers divided by 3 : ");
//        for (int i = 1; i <= 100; i++) {
//            int a = (i % 3);
//            if (a == 0) {
//                System.out.print(i + "\t");
//            }
//        }
//    }
//
//    // Divided By Five method
//    public void divided5() {
//        System.out.println("\nNumbers divided by 5 : ");
//        for (int i = 1; i <= 100; i++) {
//            int a = (i % 5);
//            if (a == 0) {
//                System.out.print(i + "\t");
//            }
//        }
//    }
}
