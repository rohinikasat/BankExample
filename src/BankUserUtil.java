import java.util.Iterator;
import java.util.List;

public class BankUserUtil {

	public void printValidUsers(List<BankUser> users) {
		List<BankUser> finalUsers = findUsersWith500AboveBalance(users);
		for (BankUser user : finalUsers) {
			System.out.println(user.name + " | " + user.accountBalance);
		}
		System.out.println();
		for (BankUser user : users) {
			System.out.println(user.name + " | " + user.accountBalance);
		}
	}

	public List<BankUser> findUsersWith500AboveBalance(List<BankUser> allBankUsers) {
		List<BankUser> resultList = allBankUsers;
		Iterator<BankUser> itr = resultList.iterator();
		while (itr.hasNext()) {
			BankUser bu = itr.next();
			if (bu.accountBalance < 500 ) {
				itr.remove();
			}
		}
		return resultList;
	}
}
