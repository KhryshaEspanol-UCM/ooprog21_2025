public class Employee {
    private int employeeNumber;
    private double payRate;
    private final int MAX_EMPLOYEE_NUMBER = 9999;
    private final double MAX_RATE = 60.00;
    private final double OVERTIME_RATE_MULTIPLIER = 1.5;
    public Employee(double payRate) {
        this.employeeNumber = 9999 ;
        this.payRate = payRate;
    }
    public double getRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }
    public double getOvertimePay(double hoursWorked) {
        double overtimeHours = Math.max(0, hoursWorked - 40);
        return overtimeHours * (payRate * OVERTIME_RATE_MULTIPLIER);
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public double getPayRate() {
        return payRate;
    }
}