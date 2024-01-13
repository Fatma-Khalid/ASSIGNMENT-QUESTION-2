import java.util.Scanner;

public class RepetitionQuestion6 copy {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int userInput;
        do {
            System.out.print("Enter an integer (or -99 to end): ");
            userInput = scanner.nextInt();
            if (userInput != -99) {
                if (userInput > largest) {
                    largest = userInput;
                }
                if (userInput < smallest) {
                    smallest = userInput;
                }
            }
         } while (userInput != -99);
        if (largest != Integer.MIN_VALUE && smallest != Integer.MAX_VALUE) {
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
        } else {
            System.out.println("No valid numbers entered.");
        }
        scanner.close();
    }
}