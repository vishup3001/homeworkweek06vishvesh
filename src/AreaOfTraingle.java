import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class AreaOfTraingle {

// main method
    public static void main(String[] args) {
//create input
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter base width of Triangle ");
        float base = scanner.nextFloat();

        System.out.println("enter height of Triangle ");
        float height = scanner.nextFloat();

        //calculating area of Triangle
        float area = area(base, height);
        System.out.println("area of triangle calculated : " + area);
        scanner.close();
    }

    public static float area(float base, float height){
        return (base * height)/2;//declare return

    }
}



