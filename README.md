# Golang interpreter in Java
<br><br>
This project is a basic interpreter for GoLang implemented in Java. The interpreter provides minimal support for a subset of GoLang syntax and functionalities, specifically focusing on expressions, conditional statements, loops, and variable management within the func main() block. The interpreter reads GoLang source files, extracts the main function, and executes its contents statement by statement. 
<br><br>
### Team members<br>
Mariam Devsurashvili - Parsing Logic and Expression Evaluation, Contributed to designing the interpreter's initial architecture by implementing half of the required algorithms in Go.
<br>
Ekaterine Gamsakhurdia - Initial Interpreter Design, Core Logic Implementation, Contributed to designing the interpreter's initial architecture by implementing half of the required algorithms in Go.
<br><br>

### The goal and workflow
The goal was the interpreter to support the algorithms listed below 
            1. Sum of First N Numbers
            2. Factorial of N
            3. GCD of Two Numbers
            4. Reverse a Number
            5. Check if a Number is Prime
            6. Check if a Number is Palindrome
            7. Find the Largest Digit in a Number
            8. Sum of Digits
            9. Multiplication Table
            10. Nth Fibonacci Number
      <br><br>      
First we implemented the listed algorithms in go and based on those codes we decided what exactly we needed to consider in our simple interpreter and what was not crucial.

Therefore we split the work in two parts, and appropriate two branches. In the main branch we decided to work on the interpreter code itself and in the "Go code" branch included the examples of Golang codes that our interpreter supports. Since there are only two members in our group, we decided to split the work in half, by implementing 5 algorithms and designing half the interpreter for each. After learning GO syntax and writing codes for each algorithm in multiple ways, in-person consultation was held to discuss the syntax, design choices and address implementation challenges. We chose the appropriate syntax and decided on our parts in implementing the interpreter itself. The specific roles are listed above.
<br><br>

# User guide to the Interpreter 
<br>
The interpreter can read the code straigt from a go file <br>
In order to run a program the file must have the main function, the code in the main function is executed. Without the main function, exception is thrown.<br>
New statement should start from a new line. Since GO ignores semicolons (They don't throw errors/exceptions but are not taken into account), we used new lines as splitters. Our interpreter acts the same as GO when it comes to semicolons.<br>
User can comment out lines by using "//"<br>
The interpreter supports the following GoLang features:<br>
Arithmetic Operations: Handles +, -, *, /, and % operators.<br>
Variable Declaration and Assignment (Only using "var" keyword) <br>
Conditional Statements: Supports if statements with logical operators like &&, ||, !, and comparisons such as <, >, <=, >=, ==, and !=.<br>
Loops: Processes for loops with condition-based execution. (for condition)<br>
Input Handling: Reads user input via fmt.Scanln. (We decided it would be good if the user can insert input from the console so we added scanner)<br>
Output Handling: Prints expressions or strings using fmt.Println.<br>
<br>
In order for a code to run successfully the user must use a runCode command and insert path to the file they want to run.<br>

<br><br>
*(All of the go code testers are available in `go-codes` branch)*
