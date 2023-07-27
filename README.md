<h1 align="center">Tasks</h1>

## Tasks 18

Design a class named Triangle that extends GeometricObject . The class contains:
- Three double data fields named side1 , side2 , and side3 with default val-
ues 1.0 to denote three sides of a triangle.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified side1 , side2 , and
side3 .
- The accessor methods for all three data fields.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter of this triangle.
- A method named printTriangle() that returns a string description for the triangle.

The printRectangle() method is implemented as follows:
return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;

Draw the UML diagrams for the classes Triangle and GeometricObject and
implement the classes. Write a test program that prompts the user to enter three
sides of the triangle, a color, and a Boolean value to indicate whether the triangle
is filled. The program should create a Triangle object with these sides and set
the color and filled properties using the input. The program should display
the area, perimeter, color, and true or false to indicate whether it is filled or not.

## Tasks 19 

1. Design a class named Person and its two subclasses named Student and Employee . Make Faculty and Staff subclasses of Employee . 

- Person name, address, phone number, and e-mail address
    - Student lass status (fresh-man, sophomore, junior, or senior)
    - Employee office, salary, and date hired
        - Faculty office hours and a rank
        - Staff title

A person has a name, address, phone number, and e-mail address. A student has a class status (fresh-man, sophomore, junior, or senior).
An employee has an office, salary, and date hired. A faculty member has office hours and a rank. A staff member has a title. 
Override the toString method in each class to display the fields of the class.
Write a test program that creates a Person , Student , Employee , Faculty , and Staff, and invokes their toString() methods.


2. In Programming Exercise 9.7, the Account class was defined to model a bank account.
An account has the properties account number, balance, annual interest rate, and date created,
and methods to deposit and withdraw funds. Create two subclasses for checking and saving accounts.
A checking account has an overdraft limit, but a savings account cannot be overdrawn.
Draw the UML diagram for the classes and implement them. Write a test program that creates objects of Account,
SavingsAccount, and CheckingAccount and invokes their toString() methods.

