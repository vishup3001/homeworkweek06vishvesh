import java.util.Scanner;

/**
 * . Write a Java program to print the area and perimeter of a rectangle.
 * Test Data:
 * Width = 5.5 Height = 8.5
 *  Expected Output:
 * Area is 5.6 * 8.5 = 47.60
 * Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class AreaAndPerimeterOfRectangle {
    public static void main(String[] args) {//main method
        Scanner v = new Scanner(System.in);//create input using scanner
        System.out.println("Enter your width: ");
        Double a = v.nextDouble();
        System.out.println("Enter your height: ");
        Double b = v.nextDouble();
        double c = a * b;
        System.out.println("Area is " + a + " * " + b + " = " + c);
         double d = 2 * (a + b);
        System.out.println("Perimeter is 2 * (" + a + " + " + b + ") = " + d );
        v.close();//scanner close
    }
}
