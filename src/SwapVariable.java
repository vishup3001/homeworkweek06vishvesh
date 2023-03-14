import java.util.Scanner;

/**
 * Write a Java program to swap two variables.
 */

// declare main method
public class SwapVariable {
    public static void main(String[] args) {
        int x, y, z;  // create input
        Scanner in = new Scanner(System.in);

        System.out.println("Input the first number: "); //declare first number
        x = in.nextInt();
        System.out.println("Input the second number: "); // declare second number
        y = in.nextInt();

        z = x;
        x = y;
        y = z;

        System.out.println(" Swapped values are:" + x + " and " + y); // formula to swap
    }
}
