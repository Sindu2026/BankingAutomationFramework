package bankingBasics;

public class LoopExercise {

	public static void main(String[] args) {
		
		//for loop
		System.out.println("----- Loan approval check -----");
		double[] loanamt = {10000.00, 25000.00, 75000.00, 40000.00, 90000.00};
		double maxloanamt = 50000.00;
		int s = loanamt.length;
		
		for(int i = 0; i < s; i++) {
			double amt = loanamt[i];
			
			if(amt>maxloanamt) {
				System.out.println("Rejected.Loan amount requested is greater than maximum approved limit.");
			}
			else {System.out.println("Loan Approved");}
		}
		System.out.println();	
			//while loop
			System.out.println("----- OTP Verification -----");
			int failedtry = 0;
			int maxtry = 3;
			int OTP = 1234;
			int[] userOTP = {4561,9963,4789};
			int t = userOTP.length;
			
			while (failedtry < maxtry) {
				
				if (userOTP[failedtry]== OTP) {
				System.out.println("OTP verification successfully.");
				break;
				}
				
				else {
					failedtry++;
					System.out.println("Attempt " + failedtry + " FAILED - Wrong OTP entered " );
				}
				
				if (failedtry>= maxtry) {
					System.out.println("TEST FAILED - OTP verification failed. Please regenerate OTP");
				}
			}
		System.out.println();
			//Do while
			System.out.println("----- Transaction loading -----");
			int inirecload = 0;
			int finalrecload = 40;
			
			do {
				inirecload += 10;
				System.out.println(inirecload + " records loaded");
			} while (inirecload < finalrecload);
			
			System.out.println("All 40 records were loaded");
		
	}

}
