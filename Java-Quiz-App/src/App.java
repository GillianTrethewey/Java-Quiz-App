import java.util.Scanner;

public class App {

    // Method to greet the user
    public static void greetUser(String userName) {
        String welcomeMessage = "Hello, " + userName + "! Welcome to the math quiz.";
        System.out.println(welcomeMessage);
    }

    // MAIN STRUCTURE

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Take input from user and save it in a variable
        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();
        scan.close();

        // Print customized greeting
        greetUser(userName);
    }
}
