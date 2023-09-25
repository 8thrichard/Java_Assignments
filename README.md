# Java_Assignments
This Rep will consist of all my assignments in Java, Spring 23.

#Assginment-1
#                     WELCOME TO BASKET BALL SCOREBOARD
![THE_BB_SCOREBOARD](https://user-images.githubusercontent.com/118012295/228673853-d5a1edb7-8c81-4768-8a12-c18d49c99cf7.png)


# Basketball Stats Application

Basketball Stats Application is a Java program that allows users to keep track of basketball game statistics for two teams.

![Demo GIF](demo.gif)

## GitHub Repository

Find the source code on [GitHub](https://github.com/8thrichard/Java_Assignments.git).

## Author

- Author: 8thrichard
- Date: February 15, 2022
- Version: 1.0 beta

## Table of Contents

- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Code Structure](#code-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Installation

To run the application, follow these steps:
1. Clone the GitHub repository.
2. Compile the Java files.
3. Run the `BB_ScoreBoard_App` class.

## Usage

1. Launch the application.
2. Enter the names of the home and away teams.
3. Add players to each team.
4. Start keeping track of game statistics using the menu options.

## Features

- Create and manage statistics for two basketball teams.
- Record player details including fouls and field goals.
- Display team and player statistics.

## Code Structure

The code consists of the following classes:
- `BB_ScoreBoard_App`: Main class for running the application.
- `Input`: Handles user input and validation.
- `Player`: Represents a basketball player.
- `Team`: Represents a basketball team.

## Contributing
1. Debbie Johnson - Professor

Contributions are welcome! Please submit pull requests or open issues for any enhancements or bug fixes. <br><br><br><br>




# BankApp - Java Banking Application (Assignment 2)

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

