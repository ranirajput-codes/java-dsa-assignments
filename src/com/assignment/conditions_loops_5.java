package com.assignment;
import java.util.Scanner;

public class conditions_loops_5 {
    public static void main(String[] args) {
        futureInvestment();
        HCF();
        LCM();
        checkAlphabet();
        perfectNumber();
        leapYear();
        sumOfDigits();
        daysCount();
        detectNumbers();
    }


//    future investment value - using compound interest formula
    static void futureInvestment(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        int principalAmount = sc.nextInt();
        System.out.println("Enter annual interest rate: ");
        int interestRate = sc.nextInt();
        System.out.println("Enter time in years: ");
        int time = sc.nextInt();
        double futureValue = principalAmount *Math.pow((1+(interestRate/100.0)) , time);
        System.out.println("The future investment value is: " + futureValue);
    }

//    HCF of two numbers
    static void HCF(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to know it's HCF: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min;
        if(a<b){
            min = a;
        }else{
            min = b;
        }
        int HCF = 1;
        for(int i = min; i>0; i--){
            if(a%i==0 && b%i==0){
                HCF = i;
                break;
            }
        }
        System.out.println("HCf of these two numbers is: " + HCF);
    }

//    LCM of two numbers
    static void LCM(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to know it's LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max ;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        int ans = 1;
        for(int i = max; ; i++){
            if(i % a == 0 && i % b ==0 ){
               ans = i;
               break;
            }
        }
        System.out.println("LCM of these two numbers is: "+ ans);
    }

//    program to check whether the alphabet is vowel or consonant
    static void checkAlphabet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char ch = sc.next().toLowerCase().charAt(0);
        if(ch<'a'||ch>'z'){
            System.out.println("Invalid Input!");
            return;
        }
        char [] vowels = {'a','e','i','o','u'};
        String ans = "consonant";
        for(char check : vowels){
            if(ch==check) {
                ans = "vowel";
                break;
            }
        }
        System.out.println("It's a "+ ans);

    }

//    Perfect Number In Java
    static void perfectNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1; i< num ; i++){
            if(num%i==0)
                sum = sum+i;
        }
        if(sum==num){
            System.out.println("It is a perfect number!");
        }else{
            System.out.println("No it is not a perfect number!");
        }
    }

//    check leap year or not
    static void leapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Leap Year!");
        }else{
            System.out.println("Not a leap year!");
        }
    }

//    Sum Of A Digits Of Number
    static void sumOfDigits(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int lastDigit;
        while(num>0){
            lastDigit = num%10;
            sum = sum+lastDigit;
            num = num/10;
        }
        System.out.println("Sum of the digits is: "+sum);

    }

//   Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
    static void daysCount(){
        System.out.println("The month is february");
        int count = 0;
        // it has 28 days
        for(int i= 1; i<=28; i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("the count of days he can go out is: " + count);
    }

//    Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
    static void  detectNumbers(){
        Scanner sc = new Scanner(System.in);
        int num;
        int sumOfNv = 0;
        int sumOfPvEven = 0;
        int sumOfPvOdd = 0;
        do{
            System.out.print("Enter the number: ");
            num = sc.nextInt();

            if(num<0){
                sumOfNv = sumOfNv+num;
            } else if(num%2==0) {
                sumOfPvEven = sumOfPvEven + num;
            }else {
                sumOfPvOdd = sumOfPvOdd + num;
            }
        }while(num!=0);
        System.out.println("Sum of Negetive numbers is: " + sumOfNv);
        System.out.println("Sum of Positive even numbers is: "+ sumOfPvEven);
        System.out.println("Sum of Positive odd numbers is :"+ sumOfPvOdd);
    }


}
