package bankingBasics;

public class MyFirstProgram {

	public static void main(String[] args) {
				
		//Customer details
		String customerName = "Sindhuja Ranganathan";
		String AccountNumber = "Acc-10023";
		
		//Account Details
		double balanceAmount = 15000.25;
		double transferAmount = 500.34;
		
		//Account Status
		int numberoftransactions = 6;
		boolean isAccountActive = true;
		boolean isLoanApproved = false;
		
		//Print Everything
		System.out.println("Customer Name: " + customerName);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Account Balance: " + balanceAmount);
		System.out.println("Transfer Amount: " + transferAmount);
		System.out.println("Total Transactions: " + numberoftransactions);
		System.out.println("Account Staus: " + isAccountActive);
		System.out.println("Loan Status: " + isLoanApproved);
		
		
	}

}
