# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.



2)Explain difference between:

throw

throws

Where do we use each one?



3)Why do we need it instead of built-in exceptions?

Give a real-life example where custom exception is useful.

### 1. Checked vs. Unchecked Exceptions

A checked exception is an error that the Java compiler forces you to anticipate and explicitly handle while you are writing your code. If you do not provide a try-catch block or a throws declaration for a checked exception, your program simply will not compile. These exceptions usually represent problems outside the direct control of your application logic, such as attempting to read a file from a hard drive that has been deleted or trying to connect to a database that is suddenly offline. A classic Java example of a checked exception is the `FileNotFoundException`.

On the other hand, an unchecked exception is not verified by the compiler, meaning you are not strictly required to write handling code for it in order to build and run your project. These exceptions typically occur at runtime and represent flaws or bugs in your actual programming logic, such as trying to access an object that does not exist or attempting to access an array position that is out of bounds. Because they represent logic errors that should ideally be fixed in the code itself, Java does not force you to catch them. A common Java example of an unchecked exception is the `NullPointerException`.

---

### 2. Difference Between throw and throws

The `throw` keyword is used explicitly inside the body of a method or block of code to actively create and trigger a new exception object. You use `throw` when a specific condition in your program's logic has been violated, and you need to immediately halt the normal execution flow to signal an error. For example, if a user enters a negative value for a bank deposit, you would actively `throw` an exception right at that line of code to stop the transaction.

Conversely, the `throws` keyword is placed at the very end of a method signature, right after the parameter list. It is used to declare that the method might potentially encounter certain exceptions, but it is choosing not to handle them internally. You use `throws` to pass the responsibility of catching and handling the error up the chain to whichever other method called the current one. It acts as a strict warning to any calling method that it must be fully prepared to deal with the specified exception.

---

### 3. The Need for Custom Exceptions

We need custom exceptions because Java's built-in exceptions are highly technical and generalized, meaning they do not always accurately describe business-specific logic errors. While Java natively understands standard mathematical or data-formatting errors, it knows absolutely nothing about the unique rules and boundaries of the specific software you are building. By creating custom exceptions, you can give your errors deeply meaningful names and specialized messages that perfectly map to your real-world business requirements, making your codebase much easier to read, debug, and maintain.

A highly practical real-life example where a custom exception is useful is within a digital banking application that processes ATM withdrawals. If a customer tries to withdraw more money than they actually have in their account, throwing a generic built-in Java exception like an `IllegalArgumentException` would be vague and unhelpful. Instead, creating and throwing a custom `InsufficientBalanceException` clearly and precisely communicates exactly what business rule was violated, allowing the program to gracefully deny the transaction and show the user an accurate warning message.
