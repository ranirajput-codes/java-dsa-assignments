package functions;
import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        grades();
    }
    static void grades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks (out of 100): ");
        int marks = sc.nextInt();
        if(marks>=91&&marks<=100){
            System.out.println("Grades: AA");
        } else if (marks>=81&&marks<=90) {
            System.out.println("Grades: AB");
        } else if (marks>=71&&marks<=80) {
            System.out.println("Grades: BB");
        }else if (marks>=61&&marks<=70) {
            System.out.println("Grades: BC");
        }else if (marks>=51&&marks<=60) {
            System.out.println("Grades: CD");
        }else if (marks>=41&&marks<=50) {
            System.out.println("Grades: DD");
        }else{
            System.out.println("You are fail!");
        }
    }
}
