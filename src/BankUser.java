
public class BankUser {
	String name;
	int accountBalance;
	
	public BankUser(String n, int a) {
		this.name = n;
		this.accountBalance = a;
	}
	
	static class AccountHolder {
		String branch;
	}
}
