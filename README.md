# cosc499_Indiv-Exercice
# Palindrome Program

- 1st Feature: Integer Palindrome

In the first feature of the palindrome program, the code asks the user to input an integer through the console.
After the user has entered the integer and hits Enter, the code sends the input into a method which will inverse the number that the user has provided 
and, after it has finished doing this, compares the initial input from the user with the inversed number.
If the number provided by the user is palindrome, even if the number is inversed, this one will display the number before inversion. 
If both integers are the same, the program will return true.
However, if the integer is not palindrome, the code will return false.

- 2nd Feature: String Palindrome

In the second feature of the palindrome program, the code, in addition to ask the user for an integer (from the previous feature), 
asks the user to input an string.
After the user enters both inputs and presses Enter, the code will still send the first input into the number method, while sending the second into a method 
that check if the string is palindrome. 
In the method, each character of the string, starting from the back, is sent to a new variable in order to form a new word. 
After this process is finished, the code will compare the new string and the string from the user. If the string from the user is a palindrome, the new word will be identical to the initial word before the process.
If both strings are the same, the program will return true.
However, if this is not the case, the code will return false. 
