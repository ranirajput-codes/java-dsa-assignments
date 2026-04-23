package com.assignment;
import java.util.Scanner;

public class conditions_loops_5 {
    public static void main(String[] args) {
        futureInvestment();
        HCF();
        LCM();
    }

//    future investment value
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
}
