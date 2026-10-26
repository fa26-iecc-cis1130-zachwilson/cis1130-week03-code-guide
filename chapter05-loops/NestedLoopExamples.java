/*
 * NestedLoopExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 5, nested loops
 *
 * A nested loop is a loop inside another loop.
 * For EACH pass of the outer loop, the inner loop runs ALL the way through.
 *
 * Think of a clock: the minute hand (inner loop) goes all the way around
 * for every single step of the hour hand (outer loop).
 *
 * Compile and run:
 *   javac NestedLoopExamples.java
 *   java NestedLoopExamples
 */
public class NestedLoopExamples {
    public static void main(String[] args) {

        // ---------- A rectangle: 3 rows by 5 columns ----------
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("# ");
            }
            System.out.println();          // move to the next line after each row
        }
        System.out.println();

        // ---------- A right triangle ----------
        // The inner loop's limit depends on the outer loop's counter.
        for (int row = 1; row <= 5; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // ---------- A number grid ----------
        // The outer loop picks the row; the inner loop counts across it.
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.printf("%4s", row + "," + col);
            }
            System.out.println();
        }
        System.out.println();

        // ---------- Counting total passes ----------
        // How many times does the inner body run? outer count x inner count.
        int passes = 0;
        for (int outer = 1; outer <= 4; outer++) {
            for (int inner = 1; inner <= 3; inner++) {
                passes++;
            }
        }
        System.out.println("Inner body ran " + passes + " times");   // 4 x 3 = 12
        System.out.println();

        // ---------- Clock time: hours and minutes ----------
        // Prints the times from 1:00 to 2:45 in 15-minute steps.
        for (int hour = 1; hour <= 2; hour++) {
            for (int minute = 0; minute < 60; minute += 15) {
                System.out.printf("%d:%02d  ", hour, minute);
            }
            System.out.println();
        }
    }
}
