package com.assignment;
import java.util.Scanner;

public class conditions_loops_3 {
    public static void main(String[] args) {
//        subOfProductAndSum();
//        sumCalculator();
        largestNumber();
    }

//    subtract the product and the sum of the given integer
    static void subOfProductAndSum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int integer = sc.nextInt();
        int intforprocuct = integer;
        int intforsum = integer;
        //product of integer
        int product = 1;
        while(intforprocuct>0){
            int ld = intforprocuct%10;
            intforprocuct = intforprocuct/10;
            product = product*ld;
        }
        int sum = 0;
        while(intforsum>0){
            int ld = intforsum%10;
            intforsum = intforsum/10;
            sum = sum+ld;
        }
        int ans = product-sum;
        System.out.println("Ans of the subtraction of product and sum of the given integer is: " + ans);
    }

//    Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
    static void sumCalculator(){
        Scanner sc = new Scanner(System.in);
        int integer;
        int sum = 0;
        do{
            System.out.print("Enter the Integer: ");
            integer = sc.nextInt();
            if(integer!=0) {
                sum = sum + integer;
            }
        }while(integer!=0);
        System.out.println("The sum is: " + sum);
    }

//    Take integer inputs till the user enters 0 and print the largest number from all.
    static void largestNumber(){
        Scanner sc = new Scanner(System.in);
        int integer;
        int largestNumber=0;
        do{
            System.out.print("Enter the Integer: ");
            integer = sc.nextInt();
            if(integer>largestNumber){
                largestNumber=integer;
            }
        }while(integer!=0);

        System.out.println("The largest number is : " + largestNumber);
    }

}
