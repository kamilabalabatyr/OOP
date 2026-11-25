package Lab2Prob3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        if (sum > 0) {
            transactionCount++;
        }
    }

    @Override
    public void withdraw(double sum) {
        double oldBalance = getBalance();
        super.withdraw(sum);
        if (sum > 0 && getBalance() != oldBalance) {
            transactionCount++;
        }
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extraTransactions = transactionCount - FREE_TRANSACTIONS;
            double totalFee = extraTransactions * TRANSACTION_FEE;
            super.withdraw(totalFee);
        }
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }

    @Override
    public String toString() {
        return "CheckingAccount[accNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                ", transactionCount=" + transactionCount + "]";
    }
}
