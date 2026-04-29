package assignment;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        maximum(num1,num2,num3);
        minimum(num1,num2,num3);
        evenOdd();
        votingEligibility();
        int ans = productCalculation();
        System.out.println("The product is: "+ ans);
        circumference();
        prime();
    }


    // method to find the maximum
    static void maximum(int num1, int num2, int num3){
        int max;
        if(num1>num2&&num1>num3){
            max = num1;
        }else if(num2>num1&&num2>num3){;
            max = num2;
        }else{
            max = num3;
        }
        System.out.println("The maximum number is " + max);
    }
    // method to find the minimum
    static void minimum(int num1, int num2, int num3){
         int min;
         if(num1<num2&& num1<num3){
             min = num1;
         }else if(num2<num1&& num2<num3){
             min = num2;
         }else{
             min = num3;
         }
        System.out.println("The minimum number of all three is: "+ min);
    }

//    method to check whether a given number is even or odd
    static void evenOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is Even!");
        }else{
            System.out.println("The number is Odd!");
        }
    }

//    method check whether a person is eligible for voting or not
    static void votingEligibility(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

//    create a method that return product of two numbers
    static int productCalculation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to know it's product: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = num1*num2;
        return ans;
    }

//    method to calculate circumference and area of a circle
    static void circumference(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        int r = sc.nextInt();
        double circumference = 2*Math.PI*r;
        double area = Math.PI*r*r;
        System.out.printf("The circumference of the circle is: %.2f\n" , circumference);
        System.out.printf("The area of the circle is: %.2f" , area);
    }

//    method to check whether the entered number is prime or not
    static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("This is not a prime number!");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("This is a prime number");
        }else{
            System.out.println("This is not a prime number");
        }
    }

}