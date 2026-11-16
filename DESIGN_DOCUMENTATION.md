
# Java Banking Management System
## Design Documentation

### 1. Introduction
The Java Banking Management System is a console-based application designed to manage basic banking operations such as account creation, deposits, withdrawals, balance checking, and transaction history.

### 2. Project Objectives
- To understand Object-Oriented Programming in Java.
- To implement different types of bank accounts.
- To perform basic banking transactions.
- To apply exception handling.
- To maintain transaction records.

### 3. System Modules

**Main Module**
- Displays the menu.
- Accepts user input.
- Controls application execution.

**Bank Account Module**
- Stores account details.
- Maintains account balance.
- Performs deposit and withdrawal operations.

**Savings Account Module**
- Represents savings accounts.
- Applies the minimum balance rule.

**Current Account Module**
- Represents current accounts.
- Applies the minimum balance rule.

**Bank Service Module**
- Creates and manages accounts.
- Finds accounts.
- Displays account information.

**Transaction Module**
- Defines deposit and withdrawal operations.
- Maintains transaction history.

### 4. OOP Concepts

| Concept | Implementation |
|---|---|
| Class and Object | BankAccount, SavingsAccount, CurrentAccount |
| Encapsulation | Private account details |
| Inheritance | SavingsAccount and CurrentAccount extend BankAccount |
| Polymorphism | Method overriding |
| Abstraction | Abstract BankAccount class |
| Interface | TransactionOperations |
| Exception Handling | AccountNotFoundException |

### 5. System Workflow

1. Start the application.
2. Display the banking menu.
3. Select an operation.
4. Enter the required account details.
5. Validate the input.
6. Perform the selected operation.
7. Display the result.
8. Continue until the user selects Exit.

### 6. Validation and Exception Handling
- Account number must be positive.
- Account holder name cannot be empty.
- Opening balance cannot be negative.
- Transaction amount must be greater than zero.
- Withdrawal cannot reduce the balance below the minimum balance.
- Duplicate account numbers are not allowed.
- Invalid account numbers generate a custom exception.

### 7. Conclusion
This project demonstrates the practical implementation of Object-Oriented Programming concepts in Java. It provides a simple banking application that supports account management and basic financial transactions.
