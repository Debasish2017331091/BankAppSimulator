# Simple Banking Application

This is a simple console-based banking application implemented in Java, allowing users to perform various operations on three types of accounts: current account, saving account, and salary account. The application provides a set of functionalities such as creating a new account, displaying all accounts, updating account details, deleting an account, depositing and withdrawing amounts, searching for an account, and exiting the application.

## Table of Contents

1. [Getting Started](#getting-started)
2. [Features](#features)
3. [How to Use](#how-to-use)
4. [Example Usage](#example-usage)
5. [Contributing](#contributing)
6. [License](#license)

## Getting Started

To run the application, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Compile and run the `BankingApp.java` file.

## Features

### 1. Create a new account

Users can create a new account by providing the account holder's name, account type, and an initial minimum deposit of 1000.

### 2. Display all accounts

The application allows users to view all existing accounts, displaying account number, name, creation date, type, and balance for each account.

### 3. Update an account

Users can update the name of the account holder for a specific account.

### 4. Delete an account

Users can delete an account by providing the account number.

### 5. Deposit an amount

Account holders can deposit any amount into their accounts.

### 6. Withdraw an amount

Account holders can withdraw a specified amount from their accounts.

### 7. Search for an account

Users can search for an account by providing the account number. The application will display all details about the account.

### 8. Exit

Users can exit the application, stopping further execution.

## How to Use

1. Upon starting the application, users will be presented with a menu displaying options from 1 to 8.
2. Enter the desired option number to perform the corresponding operation.
3. Follow the prompts to provide necessary information for each operation.

```java
// Sample Interaction in console

Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
1
Creating Account
Enter account name: 
Sukanto
Enter account type ('CURRENT' for current, 'SAVING' for saving, 'SALARY' for salary without quotation): 
Current
Enter initial deposit ( Minimum 1000 ): 
1500
Succesfuly Created the account
Account Number: 20240001, Account Name: 'Sukanto', Account Type: CURRENT, Balance: 1500.0, Created at: 2024-01-31
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
2
Displaying all accounts
Account Number: 20240001, Account Name: 'Sukanto', Account Type: CURRENT, Balance: 1500.0, Created at: 2024-01-31
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
3
Updating Account
Enter account number: 
20240001
Enter new account name: 
Debasish
Account name updated successfully!
Account Number: 20240001, Account Name: 'Debasish', Account Type: CURRENT, Balance: 1500.0, Created at: 2024-01-31
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
5
Deposit Amount
Enter account number: 
20240001
Enter deposit amount: 
2500
Deposit Successful
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
6
Withdraw amount from Account
Enter account number: 
20240001
Enter withdrawal amount: 
2000
Withdraw Successful
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
7
Searching Account
Enter a Account Number: 
20240001
Account Number: 20240001, Account Name: 'Debasish', Account Type: CURRENT, Balance: 2000.0, Created at: 2024-01-31
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
4
Delete Account
Enter account number: 
20240001
Account deleted successfully!
Enter any number from 1-8 to interact
1 (create account), 2 (display all accounts), 3 (update an account), 4 (delete an account), 5 (deposit), 6 (withdraw), 7 (searching an account, 8 (Exit)
Enter your choice: )
8
Exiting ....
App closed

