<h2>Exception Handling</h2>

What is an Exception? 
An Exception is an event that occurs during the execution of a program that disrupts the normal flow of instructions. 

The parent class of Throwable is Object Class 
Throwable - 2 Children :  1. Exception 2. Error
Exception has 2 Children : 1. RuntimeException and  2. Compile-timeException 

2 Kinds of Errors:
Compile time errors
Runtime time errors

Sources of Errors:
- Input Errors (mostly occurred)
- Device Errors
- Physical Limitations
- Code Errors (mostly occurred)

Errors can't be handle, since they are irrecoverable.

2 Kinds of Exceptions in Java:
- Checked Exception (Compile-time) since this is checked by the compiler
- Unchecked Exception (Runtime) since this cannot be checked by the compiler

What should be done when an error occurred?
- Notify the user if an error occurs
- Save all work
- Allow users to exit from the program smoothly (gracefully shutdown) - not abnormally terminate -> is called a 'crash', and nothing after that point gets executed.


Runtime Errors are more severe than Compiletime Exceptions since we unaware of what and when they might occur but in compile time exceptions we told by the compiler what needs to be done since these exceptions are checked.

So inorder to solve the above issue we can enforce exception handling, using keywords like try and catch, final.. Hence Unchecked Exceptions are more important to handle


What are checked exceptions?
The Exceptions which extend Throwable class except Runtime Exception and Error

What are unchecked exceptions?
The Exceptions which extend Throwable class except Compile time Exception
These can be Runtime Exceptions and Errors

Difference between Checked and Unchecked Exceptions
Checked
-  Here the compiler knows about the exception
- The compiler tells the program to declare the exception or use try catch blokc

Uncheked
- Here the compiler is unaware of the exception
- Hence the programmer needs to take care of everything




<h5>Handling Exceptions</h5>
In Java, we are provided with 5 keywords, **try, catch, finally, throw and throws**

try-checks for potential exceptions
catch-error objects are handled

try is a block
catch is an expression with a block
finally is a block
throw it is a statement declares exceptions objects
throws t is a statement declares exceptions class
Therefore 3 blocks and 2 statements

'try' block:
- This block contains the code that might throw an exception. Try block is used to enclose the code that may or may not throw an exception
- try must be followed by a catch, if catch is not there too then at least it should be followed by a finally block.
You can have the 3 too in the following order try -> catch -> finally. (you should not add any code in betweeen them)


try-catch block
try{
	o =  x/y; //if y=0, then it throws new java.lang.ArithmeticException() - object
} catch (ArithmeticException e){ //here the throw finds the catch block and this is caught by the expression with e
//Now in the catch we handle this exception object e in the following ways
1. System.out
2. System.err - so Java said if any error is there, then put it in an error stream, so in web applications error bases need to be defined and they cant be part of the code, you have to define to some error page. SO if error occurs then redefine to that error page. Same thing in a program just like that in a stream for errors.
What is System.err.println() - all errors are printed on the monitor.
3. e.printStackTrace()
4. e.getMessage() - get error description
}

the 'o=x/y' is kept inside the try block because it has the potential to cause an Exception (int this ArithmeticException).



