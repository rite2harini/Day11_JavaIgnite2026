# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.
A checked exception is an exception that is verified by the compiler at compile-time. The compiler ensures that the programmer either handles the exception using a try-catch block or declares it in the method signature using the throws keyword.
An unchecked exception is an exception that is not verified by the compiler at compile-time. The compiler does not force the programmer to handle or declare these exceptions, though they can be handled optionally.



2)Explain difference between:

throw

throws

Where do we use each one?
ANS: throw is a keyword used to explicitly throw an exception object from a method or any block of code. It creates an exception instance and transfers control to the nearest matching catch block.
throws is a keyword used in method signature to declare that a method might throw exceptions. It informs the caller about the possible exceptions that could occur during method execution.


3)Why do we need it instead of built-in exceptions?

Give a real-life example where custom exception is useful.
