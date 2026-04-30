package functions;
import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        System.out.println(sum());
    }
//    write a function that returns the sum of first natural numbers
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        return sum;
    }
}
