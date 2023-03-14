/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class InstanceVariable {
    //declare two instance variables
    int a = 3;
    int b = 4;

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();//object
        obj.myMethod();//call instance method in main method

    }
    // declare instance method
    public void myMethod(){
        System.out.println("Instance Method");
        System.out.println(a);
        System.out.println(b);
    }

}
