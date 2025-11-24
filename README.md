# BankManagementSystem
# Bank Management System

Overview

The Bank Management System is a console-based, Java-written application simulating core banking operations. It follows one of the key OOP concepts, such as **Inheritance, Encapsulation, and Polymorphism**, through a practical multi-level class structure. The user can manage an account, execute transactions, and calculate interest using an intuitive text-based menu.
Features
*   **Account Creation:** Enter information such as account number, name, age, gender, type, and balance.
* **Account Information Display:** The ability to display all information stored concerning an account.
* Deposit & Withdrawal: Make financial transactions with input validation and checks on balance.
* **Balance Inquiry:** Check the current balance of the account on the spot.
* **Interest Calculation:** Automatically computes and displays annual interest for Savings at 4.5% and Current accounts at 2.5%:

## Technologies Used

*   **Programming Language:** Java
*   **Concepts:** Multilevel Inheritance, OOP, Scanner Class for I/O
*   **Tools:** Any Java IDE: Eclipse, IntelliJ IDEA, VS Code, or command line with JDK installed.

## Installation & Run Instructions

### Prerequisites
* Java Development Kit (JDK) 8 or higher installed.
* A terminal or command prompt.

### Steps to Run
1. **Clone the Repository:**
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name
```
2. **Compile the Java File:**

```bash
javac BankManagementSystem.java
```

3. **Run the Application:
```bash
java BankManagementSystem
```
4. **Follow the on-screen menu:** that will take the user through the process of entering account details and using the banking menu.

## Directions for Testing
Following the execution of the application, test the following scenarios for robustness:
1. **Account Creation:** Fill in all information appropriately. Make sure everything displays correctly.
2. **Deposit:**
*   Test with a positive amount, such as 1000. Should increase the balance

* Test the attribute with a negative amount or zero. There should be an error message.

3.  **Withdrawal:**

* Test with an amount less than the balance. Balance should decrease.
* Test with an amount more than the balance. "Insufficient balance" error should show up.
* Test with a negative amount. An error should be displayed.
  
4. **Calculation of Interest:** *   Create a Savings account and check whether the interest rate is 4.5% *   Create a Current account and check whether the interest rate is 2.5% or not.

6. **Menu Navigation:** Test all menu options (1-6) to make sure they work as expected. Test the exit option (6).
