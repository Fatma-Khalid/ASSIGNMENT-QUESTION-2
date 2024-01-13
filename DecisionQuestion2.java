import java.util.Scanner;

public class DecisionQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit integer: ");
    try {
            int userInput = scanner.nextInt();
            if (isFiveDigitInteger(userInput)) {
                if (isPalindrome(userInput)) {
                    System.out.println(userInput + " is a palindrome.");
                } else {
                    System.out.println(userInput + " is not a palindrome.");
                }
            } else {
                System.out.println("Please enter a five-digit integer.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
private static boolean isPalindrome(int number) {
        String numberStr = Integer.toString(number);
        String reversedStr = new StringBuilder(numberStr).reverse().toString();
        return numberStr.equals(reversedStr);
    }
private static boolean isFiveDigitInteger(int number) {
        return number >= 10000 && number <= 99999;
    }
}