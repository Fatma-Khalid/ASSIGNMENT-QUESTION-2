import java.util.Scanner;
public class DecisionQuestion4 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         String[] runnerNames = new String[3];
        double[] raceTimes = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the name of runner " + (i + 1) + ": ");
            runnerNames[i] = scanner.nextLine();
             System.out.print("Enter the race time (in minutes) for " + runnerNames[i] + ": ");
            raceTimes[i] = scanner.nextDouble();
             scanner.nextLine();
        }
        sortRunners(runnerNames, raceTimes);
         System.out.println("\nRunners in the order they finished:");
         for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + runnerNames[i]);
        }
         scanner.close();
    }
        private static void sortRunners(String[] names, double[] times) {
        int n = names.length;
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (times[j] > times[j + 1]) {
                   double tempTime = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempTime;
                     String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}