# CIS 1130 Week 3 Code Guide: Strings and Loops

Runnable, fully commented Java examples for **Week 3** of CIS 1130 Intro to Computer Science (IECC Online). Every file goes with a Week 3 Learning Guide in Canvas. Read the comments, run the program, then change something and run it again. That's the fastest way to learn how each piece works.

## How to use this repository

1. Open the course JupyterHub and start a **Terminal**.
2. Copy this repository into your workspace (you only need to do this once):

   ```
   git clone https://github.com/fa26-iecc-cis1130-zachwilson/cis1130-week03-code-guide.git
   cd cis1130-week03-code-guide
   ```

3. Move into a chapter folder, then compile and run any example:

   ```
   cd chapter05-loops
   javac ForLoopExamples.java
   java ForLoopExamples
   ```

4. Stuck in an infinite loop? Press **Ctrl + C** to stop the program.

You can also just read the files here on GitHub. Select a file name to view it.

## What's inside

### Chapter 4: Math Functions, Characters, and Strings

| File | What it shows | Try this |
|------|---------------|----------|
| `MathExamples.java` | `pow`, `sqrt`, `abs`, `max`, `min`, `round`, `ceil`, `floor`, `Math.PI`, random numbers, the distance formula | Change the die roll to a 20-sided die. |
| `CharacterExamples.java` | chars as numbers, `Character` methods, converting case, digit characters to numbers | Print the Unicode values of the letters in your first name. |
| `StringExamples.java` | `length`, `charAt`, `indexOf`, `substring`, `trim`, case, `equals` vs `equalsIgnoreCase`, Scanner and `nextLine` | Print just the last word of a sentence the user types. |

### Chapter 5: Loops

| File | What it shows | Try this |
|------|---------------|----------|
| `WhileLoopExamples.java` | Counting, repeating until a goal is reached, input validation | Change the interest rate and see how the years change. |
| `DoWhileExamples.java` | Validation that always runs once, and a repeating menu with `switch` | Add a menu option that shows how many rides are left. |
| `ForLoopExamples.java` | Counting up, down, and by steps; totals; tables; walking through a String; `break` and `continue` | Total only the even numbers from 1 to 100. |
| `SentinelLoopExample.java` | Reading values until a stop word, with a divide-by-zero guard | Also report the shortest word. |
| `NestedLoopExamples.java` | Rectangles, triangles, grids, and counting inner-loop passes | Print the triangle upside down. |
| `LoopBugExamples.java` | Five common loop bugs and their fixes, plus tracing with print statements | Uncomment one bug at a time and see what happens. |

## A note on your own work

These examples teach the concepts. They are **not** homework or project solutions, and your graded work must be written by you. Use this code to learn the patterns, then write your own programs. See the Course Policies page in Canvas for the full academic integrity and AI rules.

Questions? Email Zach Wilson at wilsonz@iecc.edu.
