import java.util.Scanner;
public class RepetitionQuestin4 {
public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;
        do {
            System.out.print("Enter a positive number (or a negative number to end): ");
            userInput = scanner.nextInt();
            if (userInput >= 0) {
                sum += userInput;
            } else {
                break;
            }
        } while (true);
         System.out.println("The sum of positive numbers entered is: " + sum);
          scanner.close();
    }
}