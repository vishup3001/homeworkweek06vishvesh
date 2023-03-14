import java.util.Scanner;

/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class SumMltiplyDivideRemainder {
    public static void main(String[] args) {
// to read the input
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");//input number
        int x = in.nextInt();

        System.out.print("Input second number: ");//input number
        int y = in.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y));//sum method

        System.out.println(x + " - " + y + " = " + (x - y));//subtraction method

        System.out.println(x + " x " + y + " = " + (x * y));//multiply method

        System.out.println(x + " / " + y + " = " + (x / y));//divide method

        System.out.println(x + " mod " + y + " = " + (x % y));//remainder method
        in.close();
    }
}
