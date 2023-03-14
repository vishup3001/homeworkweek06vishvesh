import java.util.Scanner;

/**
 * . Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class MultiplicationOfTable {
    public static void main(String[] args) {// create main method
        Scanner in = new Scanner(System.in);//create input using scanner

        System.out.print("Input a number: ");
        int num1 = in.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
            in.close();//scanner close
        }
    }
}

