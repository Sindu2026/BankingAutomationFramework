package bankingBasics;

public class transactionValidator {
	
	public static boolean isDailyLimitvalid (double amount, double dailylimit) {
		if(amount > dailylimit) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean isBalanaceSufficient(double amount, double balance) {
		if(amount > balance) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean isAccountActive(boolean status) {
		return status;
	}
	
	public static String validateBankingTransaction(double amount, double dailylimit, double balance, boolean accountStatus) {
		if(!isAccountActive(accountStatus)) {
			return "Test Failed - Account is inactive";
		} else if (!isBalanaceSufficient(amount,balance)) {
			return "Test Failed - No sufficient balance. Transaction amount " + amount + " is greater than the available balance " + balance;
		} else if (!isDailyLimitvalid(amount,dailylimit)) {
			return "Test Failed - Transaction amount " + amount + " is higher than the daily limit " + dailylimit;
	} else {
		return "Transaction Successful";
	}
}
}
