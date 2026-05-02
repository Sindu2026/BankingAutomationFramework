package bankingBasics;

public class CreditCardValidation {

	public static void main(String[] args) {
		
		//CC transactions for loop
		System.out.println("-----  CC transaction decision -----");
		String[] sc = {"Shopping", "Travel", "Food", "Medical", "Gaming"};
		int[] maxlimit = {5000,20000,3000,3000,3000};
		int[] txn = {2000,6000,25000,4000,4800};
		
		for(int i =0; i < txn.length ; i++) {
			String shopcat = sc[i];
			if(txn[i]>maxlimit[i]) {
				System.out.println(shopcat + " transaction is rejected. " + txn[i] + " higher than the category limit " + maxlimit[i] + ".");
			}
			else {System.out.println(shopcat + " transaction is approved.");}
			
		}
		
		//Pin verification
		System.out.println();
		System.out.println("----- OTP Verification -----");
		int failedattempts = 0;
		int maxattempts = 3;
		int[] enteredOTP = {4569,7412,1234};
		int OTP = 9876;
		
		while(failedattempts<maxattempts) {
			if(enteredOTP[failedattempts] == OTP) {
				System.out.println("OTP verified suuccessfully.");
				break;
			}
			else {
				failedattempts++;
				
				if (failedattempts>=maxattempts) {
					System.out.println("OTP verification failed. Card locked after 3 failed attempts");
				}
			}
		}
	
	}

}
