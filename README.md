Golang interpreter in Java

This project is a basic interpreter for GoLang implemented in Java. The interpreter provides minimal support for a subset of GoLang syntax and functionalities, specifically focusing on expressions, conditional statements, loops, and variable management within the func main() block. The interpreter reads GoLang source files, extracts the main function, and executes its contents statement by statement. 

Team members
Mariam Devsurashvili Parsing Logic and Expression Evaluation, Contributed to designing the interpreter's initial architecture by implementing half of the required algorithms in Go.
Ekaterine Gamsakhurdia Initial Interpreter Design, Core Logic Implementation, Contributed to designing the interpreter's initial architecture by implementing half of the required algorithms in Go.

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
            
First we implemented the listed algorithms in go and based on those codes we decided what exactly we needed to consider in our simple interpreter and what was not crucial.

User guide to the Interpreter 

The interpreter can read the code straigt from a go file
In order to run a program the file must have the main function, the code in the main function is executed. Without the main function, exception is thrown.
