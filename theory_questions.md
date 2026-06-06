# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.
| Checked Exception                             | Unchecked Exception            |
| --------------------------------------------- | ------------------------------ |
| Checked at compile time                       | Checked at runtime             |
| Must be handled using `try-catch` or `throws` | Handling is optional           |
| Direct subclass of `Exception`                | Subclass of `RuntimeException` |

import java.io.*;

class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }
}


class Test {
    public static void main(String[] args) {
        int a = 10 / 0;
    }
}


2)Explain difference between:

throw

throws

Where do we use each one?
| throw                                 | throws                          |
| ------------------------------------- | ------------------------------- |
| Used to explicitly throw an exception | Used to declare exceptions      |
| Used inside method body               | Used in method signature        |
| Throws one exception at a time        | Can declare multiple exceptions |

if(age < 18) {
    throw new Exception("Not Eligible");
}


void checkAge(int age) throws Exception {
    if(age < 18) {
        throw new Exception("Not Eligible");
    }
}


3)Why do we need it instead of built-in exceptions?
Built-in exceptions provide general error messages, but custom exceptions allow us to create meaningful and application-specific error messages. They make the program easier to understand and maintain.

Give a real-life example where custom exception is useful.
Suppose a customer tries to withdraw more money than available in the account.
Instead of using a generic exception, we can create:
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

