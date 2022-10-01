import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		List<BankUser> allUsers = new ArrayList<BankUser>();
		allUsers.add(new BankUser("A", 100));
		allUsers.add(new BankUser("B", 200));
		allUsers.add(new BankUser("C", 300));
		allUsers.add(new BankUser("D", 400));
		allUsers.add(new BankUser("E", 500));
		allUsers.add(new BankUser("F", 600));
		allUsers.add(new BankUser("G", 700));
		allUsers.add(new BankUser("H", 800));
		allUsers.add(new BankUser("I", 900));
		allUsers.add(new BankUser("J", 1000));
		
		BankUserUtil bul = new BankUserUtil();
		bul.printValidUsers(allUsers);
		
		BankUser user1 = new BankUser("Rohini", 300);
		
		BankUser.AccountHolder accHolder = new BankUser.AccountHolder();
	}
}
