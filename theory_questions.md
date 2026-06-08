# Day11_JavaIgnite2026

1)What is the difference between:
Checked Exception
Unchecked Exception
Give one Java example for each.
ANS:
Checked Exception
These exceptions are checked by the compiler.
They must be handled using try-catch or throws.
Example: IOException
Unchecked Exception
These exceptions are not checked by the compiler.
Handling them is optional.
Example: ArithmeticException


2)Explain difference between:
throw
throws
Where do we use each one?
ANS:
throw
throw is used to throw an exception manually.
It is written inside a method or block.
It throws only one exception at a time.
Example: throw new ArithmeticException();
throws
throws is used to declare an exception.
It is written in the method signature.
It tells the compiler that the method may throw an exception.
Example: void display() throws IOException
void checkMarks() throws InvalidMarksException
{
    // code
}


3)Why do we need it instead of built-in exceptions?
Give a real-life example where custom exception is useful.
ANS:
Custom exceptions are used to create our own exceptions according to program requirements.
They provide meaningful error messages.
They make the program easier to understand and maintain.
Real-life Example:
In a bank application, if a user tries to withdraw more money than available in the account, we can create a custom exception called InsufficientBalanceException.
This will show a clear message like "Insufficient Balance!" instead of a general error message.
