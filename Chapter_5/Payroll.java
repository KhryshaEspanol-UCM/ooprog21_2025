import java.util.Scanner;
public class Payroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hours, rate;
        System.out.print("How many hours did you work this week? ");
        hours = sc.nextDouble();
        System.out.print("What is your regular pay rate? ");
        rate = sc.nextDouble();
        Employee emp = new Employee(rate);
        double regularPay = emp.getRegularPay(hours);
        double overtimePay = emp.getOvertimePay(hours);
        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
        sc.close();
    }
}