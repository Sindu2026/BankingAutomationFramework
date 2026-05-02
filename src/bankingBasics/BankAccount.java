package bankingBasics;

public class BankAccount {
	
	// FIELDS - properties every bank account has
	private String accountNumber;
	private String customerName;
	private double balance;
	private boolean isActive;
	private String accountType;
	
	
	 // CONSTRUCTOR - called when creating a new account
	public BankAccount(String accountNumber, String customerName,double balance, boolean isActive, String accountType) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
		this.isActive = isActive;
		this.accountType = accountType;
	}
	
	// GETTERS - read the value
	public String getAccountNumber() {
		return accountNumber;
		
	}
	
	public String getCustomerName()  { 
		return customerName; 
		}
	
    public double getbalance(){ 
    	return balance; 
    	}
    
	public boolean accountstatus() {
		return isActive;
		
	}
	
    public String getAccountType(){ 
    	return accountType; 
    	}
    
    // SETTERS - update the value WITH validation!
    public void setCustomerName(String customerName) {
    	if (customerName != null && !customerName.isEmpty()) {
    		this.customerName = customerName;
    	} else {
    		System.out.println("Invalid name — update rejected!");
    	}
    }
        
    public void setActive(boolean isActive) {
    	this.isActive = isActive;
        System.out.println(accountNumber + " status updated to: " + isActive);
    }
		
	// METHOD 1 - display account details
	public void displayAccount() {
		System.out.println("------------------------------------");
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Balance : " + balance);
		System.out.println("Account Status : " + isActive);
		System.out.println("Account Type : " + accountType);
		System.out.println("------------------------------------");
	}
	
	 // METHOD 2 - deposit money
	public void deposit(double amount) {
		if (amount > 0 )
		{
			balance = amount + balance;
			System.out.println("Deposited amount : " + amount + "| New Balance : " + balance);
			} else {
				System.out.println("Invalid Amount");
			}
	}
	
	// METHOD 3 - withdraw money
	public void withdrawal (double amount) {
		if(amount > balance) {
			System.out.println("Withdrawal Amount " + amount + " is greater than available balance " + balance);
		}
		else if (amount <= 0) 
		{ 
			System.out.println("Invalid withdrawal amount");
			
		} else {
			balance = balance - amount;
			System.out.println("Withdrawal Amount : " +amount + " New Balance : " + balance);
		}
	}
	
	// METHOD 4 - get balance (return method)
	/*public double getbalance() {
		return balance;
		
	}
	
	// METHOD 5 - check if account is active
	public boolean accountstatus() {
		return isActive;
		
	}
	
	// METHOD 6 - check if account type
	public String accountType() {
		return accountType;
		
	}*/
	
	@Override
	public String toString() {
	    return "[" + accountNumber + " | " + customerName 
	    + " | Balance: " + balance 
	    + " | Type: " + accountType 
	    + " | Active: " + isActive + "]";
	}
	

}
