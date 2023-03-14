import java.util.Scanner;
import java.util.concurrent.Callable;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class FahrenheatToDegreeCelcius {
    // create main method
    public static void main(String[] strings) {
        Scanner input = new Scanner(System.in);//create input

        System.out.print("Input a degree in Fahrenheit: ");//condition
        double fahrenheit = input.nextDouble();
        FahrenheatToDegreeCelcius obj = new FahrenheatToDegreeCelcius();//create object
        obj.myMethod(fahrenheit);//calling with obj
        input.close();//scanner close

    }
// create my method
    public void myMethod(double fahrenheit) {
        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}

