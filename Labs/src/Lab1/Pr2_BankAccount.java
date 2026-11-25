package Lab1;

public class Pr2_BankAccount {
	private String name;
	private double balance;
	private Pr2_AccountType type;
	
	private static int totalAccounts = 0; // static field
	public static double interestIn = 0.05; // static but not final
	private final int accountID; //final
	
	{
	    totalAccounts++;
	    accountID = totalAccounts;
	}
	
	public Pr2_BankAccount (String ownerName, double balance, Pr2_AccountType type) {
	    this.name = ownerName; // this no1
	    this.balance = balance;
	    this.type = type;
	}
	public Pr2_BankAccount (String ownerName, Pr2_AccountType type) {
	    this(ownerName, 0.0, type);   // this no2
	}

	public int getAccountId() {
	    return accountID;
	}

	public String getOwnerName() {
	    return name;
	}

	public double getBalance() {
	    return balance;
	}

	public Pr2_AccountType getType() {
	    return type;
	}

	public static int getTotalAccounts() {
	    return totalAccounts;
	}
	
	public void deposit (double amount) {
	    if (amount <= 0) {
	        System.out.println("Deposit must be positive.");
	        return;
	    }
	    balance += amount;
	}

	public void deposit (double amount, String note) {
	    deposit(amount); 
	    if (amount > 0) {
	        System.out.println("Note: " + note);
	    }
	}

	
	
	
	
}
