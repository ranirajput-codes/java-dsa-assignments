package com.assignment;
import java.util.Scanner;

public class conditions_loops_4 {
    public static void main(String[] args) {
        factorial();
        electricityBill();
        calculateAverage();
        discountCalculation();
        distanceCalculation();
        commissionCalculation();
        power();
        depreciation();
        battingAverage();
        CGPACalculation();
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
    static void distanceCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X1: ");
        int x1 = sc.nextInt();
        System.out.print("Enter Y1: ");
        int y1 = sc.nextInt();
        System.out.print("Enter X2: ");
        int x2 = sc.nextInt();
        System.out.print("Enter Y2: ");
        int y2 = sc.nextInt();
        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance is: " + distance);
    }

//    Calculate Commission Percentage
    static void commissionCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total amount of sales: ");
        int amount = sc.nextInt();
        System.out.print("Enter commission percentage: ");
        int commissionRate = sc.nextInt();
        int commission = (commissionRate/100)*amount;
        System.out.println("Commission is: "+commission);
    }

//    power in java
    static void power(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        double ans = Math.pow(base,power);
        System.out.println("The answer is: " + ans);
    }

//    Calculate Depreciation of Value
    static void depreciation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter depreciation percentage: ");
        int rate = sc.nextInt();
        System.out.println("Enter initial value: ");
        int initialV = sc.nextInt();
        System.out.println("Enter time in years: ");
        int time = sc.nextInt();
        double depreciation = initialV*Math.pow((1-(rate/100.0)),time);
        System.out.println("The final value after depreciation is: "+ depreciation);
    }

//    calculate the batting average
    static void battingAverage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total runs: ");
        int run = sc.nextInt();
        System.out.println("Enter number of innings: ");
        int innings = sc.nextInt();
        System.out.println("Enter number of not outs: ");
        int notOuts = sc.nextInt();
        int outs = innings-notOuts;
        int battingAverage = run/outs;
        System.out.println("Batting average is: " + battingAverage);
    }

//    Calculate CGPA Java Program
    static void CGPACalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of subjects: ");
        int numOfSub = sc.nextInt();

        System.out.print("Enter the credits for each subject : ");
        int credit1 = sc.nextInt();
        int credit2 = sc.nextInt();
        int credit3 = sc.nextInt();
        int credit4 = sc.nextInt();
        int credit5 = sc.nextInt();
        int totalCredit = credit1+credit2+credit3+credit4+credit5;

        System.out.print("Enter the Grade point for each subject: ");
        int gp1 = sc.nextInt();
        int gp2 = sc.nextInt();
        int gp3 = sc.nextInt();
        int gp4 = sc.nextInt();
        int gp5 = sc.nextInt();

        int m1 = credit1*gp1;
        int m2 = credit2*gp2;
        int m3 = credit3*gp3;
        int m4 = credit4*gp4;
        int m5 = credit5*gp5;
        int totalWeighted = m1+m2+m3+m4+m5;

        int CGPA =totalWeighted/totalCredit;
        System.out.println("CGPA : " + CGPA);

    }
}
