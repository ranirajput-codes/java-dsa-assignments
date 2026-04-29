package functions;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       primeNumber();
    }
    static void primeNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if(num<=1){
            System.out.println("Not Prime!");
            return;
        }

        String ans = "Prime";

        for(int i =2; i<=(int)Math.sqrt(num); i++){
            if(num%i==0){
                ans = "Not Prime";
                break;
            }
        }
        System.out.println(ans);
    }
}
