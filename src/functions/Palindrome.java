package functions;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        palindromeNumber();
    }
    static void palindromeNumber(){
//        program to check whether a given number is palindrome or nor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int copy = num;
        int ans= 0;
        while(num>0){
            int lastDigit = num%10;
            num = num/10;
            ans = lastDigit+(ans*10);
        }
        if(ans == copy){
            System.out.println("Palindrome number");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
