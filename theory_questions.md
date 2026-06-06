# Day11_JavaIgnite2026

1)What is the difference between:

Checked Exception

Unchecked Exception

Give one Java example for each.

ANS:- Checked Exceptions are those which are related to compile time errors of the java program file, where the system tells us to handle such exceptions using try-catch or using the throws. EXAMPLE: IOException.
Unchecked Exception are those which are checked at run time of the programs, where the system does not actively mark out the warnings but after being processed the errors show, which basically happens inside the java program file in codes or logics. EXAMPLE: ArithmeticException


2)Explain difference between:

throw

throws

Where do we use each one?

ANS:- In case of 'throw' we use it to explicitly make and throw a new type of custom exception of ours and throws one at a time, while in case of 'throws' we use it to throw or declare that the particular method might show an exception and can throws multiple exceptions at a time.
'throw' - its used when you want to generate a custom made exception in programs.
'throws' - its used in method declaration to indicate that a method can throw an exception



3)Why do we need it instead of built-in exceptions?

Give a real-life example where custom exception is useful.

ANS:- We need Custom exceptions instead of built in exceptions because, the built in exceptions only shows the basic program level exception and not a proper systematic description in a proper system where ranges are set, values and datas entered into the system are very sensibly checked and monitored here the exception for crossing the line should be explicitly shown or known in that case we need Custom made Exceptions!Real life examples of custom exceptions are,- In Banking sysem - InsufficientBalanceException [if withdraw is greater than balance]- In Student Management System - InvalidMarksException [if marks are entered more than the full marks set by the system]- In Voting Application - UnderAgeException [if you are below 18 years of age you aren't entitle to casting your vote]
