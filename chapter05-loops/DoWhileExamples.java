import java.util.Scanner;

/*
 * DoWhileExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 5, do-while loops
 *
 * A do-while loop checks its condition AFTER every repetition,
 * so the body ALWAYS runs at least once. Notice the semicolon at the end.
 *
 *   do {
 *       // runs at least once
 *   } while (condition);
 *
 * Great for: input validation and menus that must show at least once.
 *
 * Compile and run:
 *   javac DoWhileExamples.java
 *   java DoWhileExamples
 */
public class DoWhileExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------- Input validation with do-while ----------
        // Compare this to the while version: no need to ask once before the loop.
        int pin;
        do {
            System.out.print("Create a 4-digit PIN (1000 to 9999): ");
            pin = input.nextInt();
            if (pin < 1000 || pin > 9999) {
                System.out.println("A PIN must be exactly 4 digits.");
            }
        } while (pin < 1000 || pin > 9999);
        System.out.println("PIN saved.");

        // ---------- A menu that repeats until the user quits ----------
        // A do-while + switch is the classic pattern for a text menu.
        double balance = 50.00;
        int choice;
        do {
            System.out.println();
            System.out.println("--- Bus Pass ---");
            System.out.println("1. Check balance");
            System.out.println("2. Add $10");
            System.out.println("3. Take a ride ($2.25)");
            System.out.println("4. Quit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Balance: $%.2f%n", balance);
                    break;
                case 2:
                    balance += 10;
                    System.out.println("Added $10.");
                    break;
                case 3:
                    if (balance >= 2.25) {
                        balance -= 2.25;
                        System.out.println("Enjoy your ride!");
                    } else {
                        System.out.println("Not enough money on the pass.");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please choose 1 to 4.");
            }
        } while (choice != 4);
    }
}
