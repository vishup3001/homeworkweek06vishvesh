/**
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class StaticVariableStaticMethod {

    // declare two static variable
    static int a = 10;
    static  int b = 30;

    //declare one static method

    public static void main(String[] args) {
        myMethod(); //call static method in main method

    }
    //declare static method

    public static void myMethod() {
        System.out.println("static method");
        System.out.println(a);
        System.out.println(b);
    }
}
