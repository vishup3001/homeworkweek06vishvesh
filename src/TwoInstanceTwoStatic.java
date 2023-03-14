/**
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class TwoInstanceTwoStatic {
    static int m = 30;
    static int n = 40;
    int a = 10;
    int b = 20;

    public static void main(String[] args) {
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        obj.my();
        my2();

    }

    public void my() {
        System.out.println("instance method");//declare instance method
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        System.out.println(a);
        System.out.println(b);
        System.out.println(m);
        System.out.println(n);
    }

    public static void my2() {
        System.out.println("static method"); // declare static method
        System.out.println(m);
        System.out.println(n);
        TwoInstanceTwoStatic obj = new TwoInstanceTwoStatic();
        System.out.println(obj.b);
        System.out.println(obj.a);
    }
}

