import java.util.Scanner;
public class BankBalance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0; 
        final double INTEREST_RATE = 0.03;
        int year = 1;
        int choice;
        System.out.print("Enter initial bank balance >> ");
        balance = sc.nextDouble();

        do {
            balance += balance * INTEREST_RATE;
            System.out.println("After year " + year + " at " + INTEREST_RATE + " interest rate, balance is $" + balance);
            year++;
            System.out.println("\n Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes \n or any other number for no >> ");
            choice = sc.nextInt();
        } while (choice == 1);
        sc.close();
    }
}
