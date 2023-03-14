import java.util.Scanner;

/**
 * . Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class GivenStringIntoLowercase {
    //main method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//create input
        System.out.print("Input a String: ");//create string
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
        in.close();
    }
}
