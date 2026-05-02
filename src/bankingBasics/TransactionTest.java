package bankingBasics;

import java.util.ArrayList;

public class TransactionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction t1 = new Transaction(12345, "ACC001", "ACC002", 1500.00, "DEBIT", "SUCCESS");
		Transaction t2 = new Transaction(23456, "ACC002", "ACC003", 3500.00, "CREDIT", "PENDING");
		Transaction t3 = new Transaction(34567, "ACC003", "ACC001", 2500.00, "DEBIT", "FAILED");
		Transaction t4 = new Transaction(12346, "ACC002", "ACC001", 2570.00, "CREDIT", "SUCCESS");
		Transaction t5 = new Transaction(23459, "ACC003", "ACC002", 1500.00, "DEBIT", "PENDING");
		
		//Storing the transactions into an array
		ArrayList<Transaction> alltxn = new ArrayList<>();
		alltxn.add(t1);
		alltxn.add(t2);
		alltxn.add(t3);
		alltxn.add(t4);
		alltxn.add(t5);
		
		System.out.println("All Transcation: " + alltxn);
		
		//Filter only Debit transaction
		System.out.println("---------- DEBIT transcations ----------");
		for(Transaction txn:alltxn) {
			if (txn.gettransactionType().equals("DEBIT")) {
				System.out.println(txn);
			}
		}
		
		//Filter only Failed transaction
		System.out.println("---------- FAILED transcations ----------");
		for(Transaction txn:alltxn) {
			if (txn.getstatus().equals("FAILED")) {
				System.out.println(txn);
			}
		}
		
		//Updating the Status
		t2.setstatus("SUCCESS");
		t2.displaytransaction();;

	}

}
