package assignment;
import java.util.Scanner;

public class ConditionAndLoops {
    public static void main(String[] args) {
//        areaOfCircle();
//        areOfTriangle();
//        areaOfRectangle();
        isoscelesTriangle();
    }

//    Area of circle
    static void areaOfCircle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to calculate the area of circle");
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        if(radius<0){
            System.out.println("Radius can not be negative");
        }
        else {
            double pi = Math.PI;
            double area = pi * radius * radius;
            System.out.println("Area of circle is: " + area);
            sc.close();
        }
    }

//  Area Of Triangle
    static void areOfTriangle(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Program to calculate area of Triangle");
        System.out.println("Choose your input type: ");
        System.out.println("1. using base and height");
        System.out.println("2. using three sides");
        System.out.println("Enter 1 or 2 ");

        int method = sc.nextInt();
        if(method==1){
            System.out.print("Enter the Base: ");
            int base = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();
            double area = (base*height)/2.0;
            System.out.println("Area: "+area);
        }

        else if(method==2){
            System.out.println("Enter the sides: ");
            System.out.print("First Side: ");
            int a = sc.nextInt();
            System.out.print("Second side: ");
            int b = sc.nextInt();
            System.out.print("Third side: ");
            int c = sc.nextInt();
            if(a+b>c&&b+c>a&&c+a>b) {
                double s = (a + b + c) / 2.0;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.printf("Area :%.2f ", area);
            }else{
                System.out.println("Invalid Triangle");
            }

        }
        else{
            System.out.println("Invalid Choice");
        }

        sc.close();

    }

//    Area Of Rectangle Program
    static void areaOfRectangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Calculate the area of Rectangle");
        System.out.print("Enter the length: ");
        double l = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        double b = sc.nextDouble();
        double area = l*b;
        System.out.println("Area: " + area);
        sc.close();
    }

//    Area of Isosceles Triangle ( two sides are equal)
    static void isoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of an Isosceles Triangle");
        System.out.print("Enter length of equal sides: ");
        double a = sc.nextDouble();
        System.out.print("Enter length of base: ");
        double b = sc.nextDouble();
        double area = b/4*Math.sqrt(4*a*a-b*b);
        System.out.printf("Area: %.2f ", area);
    }

}
