# cs542
EX2: Solve the exercise #2 from the Numeric Errors chapter:

Write functions that do 32-bit signed integer arithmetic returning a correct 32-bit signed integer result or throw an exception when overflow occurs. For each function, do no use compiler overflow checking, and do not up-cast to a larger capacity type. Also, for each function, try to specify what are the tricky corner cases that might cause the function to misbehave.
(Easy) Write a function, add (x,y) that returns the 32-bit sum of two 32-bit signed integers or in the case of overflow raises an exception.
(Slightly harder) Copy and adapt the add function to do subtract (x,y), the difference of two integers, detecting overflow as above.
(Harder) Write multiply(x,y), the product of the two integers, again, detecting overflow. Why is this harder than doing the sum or difference?
(Harder?) Similarly write divide (x,y), which divides two integers, x by y. Division by zero is undefined, but this is a separate exception from overflow. Is overflow detection necessary? Why or why not?
You can do this assignment in either C or Java.

If you use C:
On the CS Department Linux systems, using the default gcc compiler, the int type will be 32 bits (4 bytes). If you use a different system or compiler, you will need to check the size of your variables to ensure that they are 32 bits. You can write a little test program and use the sizeof function to determine how many bytes are allocated for a given type or variable.
If you use Java:
You should use int, as this is always a 32 bit (4 byte) value in Java.
Hand in Instructions

Please compile your solutions into a single pdf document and upload it to Canvas (Assignments -> Exercise on Numeric Errors)
The document should begin with both your and your partner's names.
This should be followed by the answers in order of questions as stated above.
Please clearly identify the answers with the question number/letter as stated in the writeup.
The answers should include your explanations and code with comments.
Requirements for comments:

Please use the comment style specified in Google style guide for your language of choice.
The code should also have your names as a comment header at the top.
You should add comments as necessary to explain your solutions, as you would if handing over the code to an employer/client.
