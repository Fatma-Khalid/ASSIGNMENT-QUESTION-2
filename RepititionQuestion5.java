import java.util.Scanner;

public class RepititionQuestion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Multiplication Table for " + number + ":");
        System.out.println("---------------------------------");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}