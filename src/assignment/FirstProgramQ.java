package assignment;
import java.util.Scanner;

public class FirstProgramQ {
    public static void main(String[] args) {
//        fibonacciSeries();
//        palindromeString();
        armstrongNumber();
    }
//    To calculate Fibonacci Series up to n numbers.
    static void fibonacciSeries(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i<=n ; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }

//    To find out whether the given String is Palindrome or not.
    static void palindromeString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String str = sc.next();
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans = ans + str.charAt(i);
        }
        System.out.println(ans);
        if (str.equals(ans)) {
            System.out.println("Yes the word is palindrome");
        } else {
            System.out.println("no the word is not palindrome");
        }
    }

//    To find Armstrong Number between two given number.
    static void armstrongNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Armstrong number program");
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int copy = num;
        int CopyForDigits = num;
        int digit = 0;
        if(CopyForDigits==0){
            digit = 1;
        }
        else {
            while (CopyForDigits > 0) {
                CopyForDigits = CopyForDigits / 10;
                digit++;
            }
        }
        int sum = 0;
        while(copy>0){
            int a = copy % 10;
            copy = copy /10;

            int b = (int)Math.pow(a,digit);
            sum = sum + b;
        }
        if(num==sum){
            System.out.println("it is an armstrong number");
        }else{
            System.out.println("It is not an armstrong number");
        }
    }   

}
