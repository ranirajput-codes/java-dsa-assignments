package functions;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        factorial();
    }

    static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial not defined for negative numbers");
            return;
        }
        int ans = 1;
        for(int i = num; i>1; i-- ){
            ans = ans*i;
        }
        System.out.println("Factorial is: "+ ans);
    }
}
