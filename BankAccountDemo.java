// BankAccount class definition
class BankAccount {
    public String accountHolder;
    private double balance;
    protected String accountType;

    // Constructor to initialize account details
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }
}

// Main class with the main method
public class BankAccountDemo {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Performing deposit and withdrawal
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);

        // Displaying account information
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
