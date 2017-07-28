package polymorphism;

public class SavingAccount extends BankAccount {
	/*
	 * Create a class SavingsAccount is a subclass of BankAccount withDraw
	 * method → print withDrawing from Savings account. balance-=amount deposit
	 * method → print depositing to Savings account. balance+=amount
	 */
	@Override
	void withDraw(int amount) {
		System.out.println("Drawing from SAvinging account:" + amount);
		setBalance(getBalance() - amount);
	}

	@Override
	void deposit(int amount) {

		System.out.println("deposting to saving account:" + amount);

		setBalance(getBalance() + amount);
	
	}


}
