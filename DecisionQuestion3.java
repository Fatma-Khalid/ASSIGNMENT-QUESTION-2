import java.util.Scanner;

public class DecisionQuestion3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee ID number: ");
        int employeeId = scanner.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter number of hours worked for the week: ");
        double hoursWorked = scanner.nextDouble();
         double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);
        double regularPay = regularHours * hourlyRate;
        double overtimePay = overtimeHours * hourlyRate * 1.5;
        double grossPay = regularPay + overtimePay;
        double incomeTax = grossPay > 500.00 ? 0.15 * grossPay : 0;
        double parkingCharge = 20.00;
        double deductions = incomeTax + parkingCharge;
        double netPay = grossPay - deductions;
        System.out.println("ID Number:\t" + employeeId);
        System.out.println("Pay Rate:\t" + hourlyRate);
        System.out.println("Regular Hours:\t" + regularHours);
        System.out.println("Overtime Hours:\t" + overtimeHours);
        System.out.println("Total Hours:\t" + hoursWorked);
        System.out.println("Regular Pay:\t" + regularPay);
        System.out.println("Overtime Pay:\t" + overtimePay);
        System.out.println("Gross Pay:\t" + grossPay);
        System.out.println("Deductions:\t" + deductions);
        System.out.println("Net Pay:\t" + netPay);

        scanner.close();
    }
}