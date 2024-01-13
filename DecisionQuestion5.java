import java.util.Scanner;

public class DecisionQuestion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quiz score: ");
        int quizScore = scanner.nextInt();
        char grade = calculateGrade(quizScore);
        System.out.println("The corresponding grade is: " + grade);
        scanner.close();
    }
        private static char calculateGrade(int score) {
        char grade;
         if (score == 5) {
            grade = 'A';
        } else if (score == 4) {
            grade = 'B';
        } else if (score == 3) {
            grade = 'C';
        } else if (score == 2) {
            grade = 'D';
        } else if (score == 1 || score == 0) {
            grade = 'F';
        } else {
            grade = 'I';  
        }
         return grade;
    }
}