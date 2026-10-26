/*
 * ForLoopExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 5, for loops
 *
 * A for loop puts the whole counter in one line:
 *
 *   for (start; keep going while; change each time) {
 *       // repeat this
 *   }
 *
 * Use a for loop when you know how many times to repeat.
 *
 * Compile and run:
 *   javac ForLoopExamples.java
 *   java ForLoopExamples
 */
public class ForLoopExamples {
    public static void main(String[] args) {

        // ---------- Counting up ----------
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();                                // 1 2 3 4 5

        // ---------- Counting by a step ----------
        for (int i = 0; i <= 20; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();                                // 0 5 10 15 20

        // ---------- Counting down ----------
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();                                // 10 9 8 ... 1

        // ---------- Accumulating a total ----------
        // Add up the numbers 1 through 100.
        int total = 0;                     // start the total at 0 BEFORE the loop
        for (int n = 1; n <= 100; n++) {
            total += n;
        }
        System.out.println("1 + 2 + ... + 100 = " + total);  // 5050

        // ---------- Building a table ----------
        System.out.println("Miles   Kilometers");
        for (int miles = 1; miles <= 5; miles++) {
            System.out.printf("%5d   %10.2f%n", miles, miles * 1.609);
        }

        // ---------- Walking through a String ----------
        // Indexes go from 0 to length() - 1, so use < length(), not <=.
        String word = "JAVA";
        for (int i = 0; i < word.length(); i++) {
            System.out.println("Index " + i + ": " + word.charAt(i));
        }

        // Build a new String one character at a time (here: add dashes).
        String spaced = "";
        for (int i = 0; i < word.length(); i++) {
            spaced += word.charAt(i);
            if (i < word.length() - 1) {
                spaced += "-";
            }
        }
        System.out.println(spaced);                          // J-A-V-A

        // ---------- break and continue ----------
        // continue skips the rest of THIS pass; break exits the loop completely.
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;          // skip multiples of 3
            }
            if (i > 8) {
                break;             // stop once we pass 8
            }
            System.out.print(i + " ");
        }
        System.out.println();                                // 1 2 4 5 7 8
    }
}
