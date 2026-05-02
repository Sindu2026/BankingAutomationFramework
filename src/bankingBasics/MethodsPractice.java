package bankingBasics;

public class MethodsPractice {
	
	public static void validatetransaction(double amount, double limit) {
		if (amount >limit) {
			System.out.println("Declined - " + amount + " exceeds the limit of " + limit);
		} else {System.out.println("Approved - " + amount + " within the limit of " + limit);}
	}
	
	public static boolean isTransactionValid(double amount, double limit) {
		if(amount>limit) {
			return false;
		} else {
			return true;
		}
	}
	
	public static void otpverification(int otp, int[] enteredotp) {
		int failedattempts =0;
		int maxattempts = 3;
		
		while(failedattempts < maxattempts) {
		if(enteredotp[failedattempts] == otp) {
			System.out.println("OTP verified successfullly");
			break;
		}
		
		else {
			failedattempts++;
			
			if(failedattempts >= maxattempts) {
				System.out.println("OTP verification failed. Card locked after 3 failed attempts");
			}
			
		}
			
		}
	}
	
	public static String getTransactionStatus(double amount, double limit) {
		if(amount>limit) {
			return "Declined - " + amount + " exceeds limit of " + limit;
		} else {
			return "Approved - " + amount + " within limit of " + limit;
		}
	}

	public static void main(String[] args) {
		System.out.println("------- Transaction Validation ------");
		
		validatetransaction(2000,5000);//shopping
		validatetransaction(25000,3000); //food
		validatetransaction(6000,20000);//travel
		validatetransaction(4800,3000); //gaming
		
		System.out.println();
		System.out.println("--- Return Value Method ---");
		// Store the returned value in a variable
		boolean result1 = isTransactionValid(2000,5000);
		boolean result2 = isTransactionValid(25000,3000);
		
		System.out.println("Transaction 1 valid: " + result1);
		System.out.println("Transaction 2 valid: " + result2);
		
		// Or use it directly in an if condition!
		
		if(isTransactionValid(2000,5000)) {
			System.out.println("Test passed - transaction can proceed");
		} else {System.out.println("Test failed - transaction blocked");}
		
		System.out.println();
		System.out.println("------OTP Verification -----");
		System.out.println("Scenario A:");
		otpverification(9876,new int[] {4569, 7412, 9876});
		System.out.println("Scenario B:");
		otpverification(9876, new int[]{4569, 7412, 1111});
		
		System.out.println();
		System.out.println("--- String Return Method ---");

		String status1 = getTransactionStatus(2000, 5000);
		String status2 = getTransactionStatus(25000, 3000);
		String status3 = getTransactionStatus(6000, 20000);

		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status3);
		
		System.out.println();
		System.out.println("---- Master transaction Validator -----");
		
		System.out.println(transactionValidator.validateBankingTransaction(5000, 20000, 15000, true));
		System.out.println(transactionValidator.validateBankingTransaction(5000, 20000, 15000, false));
		System.out.println(transactionValidator.validateBankingTransaction(25000, 20000, 15000, true));
		System.out.println(transactionValidator.validateBankingTransaction(18000, 15000, 20000, true));

		System.out.println();
		System.out.println("---- Master loan Validator -----");
		
		System.out.println(LoanValidator.validateLoanApplication(35, 800, 50000, 300000));
		System.out.println(LoanValidator.validateLoanApplication(17, 800, 50000, 300000));
		System.out.println(LoanValidator.validateLoanApplication(35, 700, 50000, 300000));
		System.out.println(LoanValidator.validateLoanApplication(35, 800, 50000, 600000));
	}

}
