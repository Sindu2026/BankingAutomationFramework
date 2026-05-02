package bankingBasics;

public class TransactionValidation {

	public static void main(String[] args) {
		double dailylimit = 5000.00;
		double transamt = 5500.00;
		boolean isaccact = true;
		boolean benfiverified = true;
		
		if (isaccact == false) {
			System.out.println("Test Failed: Account status is inactive. please contact the banking center");
		}
		
		else if(benfiverified == false) {
			System.out.println("Test Failed: Unable to verify the beneficiary. Transaction failed.");
		}
		
		else if(transamt > dailylimit) {
			System.out.println("Test Failed: Transaction amount exceeded the daily limit. Transaction Failed");
		}
		
		else {System.out.println("Transaction is successful");}

	}

}
