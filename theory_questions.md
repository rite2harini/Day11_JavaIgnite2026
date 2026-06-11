# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.
Checked Exception

A Checked Exception is an exception that the compiler checks at compile time. The programmer must handle it using try-catch or declare it using throws. These exceptions usually occur due to external problems such as file handling. For example, IOException can occur while reading a file.
Eg:FileReader file = new FileReader("data.txt");
Unchecked Exception

An Unchecked Exception is an exception that is not checked by the compiler at compile time. It occurs during program execution because of coding mistakes. The programmer is not required to handle it. For example, NullPointerException occurs when trying to use a null object reference.
Eg:String name = null;
System.out.println(name.length());



2)Explain difference between:

throw

throws

Where do we use each one?
throw

throw is used to manually create and throw an exception inside a method or block of code. It is followed by an exception object. We use it when we want to generate an exception based on a specific condition in the program.
throws

throws is used in a method declaration to indicate that the method may throw one or more exceptions. It informs the caller of the method that these exceptions should be handled.
throw is used to actually throw an exception, while throws is used to declare that a method can throw an exception. throw is written inside the method body, whereas throws is written in the method signature.



3)Why do we need it instead of built-in exceptions?

Give a real-life example where custom exception is useful.
Why do we need Custom Exceptions?

We use Custom Exceptions when built-in exceptions do not clearly explain the problem. They help us create error messages that are specific to our application and make the code easier to understand.

Real-Life Example

In a bank application, if a customer tries to withdraw more money than available in the account, we can create a custom exception called InsufficientBalanceException. This clearly tells the user what went wrong.
