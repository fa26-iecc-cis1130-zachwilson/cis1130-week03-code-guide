/*
 * CharacterExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 4, characters
 *
 * A char holds ONE character in single quotes: 'A', '7', '$', ' '
 * Behind the scenes, every char is stored as a number (its Unicode value).
 *
 * Compile and run:
 *   javac CharacterExamples.java
 *   java CharacterExamples
 */
public class CharacterExamples {
    public static void main(String[] args) {

        // ---------- chars are numbers underneath ----------
        char letter = 'A';
        System.out.println("The character: " + letter);          // A
        System.out.println("Its Unicode value: " + (int) letter); // 65

        char next = (char) (letter + 1);   // 65 + 1 = 66, which is 'B'
        System.out.println("The next letter: " + next);           // B

        // Lowercase letters come 32 positions after uppercase ones.
        System.out.println("'a' is " + (int) 'a');                // 97

        // Careful: "+" with a char and a number does math, not joining.
        System.out.println('A' + 1);        // prints 66, not A1
        System.out.println("" + 'A' + 1);   // prints A1 (starts with a String)

        // ---------- Character class methods ----------
        // Check each character of a short String (loops are covered in Chapter 5).
        String samples = "Gg7# ";
        for (int i = 0; i < samples.length(); i++) {
            char ch = samples.charAt(i);
            System.out.println("'" + ch + "'"
                + "  letter? " + Character.isLetter(ch)
                + "  digit? " + Character.isDigit(ch)
                + "  uppercase? " + Character.isUpperCase(ch)
                + "  whitespace? " + Character.isWhitespace(ch));
        }

        // ---------- Converting case ----------
        char small = 'm';
        char big = Character.toUpperCase(small);
        System.out.println(small + " in uppercase is " + big);    // M

        // ---------- Turning a digit character into a number ----------
        char digitChar = '7';
        int digitValue = digitChar - '0';    // '7' is 55, '0' is 48, so 55 - 48 = 7
        System.out.println("The digit as a number, times 2: " + (digitValue * 2)); // 14

        // ---------- Comparing characters ----------
        // chars can be compared with == because they are numbers (unlike Strings!).
        char answer = 'y';
        if (answer == 'y' || answer == 'Y') {
            System.out.println("You answered yes.");
        }
    }
}
