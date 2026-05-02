package bankingBasics;

public class AccountValidation {

	public static void main(String[] args) {
		String name = "Sindhuja Ranganathan";
		double Accbal = 135.87;
		double minbal = 150.00;
		boolean isaccact = true;
		
		
		//check 1: minimum balance check
		System.out.println("Minimum balanace check:");
		System.out.println("-----------------------");
		
		if (Accbal > minbal) {
			System.out.println("Account is healthy");}
		
			else 
			{System.out.println("Account is short of balance");
		}
		
		//Check 2: Account active check
		System.out.println();
		System.out.println();
		System.out.println("Account status check:");
		System.out.println("---------------------");
		if (isaccact == true) {
			System.out.println("Account is active");
		}
		else {System.out.println("Account is inactive");}
		
		
		//Check 3: Customer name check
		System.out.println();
		System.out.println();
		System.out.println("Customer details check:");
		System.out.println("-----------------------");
		
		if (name.equals("Sindhuja Ranganathan")) {
			System.out.println("Customer name matches");
		}
		else {System.out.println("Customer name doesn't match");
		}
		
		//Check 4: Loan eligibility check
		System.out.println();
		System.out.println();
		System.out.println("Loan Eligibility check:");
		System.out.println("-----------------------");
		
		double sal = 50000.00;
		double loan = 600000.00;
		double loaneligibility = sal*10;
		
		if (loan < 100000) {
			System.out.println("Test Passed: Eligible for small loan");
		}
		else if(loan <= loaneligibility) {
			System.out.println("Test Passed: Eligible for requested loan amount");
		}
		
		else {System.out.println("Test Failed: Not eligible for the requested loan amount");}
		
		//Check 5: Transaction Eligibility check
		
		System.out.println();
		System.out.println();
		System.out.println("Transaction Eligibility check:");
		System.out.println("------------------------------");
		
		double transferamt = 5000.00;
		double accbal = 15000.00;
		boolean accverified = true;
		
		if(transferamt <= accbal && accverified == true) {
			System.out.println("Test Passed - Transaction can proceed");
		}
		
		else if(transferamt > accbal && accverified == true) {
			System.out.println("Test Failed - Transaction failed due to insufficient balance");
		}
		
		else if(transferamt <= accbal && accverified == false) {
			System.out.println("Test Failed - Transaction failed due to account not verified");
		}
		
		else {System.out.println("Tranaction cannot proceed");}
		
		
	}

}
