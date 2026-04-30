package assignment;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Good Name: ");
        String name = sc.next();
        System.out.println(name + " , Have a Good Day!");
    }
}
