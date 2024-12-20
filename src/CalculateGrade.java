import java.util.ArrayList;

public class CalculateGrade {
    ArrayList<Double> grades = new ArrayList<>(); 
    CalculateGrade(ArrayList<Double> grades) {
        this.grades = grades;
    }
    
    public double calculateAverage() {
        double sum = 0;
        for (double grade: grades) {
            sum += grade;
        }
        return (sum /  grades.size());
    }
    
    public String calculateGrade() {
        double average = calculateAverage();
        char grade;
        if (average >= 90 && average <= 100) {
            grade = 'A';
        } else if (average >= 80 && average < 90) {
            grade = 'B';
        } else if (average >= 70 && average < 80) {
            grade = 'C';
        } else if (average >= 60 && average < 70) {
            grade = 'D';
        } else if (average < 60 && average >= 0) {
            grade = 'F';
        } else {
            grade = 'X';
        }
        switch(grade){
            case 'A':
                return "You got an A!";
            case 'B':
                return "You got a B!";
            case 'C':
                return "You got a C!";
            case 'D':
                return "You got a D!";
            case 'F':
                return "You got an F!";
            default:
                return "Invalid grade!";
        }
    }
}
