import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

public class RadiusOfCircle {
    //main method
    public static void main(String[] args) {
        double radius,area;
        Scanner value = new Scanner(System.in);
        System.out.println("enter the radius value of the circle");
        radius = value.nextDouble();
        value.close();
        area = 3.14*radius*radius;// use math formula
        System.out.println("area of the circle is : " + area);//output in console
        value.close();//scanner close

    }
}
