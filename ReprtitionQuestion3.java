import java.util.Scanner;

public class ReprtitionQuestion3 {
     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();
        double totalRainfall = 0.0;
        int totalMonths = numberOfYears * 12;
        for (int year = 1; year <= numberOfYears; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print("Enter the inches of rainfall for Year " + year +
                        ", Month " + month + ": ");
                double rainfall = scanner.nextDouble();
                totalRainfall += rainfall;
            }
        }
            double averageRainfall = totalRainfall / totalMonths;
        System.out.println("\nNumber of Months: " + totalMonths);
        System.out.println("Total Inches of Rainfall: " + totalRainfall);
        System.out.println("Average Rainfall per Month: " + averageRainfall);
         scanner.close();
    }
}
