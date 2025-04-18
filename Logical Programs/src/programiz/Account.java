package programiz;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        // Validation for accountNumber
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.err.println("Error: Account number cannot be null or empty.");
            return;
        }

        // Validation for balance
        if (balance < 0) {
            System.err.println("Error: Balance cannot be negative.");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // Test cases
        Account account1 = new Account("123456", 1000.0);
        //Account account2 = new Account("", 500.0);    // Invalid account number
        //Account account3 = new Account("7891011", -50.0);    // Invalid balance
    }
}

