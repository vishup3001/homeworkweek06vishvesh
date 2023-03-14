import java.util.Scanner;

/**
 * . Write a program to convert the upper case to lower case.
 */
public class UppercaseToLowercase {
    public static void main(String[] args) {  // main method
        char ch;
        System.out.println("enter any character in uppercase");
        Scanner r = new Scanner(System.in);//create input using scanner
        ch = r.next().charAt(0);
        if (ch >= 'A' & ch <= 'Z') ;//condition
        ch = Character.toLowerCase(ch);
        System.out.println("lowercase " + ch);
        r.close();//scanner close

    }
}


