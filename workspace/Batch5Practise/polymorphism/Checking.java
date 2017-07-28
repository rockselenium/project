package polymorphism;

public class Checking extends BankAccount {
	/************
	 * Create a class CheckingAccount is a subclass of BankAccount withDraw
	 * method → print withDrawing from Checking account. balance-=amount deposit
	 * method → print depositing to Checking account. balance+=amount
	 * charge(amount) → print purchased goods in amount $amount .
	 * balance-=amount
	 *************/

	@Override
	void withDraw(int amount) {
		System.out.println("Drawing from Checking account:" + amount);
		setBalance(getBalance() - amount);
	}

	@Override
	void deposit(int amount) {

		System.out.println("deposting to account:" + amount);

		setBalance(getBalance() + amount);
	}

	public void charge(int amount) {
		System.out.println("purching goods for:" + amount);
		setBalance(getBalance()-amount);
	}

}
 