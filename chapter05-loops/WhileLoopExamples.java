import java.util.Scanner;

/*
 * WhileLoopExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 5, while loops
 *
 * A while loop checks its condition BEFORE every repetition.
 * If the condition starts out false, the body never runs at all.
 *
 *   while (condition) {
 *       // repeat this
 *       // something in here MUST eventually make the condition false
 *   }
 *
 * Compile and run:
 *   javac WhileLoopExamples.java
 *   java WhileLoopExamples
 *
 * Stuck in an infinite loop? Press Ctrl + C in the Terminal to stop it.
 */
public class WhileLoopExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------- Counting with while ----------
        int countdown = 5;
        while (countdown > 0) {
            System.out.print(countdown + " ");
            countdown--;                       // without this, the loop never ends
        }
        System.out.println("Liftoff!");        // 5 4 3 2 1 Liftoff!

        // ---------- Repeating until something happens ----------
        // How many years until savings double at 6% interest?
        double balance = 1000.00;
        int years = 0;
        while (balance < 2000.00) {
            balance = balance * 1.06;
            years++;
        }
        System.out.printf("It takes %d years to reach $%.2f%n", years, balance);

        // ---------- Input validation with while ----------
        // Read once, then keep asking while the value is bad.
        System.out.print("Enter a rating from 1 to 5: ");
        int rating = input.nextInt();
        while (rating < 1 || rating > 5) {
            System.out.println("That's not between 1 and 5.");
            System.out.print("Enter a rating from 1 to 5: ");
            rating = input.nextInt();
        }
        System.out.println("Thanks for the " + rating + "-star rating!");
    }
}
