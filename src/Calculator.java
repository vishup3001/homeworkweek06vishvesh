import java.util.Scanner;

/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

public class Calculator {
    // main method
    public static void main(String[] args) {
        //declare input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a = scanner.nextInt();//create 1 input
        System.out.println("Enter second value: ");
        int b = scanner.nextInt();//create 2 input
        addition(a,b);// direct call
        subtraction(a,b);//direct call
        Calculator obj = new Calculator();//create obj
        obj.multiplication(a,b);//call with obj
        obj.division(a,b);//call with obj
        scanner.close();//scanner close

    }
// create my method
    public static void addition(int m , int n){
        int ans = m+n;
        System.out.println("Addition of two number : " + ans);
    }

    public static void subtraction(int m , int n) {
        int ans = m-n;
        System.out.println("Subtraction of two number : " + ans);
    }
    public void multiplication(int m , int n){
    int ans = m*n;
        System.out.println("multiplication of two number : " + ans);
    }
    public void division(int m , int n){
        int ans = m/n;
        System.out.println("division of two number : " + ans);

    }
}
