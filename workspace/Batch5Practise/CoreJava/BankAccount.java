package CoreJava;

public class BankAccount {

	private String accountName;
	private String accountHolder;
	private double balance;
	private String baknName;

	public void deposit() {
		System.out.println("deposit money");
	}

	public void transfer() {
		System.out.println("transfer money");
	}

	public void withdrow() {
		System.out.println("withtrow money");
	}

	public void pay() {
		System.out.println("pay money");
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getBaknName() {
		return baknName;
	}

	public void setBaknName(String baknName) {
		this.baknName = baknName;
	}
}
