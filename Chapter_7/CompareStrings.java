import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        String predefinedName = "Carmen";

        System.out.print("Enter your name > ");
        String userInput = input.nextLine();

        if (userInput.equals(predefinedName)) {
            System.out.println(predefinedName + " equals " + userInput);
        } else {
            System.out.println(predefinedName + " does not equal " + userInput);
        }       
        input.close();
    }
}