package polymorphism;

public abstract class BankAccount {
	
	private String name;
	private int balance;
	private String accNUmber;

	abstract void withDraw(int amount);

	abstract void deposit(int amount);
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getAccNUmber() {
		return accNUmber;
	}

	public void setAccNUmber(String accNUmber) {
		this.accNUmber = accNUmber;
	}

}
