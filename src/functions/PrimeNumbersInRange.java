package functions;
import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        primeInRange();
    }
//    print all the prime numbers between given two numbers
    static void primeInRange(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to know all the prime numbers between them: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = num1; i<num2; i++){
            //outer loop to pick each number in range
            if(num1<=1){
                continue;
            }

            boolean ans = true;

            for(int j = 2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    ans = false;
                    break;
                }
            }
            if(ans){
                System.out.println(i+" ");
            }
        }
    }
}
