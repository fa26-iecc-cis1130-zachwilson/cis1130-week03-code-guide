/*
 * MathExamples.java
 * CIS 1130 Week 3 Code Guide: Chapter 4, the Math class
 *
 * The Math class is built into Java, so there is nothing to import.
 * Every method is called with "Math." in front of it.
 *
 * Compile and run:
 *   javac MathExamples.java
 *   java MathExamples
 */
public class MathExamples {
    public static void main(String[] args) {

        // ---------- Powers and roots ----------
        // Math.pow and Math.sqrt always return a double, even for whole numbers.
        double eightCubed = Math.pow(8, 3);      // 8 * 8 * 8
        double rootOf144 = Math.sqrt(144);
        System.out.println("8 cubed is " + eightCubed);        // 512.0
        System.out.println("Square root of 144 is " + rootOf144); // 12.0

        // Cast to int when you need a whole number.
        int wholeCube = (int) Math.pow(8, 3);
        System.out.println("As an int: " + wholeCube);           // 512

        // ---------- Absolute value, max, and min ----------
        int temperatureChange = -7;
        System.out.println("Size of the change: " + Math.abs(temperatureChange)); // 7
        System.out.println("Larger of 14 and 9: " + Math.max(14, 9));            // 14
        System.out.println("Smaller of 14 and 9: " + Math.min(14, 9));          // 9

        // Math.max can be nested to compare three values.
        int highest = Math.max(72, Math.max(88, 65));
        System.out.println("Highest of 72, 88, 65: " + highest);                 // 88

        // ---------- Rounding ----------
        double price = 18.4999;
        System.out.println("Math.round(18.4999) = " + Math.round(price));  // 18
        System.out.println("Math.round(2.5)     = " + Math.round(2.5));    // 3
        System.out.println("Math.ceil(2.1)      = " + Math.ceil(2.1));     // 3.0 (always rounds up)
        System.out.println("Math.floor(2.9)     = " + Math.floor(2.9));    // 2.0 (always rounds down)

        // To round money to cents, printf is usually the better choice:
        System.out.printf("Formatted: $%.2f%n", price);                     // $18.50

        // ---------- A formula: distance between two points ----------
        // distance = square root of ((x2 - x1)^2 + (y2 - y1)^2)
        double x1 = 1, y1 = 2;
        double x2 = 4, y2 = 6;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance from (1, 2) to (4, 6): %.2f%n", distance); // 5.00

        // ---------- Constants ----------
        // Math.PI is a built-in constant.
        double radius = 3;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Area of a circle with radius 3: %.2f%n", area);  // 28.27

        // ---------- Random numbers ----------
        // Math.random() returns a double from 0.0 up to (but not including) 1.0.
        // Pattern for a random whole number from LOW to HIGH:
        //   (int) (Math.random() * (HIGH - LOW + 1)) + LOW
        int dieRoll = (int) (Math.random() * 6) + 1;          // 1 to 6
        int randomPercent = (int) (Math.random() * 101);      // 0 to 100
        System.out.println("You rolled a " + dieRoll);
        System.out.println("Random percent: " + randomPercent + "%");
    }
}
