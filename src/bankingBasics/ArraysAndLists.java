package bankingBasics;

import java.util.ArrayList;
import java.util.HashMap;

public class ArraysAndLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] accountNumbers = {"ACC001", "ACC002", "ACC003", "ACC004", "ACC005"};
		
		double[] balances = {15000.00, 2500.00, 50000.00, 8000.00, 1200.00};
		
		double minimumBalance = 5000.00;
		
		ArrayList<String> passedTests = new ArrayList<>();
		ArrayList<String> failedTests = new ArrayList<>();
		
		System.out.println("----- Accouunt Balance Check -----");
		
		for(int i=0; i<accountNumbers.length; i++) {
			if(balances[i] >minimumBalance) {
				System.out.println("Test Passed: Account balance " + balances[i] + " for the account number " + accountNumbers[i] + " is greater than the " + minimumBalance);
				passedTests.add(accountNumbers[i]);
			} else {
				System.out.println("Test Failed: Account balance " + balances[i] + " for the account number " + accountNumbers[i] + " is less than the " + minimumBalance);
				failedTests.add(accountNumbers[i]);
			}
			
		}
		
		System.out.println("-----------------------");
		System.out.println("Total Test: " + accountNumbers.length);
		System.out.println("Passed Test: " + passedTests.size());
		System.out.println("Failed Test: " + failedTests.size());
		System.out.println("Passed account numbers: " + passedTests);
		System.out.println("Failed account numbers: " + failedTests);
		
		
		System.out.println("-----------------------");
		System.out.println("--- ArrayList Operations ---");
		
		// Check if a specific account failed
		System.out.println("Did ACC002 fail?: " + failedTests.contains("ACC002"));
		System.out.println("Did ACC001 fail?: " + failedTests.contains("ACC001"));
		

		// Get specific item by position
		System.out.println("First failed account: " + failedTests.get(0));
		
		// Remove an account from failed list
		failedTests.remove("ACC002");
		System.out.println("After removing ACC002: " + failedTests);
		
		// Check if failed list is empty
		boolean failure = failedTests.isEmpty();
		System.out.println(failure);
		boolean hasfailure = !failedTests.isEmpty();
		System.out.println(hasfailure);
		System.out.println("Any failures remaining? " + !failedTests.isEmpty());
		
		// Clear entire list
		passedTests.clear();
		System.out.println("Passed list after clear: " + passedTests);
		
		
		System.out.println();
		System.out.println("--- HashMap Operations ---");
		
		// Create HashMap - key=String, value=Double
		HashMap<String,Double> accountBalances = new HashMap<>();
		
		//Add Accounts
		accountBalances.put("ACC001", 15000.00);
		accountBalances.put("ACC002", 2500.00);
		accountBalances.put("ACC003", 50000.00);
		
		
		// Get balance for specific account
		System.out.println("Balance on ACC001: " + accountBalances.get("ACC001"));
		System.out.println("Balance on ACC002: " + accountBalances.get("ACC002"));
		
		// Check if account exists03", 50000.00)
		System.out.println("Does ACC003 exists?: " + accountBalances.containsKey("ACC003"));
		System.out.println("Does ACC004 exists?: " + accountBalances.containsKey("ACC004"));
		
		//Update balance
		accountBalances.put("ACC001", 20000.00);
		System.out.println("Updated ACC001 balance: " + accountBalances.get("ACC001"));
		
		// Total accounts
		System.out.println("Total accounts: " + accountBalances.size());
		
		//Print all accounts
		System.out.println("Accounts List: " + accountBalances);
		
		
		System.out.println();
		System.out.println("--- Enhanced For Loop ---");
		System.out.println("All account numbers:");
		for (String account : accountNumbers) {
		    System.out.println(account);
		}

		// Enhanced for loop on ArrayList
		System.out.println("Failed accounts:");
		for (String failed : failedTests) {
		    System.out.println(failed);
		}

		// Enhanced for loop on HashMap
		System.out.println("All balances:");
		for (String key : accountBalances.keySet()) {
		    System.out.println(key + " → " + accountBalances.get(key));
		}
	}

}
