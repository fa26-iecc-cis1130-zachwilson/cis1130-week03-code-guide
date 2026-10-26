import java.util.Scanner;

/*
 * SentinelLoopExample.java
 * CIS 1130 Week 3 Code Guide: Chapter 5, sentinel-controlled loops
 *
 * A SENTINEL is a special input that means "stop." The user doesn't know in
 * advance how many values they'll enter, so we loop until the sentinel appears.
 *
 * Pattern:
 *   read the first value
 *   while (value is NOT the sentinel) {
 *       process the value
 *       read the next value
 *   }
 *
 * The sentinel itself is never processed.
 *
 * Compile and run:
 *   javac SentinelLoopExample.java
 *   java SentinelLoopExample
 */
public class SentinelLoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int wordCount = 0;
        int totalLetters = 0;
        String longest = "";

        System.out.print("Enter a word (type done to finish): ");
        String word = input.next();

        while (!word.equalsIgnoreCase("done")) {
            wordCount++;
            totalLetters += word.length();
            if (word.length() > longest.length()) {
                longest = word;            // remember the longest word so far
            }
            System.out.print("Enter a word (type done to finish): ");
            word = input.next();
        }

        if (wordCount == 0) {
            // Guard against dividing by zero when nothing was entered.
            System.out.println("No words entered.");
        } else {
            System.out.println("Words entered: " + wordCount);
            System.out.printf("Average length: %.1f letters%n", (double) totalLetters / wordCount);
            System.out.println("Longest word: " + longest);
        }
    }
}
