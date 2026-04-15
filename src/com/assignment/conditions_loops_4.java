package com.assignment;
import java.util.Scanner;

public class conditions_loops_4 {
    public static void main(String[] args) {
        factorial();
        electricityBill();
        calculateAverage();
        discountCalculation();

    }

//    Factorial Program In Java
    static void factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the factorial");
        System.out.print("Enter the number to know it's factorial: ");
        int num = sc.nextInt();
        int ans = 1;
        for(int i = num; i > 0; i--){
            ans = ans * i;
        }
        System.out.println("The factorial is: " + ans);
    }

//    calculate the electricity bill
    static void electricityBill(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter previous meter reading: ");
        int previousReading = sc.nextInt();
        System.out.print("Enter current meter reading: ");
        int currentReading = sc.nextInt();
        int unit = currentReading-previousReading;

        int bill;

        if(unit<=100){
            bill = unit*3;
        }
        else if(unit<=200){
            bill = (100*3) + ((unit-100)*5);
        }
        else if(unit<=300){
            bill = (100*3) + (100*5) + ((unit-200)*7);
        }
        else{
            bill = (100*3) + (100*5) + (100*7) + ((unit-300)*10);
        }
        System.out.println("Bill : " + bill);
    }

//    calculate average of n numbers
    static void calculateAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of inputs: ");
        int count = sc.nextInt();
        int count2 = count;
        int total = 0;
        for(int i = count2; i > 0; i--){
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            total = total+num;
            count2--;
        }
        int average = total/count;
        System.out.println("Average : " + average);
    }

//    Calculate Discount Of Product
    static void discountCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price real price: ");
        int realPrice = sc.nextInt();
        System.out.print("Enter the discount percentage: ");
        int discount = sc.nextInt();
        int discountRupees = (realPrice*discount)/100;
        System.out.println("You ara getting discount of rupees: " + discountRupees);
        int afterPrice = realPrice-discountRupees;
        System.out.println("Price after discount is: "+ afterPrice);
    }

//    Calculate Distance Between Two Points


}
