Overview

This is a simple Java-based Password Validator program that checks whether a password is strong and valid according to specific rules.

The program continuously asks the user to enter a password until a valid password is provided.

Features
Checks minimum password length
Verifies presence of:
At least one uppercase letter
At least one lowercase letter
At least one digit
Displays appropriate validation messages
Repeats input until a valid password is entered
Password Requirements

A valid password must contain:

Minimum 8 characters
At least 1 uppercase letter
At least 1 lowercase letter
At least 1 numeric digit
Technologies Used
Java
Scanner Class
Loops
Conditional Statements
Character Class Methods
Project Structure
PasswordValidator.java
How the Program Works
User enters a password.
The program checks:
Password length
Uppercase letters
Lowercase letters
Digits
If any requirement is missing, the program displays an error message.
The user is asked to enter the password again until it becomes valid.
Sample Output
Enter Password:
hello

Password is too short.It must be at least 8 characters long.
Invalid password.

Enter Password:
helloWorld

Missing a digit
Invalid password.

Enter Password:
Hello123

Valid password.
Code Explanation
isValidPassword(String pass)

This method validates the password.

It checks:
Length of password
Uppercase characters
Lowercase characters
Digits
Returns:
true

if the password is valid, otherwise:

false
main() Method
Takes user input using Scanner
Runs the program inside a while(true) loop
Stops only when a valid password is entered
Concepts Used
Methods
Boolean Variables
Loops
String Handling
Character Validation
User Input Handling
Future Improvements
Add special character validation
Hide password input while typing
Add password strength meter
Store encrypted passwords
