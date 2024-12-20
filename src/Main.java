import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter the grade for subject " + (i + 1) + ": ");
            double grade = sc.nextDouble();
            if(grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100");
                i--;
                continue;
            } else {
                grades.add(grade);
            }
        }

        CalculateGrade calculateGrade = new CalculateGrade(grades);
        System.out.println("Average: " + calculateGrade.calculateAverage());
        System.out.println(calculateGrade.calculateGrade());
    }
}