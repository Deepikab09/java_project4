
# Java Banking Management System

## Project Overview
The Java Banking Management System is a console-based application developed using Java. It allows users to create and manage bank accounts and perform basic banking operations.

## Features
- Create Savings and Current Accounts
- View all bank accounts
- Deposit money
- Withdraw money
- Check account balance
- View transaction history
- Validate account details
- Handle account-not-found exceptions

## OOP Concepts Used
1. **Classes and Objects** – Used to represent bank accounts and banking services.
2. **Encapsulation** – Account details are protected using private variables.
3. **Inheritance** – SavingsAccount and CurrentAccount inherit BankAccount.
4. **Polymorphism** – Different account types override account methods.
5. **Abstraction** – BankAccount is an abstract class.
6. **Interface** – TransactionOperations defines deposit and withdrawal methods.
7. **Exception Handling** – Custom exception handles missing accounts.

## Technologies Used
- Java
- Object-Oriented Programming
- Java Collections Framework

## How to Run

1. Install Java JDK.
2. Open the project folder in a terminal.
3. Compile the Java files:

   javac -d out src/main/java/banking/*.java

4. Run the application:

   java -cp out banking.Main

## Project Structure

Java_Banking_Management_System/
- README.md
- docs/
- src/
  - main/
    - java/
      - banking/
        - Main.java
        - BankAccount.java
        - SavingsAccount.java
        - CurrentAccount.java
        - TransactionOperations.java
        - BankService.java
        - AccountNotFoundException.java

## Author
Deepika B.
