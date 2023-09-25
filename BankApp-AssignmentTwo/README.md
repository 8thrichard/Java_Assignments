# BankApp - Java Banking Application

BankApp is a Java banking application that allows users to manage bank accounts. It includes the `BankApp` class, which demonstrates the functionality of the `Account` class.

![BankApp Demo](demo.gif)

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Code Structure](#code-structure)
- [Usage](#usage)
- [Class Details](#class-details)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Introduction

The BankApp is a Java application that showcases the functionality of the `Account` class. It allows you to create and manage bank accounts, deposit money, and display account information. This README provides an overview of the application's features and how to use it.

## Features

- Create and manage bank accounts with unique account numbers.
- Set account owner's first and last names.
- Deposit money into accounts with validation for positive amounts.
- Display account information, including account number, owner's name, and balance.
- Demonstrates class-level and instance-level fields.

## Code Structure

The application consists of two classes:

1. `BankApp`: The main class that demonstrates the functionality of the `Account` class.
2. `Account`: A class used to create and manage bank account objects.

## Usage

To run the BankApp application, follow these steps:

1. Clone the GitHub repository.
2. Compile the Java files (`BankApp.java` and `Account.java`).
3. Run the `BankApp` class.

## Class Details

### Account Class

The `Account` class represents a bank account. It includes the following attributes:

- `number`: The account number.
- `firstName`: The account owner's first name.
- `lastName`: The account owner's last name.
- `balance`: The account balance.

#### Constructors

- `public Account()`: Default constructor that creates a unique account with default values.
- `public Account(String firstName, String lastName, double balance)`: Overload constructor that allows setting account fields.

#### Methods

- `public int getNumber()`: Get the account number.
- `public String getFirstName()`: Get the account owner's first name.
- `public void setFirstName(String firstName)`: Set the account owner's first name.
- `public String getLastName()`: Get the account owner's last name.
- `public void setLastName(String lastName)`: Set the account owner's last name.
- `public double getBalance()`: Get the account balance.
- `public void deposit(double amount)`: Deposit money into the account.

### BankApp Class

The `BankApp` class is the main class that demonstrates how to use the `Account` class. It includes a `printAccount` method for displaying account information.

## Contributing

1. Debbie Johnson - Professor
