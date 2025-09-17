class DemoGrossPay {
    public static void main(String[] a) {
        calculateGross(10, 22.75);
        calculateGross(25, 22.75);
        calculateGross(37.5, 22.75);
    }  
    public static void calculateGross(double hoursWorked, double hourlyRate) {
        double totalPayment = hoursWorked * hourlyRate;
        System.out.println(hoursWorked + " hours at $" + hourlyRate + " per hour is $" + totalPayment);
    }
}
