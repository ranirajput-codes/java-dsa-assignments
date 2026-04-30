package functions;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        pythagoreanTriplet();
    }
    static void pythagoreanTriplet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int a2 = a*a;
        int b2 = b*b;
        int c2 = c*c;
        if(a2+b2==c2 || b2+c2==a2 || c2+a2==b2){
            System.out.println("PythagoreanTriplet");
        }else{
            System.out.println("Not Pythagorean Triplet");
        }
    }
}
