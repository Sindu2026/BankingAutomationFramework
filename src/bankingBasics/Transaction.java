package bankingBasics;

public class Transaction {
	
	//Fields for transaction
	private int transactionid;
	private String fromAccount;
	private String toAccount;
	private double amount;
	private String transactionType;
	private String status;
	
	public Transaction(int transactionid, String fromAccount, String toAccount, double amount, String transactionType, String status ) {
		this.transactionid = transactionid;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.transactionType = transactionType;
		this.status = status;
		
	}
	
	//Getters- read the value
	
	public int gettransactionid() {
		return transactionid;
		
	}
	
	public String getfromAccount() {
		return fromAccount;
		
	}
	
	public String gettoAccount() {
		return toAccount;
		
	}
	
	public double getamount() {
		return amount;
		
	}
	
	public String gettransactionType() {
		return transactionType;
		
	}
	
	public String getstatus() {
		
		return status;
		
	}
	
	//Setters - Change value with validation
    public void setstatus(String status) {
    	if(status.equals("PENDING") || status.equals("SUCCESS")|| status.equals("FAILED")) {
    		this.status = status;
    	} else {
    	System.out.println("Entered transaction status is invalid. Status not updated");}
    }
    
    
    public void displaytransaction(){
    	System.out.println("---------- Transaction Details ----------");
    	System.out.println("Transactionid: " + transactionid);
    	System.out.println("Transferred from: " + fromAccount);
    	System.out.println("Transferred to: " + toAccount);
    	System.out.println("Amount: " + amount);
    	System.out.println("Transaction type: " + transactionType);
    	System.out.println("Transaction Status: " + status);
    }
    
    public String toString() {
		return "[" + transactionid + "|" + fromAccount + "|" + toAccount + "|" + amount + "|" + transactionType + "|" + status + "]";
    	
    }

}
