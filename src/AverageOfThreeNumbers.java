import java.util.Scanner;

/**
 * . Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        //create input
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );//declare formula
        in.close();
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;//declare return
    }
}
