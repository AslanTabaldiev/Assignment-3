/**
 * The Amount class represents a financial transaction in terms of amount and transaction type.
 * It stores information about the amount of money involved and whether it was a deposit or withdrawal.
 */
public class Amount {

    /** The money value of the transaction. */
    private double amount;

    /** The type of transaction (either DEPOSIT or WITHDRAWAL). */
    private TransactionType transactionType;

    /**
     * Constructs a new Amount object with the specified transaction amount and type.
     *
     * @param amount The amount of money involved in the transaction.
     * @param transactionType The type of the transaction (DEPOSIT or WITHDRAWAL).
     */
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /** Returns the amount of the transaction. */
    public double getAmount() {
        return this.amount;
    }

    /** Returns the type of the transaction (DEPOSIT or WITHDRAWAL). */
    public TransactionType getTransactionType() {
        return this.transactionType;
    }

    /** Returns a string representation of the transaction, showing the type and amount. */
    public String toString() {
        return this.transactionType + ": " + this.amount;
    }
}

