import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class SumOfTwoBinaryNumbers {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first binary number");
        String a = obj.next();
        System.out.println("Enter the second binary number");
        String b = obj.next();
        my1(a,b);
        obj.close();

    }

    public static void my1(String a , String b) {
        int b1 = Integer.parseInt(a,2);
        int b2 = Integer.parseInt(b,2);
        int b3 = b1 + b2;
        System.out.println("addition of two binary number" + Integer.toBinaryString(b3));

    }

}
