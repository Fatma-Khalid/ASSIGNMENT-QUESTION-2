import java.util.Scanner;

public class RepititionQuestion2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the speed of the vehicle in mph? ");
        double speed = scanner.nextDouble();
        System.out.print("How many hours has it traveled? ");
        int hours = scanner.nextInt();
        System.out.println("\nHour\tDistance Traveled");
        for (int hour = 1; hour <= hours; hour++) {
            double distance = speed * hour;
            System.out.println(hour + "\t" + distance);
        }
         scanner.close();
    }
}