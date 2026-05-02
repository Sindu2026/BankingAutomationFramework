package bankingBasics;

public class LoopsPractice {

	public static void main(String[] args) {
		System.out.println("Testing loop transaction");
		
		for(int i=1; i<=5; i++) {
			System.out.println("Running test transaction: " + i);
		}
		
		System.out.println("End of testing transaction");
		
		double dailylimit = 20000.00;
		double availablebalance = 6000.00;
		double[] txnamt = {5000, 15000, 35000, 25000, 60000};
		
		for(int i =0; i < txnamt.length; i++) {
			
			double amt = txnamt[i];
			
			if(amt>dailylimit) {
				System.out.println(amt + " exceeds the daily limit");
			}
			
			else if(amt>availablebalance) {
				System.out.println(amt + " is greater than the available balance");
			}
			

			else {
				System.out.println("Transaction is successful");
			}
		}

	}

}
