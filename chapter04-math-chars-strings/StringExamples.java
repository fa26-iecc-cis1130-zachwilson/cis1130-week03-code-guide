import java.util.Scanner;

/*
 * StringExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 4, Strings
 *
 * Every character in a String has an index, starting at 0:
 *
 *     "Wabash"
 *      012345
 *
 * String methods never change the original String. They return a NEW one,
 * so save the result:  name = name.trim();
 *
 * Compile and run:
 *   javac StringExamples.java
 *   java StringExamples
 */
public class StringExamples {
    public static void main(String[] args) {

        String city = "Wabash Valley";

        // ---------- Length and characters ----------
        System.out.println("Length: " + city.length());                          // 13
        System.out.println("First character: " + city.charAt(0));                // W
        System.out.println("Last character: " + city.charAt(city.length() - 1)); // y

        // ---------- Searching ----------
        System.out.println("Index of \"Valley\": " + city.indexOf("Valley"));    // 7
        System.out.println("Index of 'a': " + city.indexOf('a'));                // 1 (the first one)
        System.out.println("Index of \"Hill\": " + city.indexOf("Hill"));        // -1 means not found
        System.out.println("Contains \"bash\"? " + city.contains("bash"));       // true

        // ---------- Pieces of a String ----------
        // substring(start, end) goes from start up to, but NOT including, end.
        System.out.println(city.substring(0, 6));    // Wabash
        System.out.println(city.substring(7));       // Valley (from 7 to the end)

        // Split a String at a space without knowing where the space is:
        int space = city.indexOf(" ");
        String firstWord = city.substring(0, space);
        String secondWord = city.substring(space + 1);
        System.out.println("[" + firstWord + "] and [" + secondWord + "]");

        // ---------- Changing case and trimming ----------
        String messy = "   java ROCKS   ";
        System.out.println("[" + messy.trim() + "]");               // [java ROCKS]
        System.out.println(messy.trim().toLowerCase());             // java rocks
        System.out.println(messy.trim().toUpperCase());             // JAVA ROCKS

        // ---------- Joining (concatenation) ----------
        String course = "CIS " + 1130;          // + joins a String and a number
        System.out.println(course);              // CIS 1130

        // ---------- Comparing Strings ----------
        // NEVER use == to compare Strings. Use equals or equalsIgnoreCase.
        String typed = "QUIT";
        System.out.println(typed.equals("quit"));            // false (case matters)
        System.out.println(typed.equalsIgnoreCase("quit"));  // true

        // compareTo puts Strings in dictionary order:
        //   negative = comes before, 0 = same, positive = comes after
        System.out.println("apple".compareTo("banana"));     // a negative number

        // ---------- Looping through every character ----------
        // (You'll learn loops in Chapter 5; this pattern is used constantly.)
        String code = "Room 214B";
        int digits = 0;
        for (int i = 0; i < code.length(); i++) {
            if (Character.isDigit(code.charAt(i))) {
                digits++;
            }
        }
        System.out.println("\"" + code + "\" contains " + digits + " digits.");  // 3

        // ---------- Reading text with Scanner ----------
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();   // IMPORTANT: clears the Enter key left behind by nextInt()

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine().trim();   // nextLine reads the whole line, spaces included

        System.out.println("Hi " + fullName.toUpperCase() + ", next year you'll be " + (age + 1) + ".");
    }
}
