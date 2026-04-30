package assignment;
import java.util.Scanner;

public class condition_loop_2 {
    public static void main(String[] args) {
        parallelogram();
        Rhombus();
        equilateralTriangle();
        perimeterOfCircle();
        pOfEquilateralTriangle();
        perimeterOfParallelogram();
        volumeOfCone();
        perimeterOfRhombus();
        perimeterOfSquare();
        perimeterOfRectangle();
        parallelogram();
    }

    //    Area Of Parallelogram
    static void parallelogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of Parellelogram");
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        int area = height * base;
        System.out.println("Area: " + area);
    }

    //    Area of Rhombus
    static void Rhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Calculate Area of Rhombus");
        System.out.println("Select The Method");
        System.out.println("If using base and height (Enter 1) ");
        System.out.println("If using Diagonals (Enter 2)");
        int method = sc.nextInt();

        if (method == 1) {
            System.out.print("Enter base: ");
            int base = sc.nextInt();
            System.out.print("Enter height: ");
            int height = sc.nextInt();
            int area = base * height;
            System.out.println("Area : " + area);
        } else {
            System.out.print("Enter d1 : ");
            int d1 = sc.nextInt();
            System.out.print("Enter d2 : ");
            int d2 = sc.nextInt();
            int area = (d1 * d2) / 2;
            System.out.println("Area: " + area);
        }
    }

    //      area of equilateral triangle
    static void equilateralTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of Equilateral Triangle");
        System.out.print("Enter the side: ");
        double a = sc.nextDouble();
        double ans = (Math.sqrt(3) * a * a) / 4;
        System.out.printf("Area: %.2f", ans);
    }

    //    Perimeter Of Circle
    static void perimeterOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to calculate Area of circle ");
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double ans = 2 * Math.PI * radius;
        System.out.printf("Perimeter: %.2f", ans);
    }

    //    Perimeter Of Equilateral Triangle
    static void pOfEquilateralTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter of Equilateral Triangle");
        System.out.print("Enter side's value: ");
        int a = sc.nextInt();
        int ans = 3 * a;
        System.out.println("Perimeter: " + ans);
    }

    //    Perimeter Of Parallelogram
    static void perimeterOfParallelogram() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter Of Parallelogram");
        System.out.print("Enter side: ");
        double side = sc.nextDouble();
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        double ans = 2 * (side + base);
        System.out.println("Perimeter: " + ans);
    }

    //    Perimeter Of Rectangle
    static void perimeterOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter Of Rectangle");
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.println("Enter width: ");
        int width = sc.nextInt();
        int ans = 2 * (length + width);
        System.out.println("perimeter: " + ans);
    }

    //    Perimeter Of Square
    static void perimeterOfSquare() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter Of Square");
        System.out.print("Enter Side: ");
        int side = sc.nextInt();
        int ans = 4 * side;
        System.out.print("Perimetre: " + ans);
    }

    //    Perimeter Of Rhombus
    static void perimeterOfRhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perimeter Of Rhombus");
        System.out.print("Enter Side: ");
        int side = sc.nextInt();
        int ans = 4 * side;
        System.out.print("Perimeter: " + ans);
    }

    //    Volume Of Cone Java Program
    static void volumeOfCone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Volume Of Cone Java Program");
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println("Enter height: ");
        double height = sc.nextDouble();
        double ans = (Math.PI * radius * radius * height) * 3;
        System.out.println("Volume: " + ans);
    }

}

