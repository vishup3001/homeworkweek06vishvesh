/**
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
// declare one instance and one static variable
public class InstanceVariableStaticVariable {
    static int x=10;
    int y = 13;
    //declare one main method
    public static void main(String[] args) {
        InstanceVariableStaticVariable obj = new InstanceVariableStaticVariable();
        //call instance and static variable into both instance and static methods
        obj.myMethod();
        myMethod2();

    }
    public void myMethod(){
        System.out.println("Instance method");//declare instance method
        InstanceVariableStaticVariable obj = new InstanceVariableStaticVariable();
        System.out.println(x);
        System.out.println(y);
    }

    public static void myMethod2(){
        InstanceVariableStaticVariable obj = new InstanceVariableStaticVariable();
        System.out.println("static method");//declare static method
        System.out.println(x);
        System.out.println(obj.y);
    }
}
