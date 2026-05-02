package bankingBasics;

import java.util.ArrayList;

public class BankAccountTest {

	public static void main(String[] args) {
			
		// CREATE objects from BankAccount blueprint
		
		BankAccount acc1 = new BankAccount("ACC001", "Sindhuja", 15000.00, true, "Savings");
		BankAccount acc2 = new BankAccount("ACC002", "John", 2500.00, true, "Current");
		BankAccount acc3 = new BankAccount("ACC003", "Andrew", 50000.00, false, "Savings");
		
        // Display all accounts
		System.out.println("------- All Accounts -------");
		acc1.displayAccount();
		acc2.displayAccount();
		acc3.displayAccount();
		
		
		// Test deposit
		System.out.println();
		System.out.println("----- Deposit Test -----");
		acc1.deposit(5000);
		
		// Test withdraw
		System.out.println();
		System.out.println("----- Withdraweal Test -----");
		acc2.withdrawal(1000);
	
		
		// Test insufficient balance
		System.out.println();
        System.out.println("--- Insufficient Balance Test ---");
        acc2.withdrawal(50000);
        
        // Get balance
        System.out.println();
        System.out.println("--- Balance Check ---");
        System.out.println("ACC001 Balance: " + acc1.getbalance());
        System.out.println("ACC002 Balance: " + acc2.getbalance());
        
        
        // Check active status
        System.out.println();
        System.out.println("--- Active Status Check ---");
        System.out.println("ACC001 Active: " + acc1.accountstatus());
        System.out.println("ACC003 Active: " + acc3.accountstatus());
        
        
        System.out.println();
    	System.out.println("--- ArrayList of Objects ---");
    	
    	ArrayList<BankAccount> allAccounts = new ArrayList<>();
    	allAccounts.add(acc1);
    	allAccounts.add(acc2);
    	allAccounts.add(acc3);
    	
    	
    	// Loop through all accounts
    	System.out.println();
    	System.out.println("--- All Account Balances ---");
    	for (BankAccount account: allAccounts) {
    		System.out.println(account.getAccountNumber() 
    			    + " | " + account.getCustomerName() 
    			    + " | Balance: " + account.getbalance()
    			    + " | Active: " + account.accountstatus()
    			    + " | Account Type: " + account.getAccountType());
    	}
    	
    	// Find all active accounts
    	System.out.println();
    	System.out.println("--- Active Accounts ---");
    	for (BankAccount account: allAccounts) {
    		if (account.accountstatus()) {
    			System.out.println(account.getAccountNumber()
    			        + " - " + account.getCustomerName() + " is ACTIVE");
    		} else {
    			System.out.println(account.getAccountNumber() 
    			        + " - " + account.getCustomerName() + " is INACTIVE");
    		}
    	}
    	
    	// Find accounts below minimum balance
    	System.out.println();
    	System.out.println("--- Below Minimum Balance ---");
    	double minimumBalance = 5000.00;
    	for (BankAccount account: allAccounts) {
    		if (account.getbalance() < minimumBalance) {
    			System.out.println(account.getAccountNumber() 
    			        + " - ALERT Balance " + account.getbalance() 
    			        + " below minimum " + minimumBalance);
    		}
    	}
    	
    	//Testing the setter method
    	System.out.println();
    	System.out.println("--- Setter Tests ---");
    	
    	// Valid update
    	acc1.setCustomerName("Sindhuja Ranganathan");
    	System.out.println("Updated Customer name : " +acc1.getCustomerName());
    	
    	// Invalid update - should be rejected
    	acc1.setCustomerName("");
    	
    	// Deactivate account
    	acc2.setActive(false);
    	System.out.println("ACC002 Active: " + acc2.accountstatus());
    	
    	System.out.println();
    	System.out.println("--- toString() Demo ---");
    	
    	// Print object directly
    	System.out.println(acc1);
    	System.out.println(acc2);
    	System.out.println(acc3);

    	// Also works automatically in ArrayList print!
    	System.out.println("All accounts: " + allAccounts);
    	
    
	}


	
}
