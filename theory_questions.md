# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.

Checked Exception                                      Unchecked Exception
Checked at compile time                                  Checked at runtime
Must be handled using try-catch or throws             Handling is optional
Extends Exception class                                 Extends Runtime Exception class

Example:
Checked Exception: IOException
Unchecked Exception: ArithmeticException

2)Explain difference between:

throw

throws

Where do we use each one?
throw                                           throws
Used to explicitly throw an exception           Used to declare an exception
Written inside method body                       Written in method signature
Throws an exception object                       Indicates possible exceptions
throw new InvalidMarksException("Invalid Marks");
void validateMarks() throws InvalidMarksException

3)Why do we need it instead of built-in exceptions?
Custom exceptions help represent application-specific errors clearly and make programs easier to understand and maintain.
Real-life Example:
In an ATM application, if a user tries to withdraw more money than the available balance, we can create:
class InsufficientBalanceException extends Exception

Give a real-life example where custom exception is useful.
