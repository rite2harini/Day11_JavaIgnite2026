# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.
Checked Exceptions are those which are related to compile time errors of the java program file, where the system tells us to handle such exceptions using try-catch or using the throws. EXAMPLE: IOException. Unchecked Exception are those which are checked at run time of the programs, where the system does not actively mark out the warnings but after being processed the errors show, which basically happens inside the java program file in codes or logics. EXAMPLE: ArithmeticException


2)Explain difference between:

-> throw is used to throw an exception manually.
        ->It is written inside a method or block.
        ->It throws only one exception at a time.
             Example: throw new ArithmeticException();

throws
-> throws is used to declare an exception.
        -> It is written in the method signature.
        -> It tells the compiler that the method may throw an exception.
            Example: void display() throws IOException

Where do we use each one?
-> throw → Used inside a method to throw an exception.
-> throws → Used in the method declaration to declare an exception.


3)Why do we need it instead of built-in exceptions?
we need it as every eroors arent being covered by the built in exception
Give a real-life example where custom exception is useful.
like in atm .....if we give withdrawl amount negative then java wint find it wrong as its not an any syntax error or any index or inut relate error so we can usein if condion that if the withdrawl amount is negative then we can throw a new exception like InvalidInout and it will display the entered amount is negative
