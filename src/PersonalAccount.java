import java.util.ArrayList;

/**
 * The PersonalAccount class represents a personal bank account.
 * It provides methods for depositing and withdrawing money,
 * checking balance, and viewing transaction history.

 * Each account has a unique account number, an account holder's name,
 * and a balance. All transactions (deposits and withdrawals) are stored
 * as a list of Amount objects with transaction types.
 */
public class PersonalAccount {

    /** The unique account number of the account. */
    private int accountNumber;

    /** The name of the account holder. */
    private String accountHolder;

    /** The current balance of the account. */
    private double balance;

    /** A list of all transactions performed on the account. */
    private ArrayList<Amount> transactions;

    /**
     * Constructs a new PersonalAccount object with the given account number and holder's name.
     * The initial balance is set to 0, and an empty transaction history is created.
     *
     * @param accountNumber The unique number identifying the account.
     * @param accountHolder The name of the account holder.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposits a specified amount of money into the account.
     * The transaction is recorded in the transaction history.
     *
     * @param amount The amount of money to deposit (must be positive).
     */
    public void deposit(double amount) {
        Amount depositAmount = new Amount(amount, TransactionType.DEPOSIT);
        this.balance += amount;
        this.transactions.add(depositAmount);
    }

    /**
     * Withdraws a specified amount of money from the account.
     * The transaction is recorded in the transaction history.
     *
     * @param amount The amount of money to withdraw (must be positive and <= balance).
     */
    public void withdrawal(double amount) {
        Amount withdrawalAmount = new Amount(amount, TransactionType.WITHDRAWAL);
        this.balance -= amount; // Deduct the amount from the balance
        this.transactions.add(withdrawalAmount);
    }

    /**
     * Prints the transaction history of the account to the console.
     * Displays the type and amount of each transaction.
     */
    public void transactionHistory() {
        for (Amount transaction : transactions) {
            System.out.println("Transaction type: " + transaction.getTransactionType() + "\n"
                    + "Transaction amount: " + transaction.getAmount());
        }
    }

    /** Returns the current balance of the account. */
    public double getBalance() {
        return this.balance;
    }

    /** Returns the account number of the account. */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /** Returns the name of the account holder. */
    public String getAccountHolder() {
        return this.accountHolder;
    }
}
