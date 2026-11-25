package Lab1;

public class Pr2_BankTest {
	public static void main(String[] args) {

		Pr2_BankAccount a1 = new Pr2_BankAccount("Kamila", 1000.0, Pr2_AccountType.SAVINGS);
		Pr2_BankAccount a2 = new Pr2_BankAccount("Amina", Pr2_AccountType.CHECKING);

        a1.deposit(500);
        a2.deposit(200, "First salary");


        System.out.println("a1 id: " + a1.getAccountId() + ", balance: " + a1.getBalance() + ", type: " + a1.getType());
        System.out.println("a2 id: " + a2.getAccountId() + ", balance: " + a2.getBalance() + ", type: " + a2.getType());

        System.out.println("Total accounts: " + Pr2_BankAccount.getTotalAccounts());

        Pr2_BankAccount.interestIn = 0.07;
        System.out.println("Interest rate now: " + Pr2_BankAccount.interestIn);
    }
}
