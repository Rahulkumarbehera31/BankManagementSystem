import java.util.Scanner;

// Base class - BankAccount
class BankAccount {
    protected long accno;
    protected String name;
    protected int age;
    protected String gender;
    protected String acctype;
    protected double balance;
    
    Scanner scanner = new Scanner(System.in);
    
    // Method to get basic account details
    public void getAccountDetails() {
        System.out.print("Enter Account Number: ");
        accno = scanner.nextLong();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        age = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter Gender (M/F/O): ");
        gender = scanner.nextLine();
        
        System.out.print("Enter Account Type (Savings/Current): ");
        acctype = scanner.nextLine();
        
        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextDouble();
    }
    
    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("\n=== ACCOUNT DETAILS ===");
        System.out.println("Account Number: " + accno);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Account Type: " + acctype);
        System.out.println("Balance: ₹" + balance);
    }
    
    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

// Intermediate class - BankingOperations
class BankingOperations extends BankAccount {
    
    // Method to deposit money
    public void deposit() {
        System.out.print("\nEnter amount to deposit: ");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid amount! Please enter a positive value.");
        }
    }
    
    // Method to withdraw money
    public void withdraw() {
        System.out.print("\nEnter amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful!");
                System.out.println("New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
                System.out.println("Current Balance: " + balance);
            }
        } else {
            System.out.println("Invalid amount! Please enter a positive value.");
        }
    }
    
    // Method to display current balance
    public void displayBalance() {
        System.out.println("\nCurrent Balance: " + balance);
    }
}

// Derived class - BankWithInterest
class BankWithInterest extends BankingOperations {
    private double annualInterestRate;
    
    // Constructor to set interest rate based on account type
    public BankWithInterest() {
        if (acctype != null && acctype.equalsIgnoreCase("Savings")) {
            annualInterestRate = 4.5; // 4.5% for savings
        } else {
            annualInterestRate = 2.5; // 2.5% for current
        }
    }
    
    // Method to calculate and display annual interest
    public void calculateAnnualInterest() {
        double interest = (balance * annualInterestRate) / 100;
        System.out.println("\n=== ANNUAL INTEREST CALCULATION ===");
        System.out.println("Account Type: " + acctype);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("Annual Interest: ₹" + String.format("%.2f", interest));
        System.out.println("Total after 1 year: ₹" + String.format("%.2f", (balance + interest)));
    }
    
    // Method to display all banking operations menu
    public void bankingMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== BANKING MENU ===");
            System.out.println("1. Display Account Details");
            System.out.println("2. Display Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Calculate Annual Interest");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    displayAccountDetails();
                    break;
                case 2:
                    displayBalance();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    calculateAnnualInterest();
                    break;
                case 6:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }
}

// Main class to test the multilevel inheritance
public class BankManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== BANK MANAGEMENT SYSTEM ===");
        
        // Create bank account object
        BankWithInterest bankAccount = new BankWithInterest();
        
        // Get account details
        bankAccount.getAccountDetails();
        
        // Display banking menu
        bankAccount.bankingMenu();
    }
}