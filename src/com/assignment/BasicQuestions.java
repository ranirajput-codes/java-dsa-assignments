package com.assignment;
import java.util.Scanner;

public class BasicQuestions {
    public static void main(String[] args) {
//        simpleInterest();
//        calculate();
//        largestNum();
        currencyChange();

    }

    static void simpleInterest(){
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int P = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        int R = sc.nextInt();
        System.out.print("Enter Time in Years: ");
        int T = sc.nextInt();
        int SI = (P*R*T)/100;
        System.out.println( "Simple Interest will be " + SI + " Rupees.");
    }

//    Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    static void calculate() {
        Scanner sc = new Scanner(System.in);
        String choice;
        do {
            System.out.print("Enter The first Number: ");
             int num1 = sc.nextInt();
            System.out.print("Enter The second Number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the Operator(+,-,*,/,%) : ");
            char op = sc.next().charAt(0);
            int ans;
            if (op == '*') {
                ans = num1 * num2;
            } else if (op == '+') {
                ans = num1 + num2;
            } else if (op == '-') {
                ans = num1 - num2;
            } else if (op == '/') {
                ans = num1 / num2;
            } else {
                ans = num1 % num2;
            }
            System.out.println(ans + " is the answer");
            System.out.println("If you want to calculate more so enter 'yes'. if not, then enter 'no' ");
            choice = sc.next();
        }while(choice.equals("yes"));
    }

//    Take 2 numbers as input and print the largest number.
    static void largestNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("First number is the largest");
        } else if(num2>num1) {
            System.out.println("Second number is the largest");
        }else{
            System.out.println("First number is equal to second number");
        }
    }

//    Input currency in rupees and output in USD.
    static void currencyChange(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter INR: ");
        double rupee = sc.nextDouble();
        double usd = rupee/91.2;
        System.out.printf(" USD: %.2f%n " , usd);
    }

}
