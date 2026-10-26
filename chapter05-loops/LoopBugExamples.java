/*
 * LoopBugExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 5, common loop bugs and how to fix them
 *
 * Each BUG is shown in a comment so this file still runs.
 * The FIXED version below it is the code that actually executes.
 *
 * Compile and run:
 *   javac LoopBugExamples.java
 *   java LoopBugExamples
 */
public class LoopBugExamples {
    public static void main(String[] args) {

        // ===== Bug 1: Infinite loop (the counter never changes) =====
        // int n = 3;
        // while (n > 0) {
        //     System.out.println(n);        // prints 3 forever
        // }
        int n = 3;
        while (n > 0) {
            System.out.println("Bug 1 fixed: " + n);
            n--;                              // FIX: update the variable the condition checks
        }

        // ===== Bug 2: Off-by-one (runs one extra time) =====
        // Goal: print exactly 5 lines.
        // for (int i = 0; i <= 5; i++)      // runs 6 times: 0,1,2,3,4,5
        for (int i = 0; i < 5; i++) {         // FIX: start at 0 with <, or start at 1 with <=
            System.out.println("Bug 2 fixed, line " + (i + 1));
        }

        // ===== Bug 3: Going past the end of a String =====
        String word = "loop";
        // for (int i = 0; i <= word.length(); i++)   // crashes: StringIndexOutOfBoundsException
        for (int i = 0; i < word.length(); i++) {     // FIX: last index is length() - 1
            System.out.print(word.charAt(i));
        }
        System.out.println("  (Bug 3 fixed)");

        // ===== Bug 4: A stray semicolon =====
        // for (int i = 0; i < 3; i++);      // the ; IS the loop body, so it does nothing 3 times
        //     System.out.println("Hi");     // then this runs only once
        for (int i = 0; i < 3; i++) {         // FIX: no semicolon after the loop header
            System.out.println("Bug 4 fixed: Hi #" + (i + 1));
        }

        // ===== Bug 5: Resetting the total inside the loop =====
        // for (int i = 1; i <= 4; i++) {
        //     int total = 0;                 // reset every pass, so it never adds up
        //     total += i;
        // }
        int total = 0;                        // FIX: create and start the total BEFORE the loop
        for (int i = 1; i <= 4; i++) {
            total += i;
        }
        System.out.println("Bug 5 fixed: 1 + 2 + 3 + 4 = " + total);   // 10

        // ===== Debugging tip: trace with print statements =====
        // When a loop misbehaves, print the variables on each pass to see what's happening.
        int value = 1;
        int pass = 0;
        while (value < 50) {
            pass++;
            value = value * 3;
            System.out.println("  trace -> pass " + pass + ": value = " + value);
        }
    }
}
