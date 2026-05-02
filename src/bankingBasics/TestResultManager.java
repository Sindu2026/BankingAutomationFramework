package bankingBasics;

import java.util.ArrayList;
import java.util.HashMap;

public class TestResultManager {

	public static void main(String[] args) {
				
		double [] balances = {2000.00, 5000, 6000, 4500, 7800, 5000, 5000, 3460, 9652};
		String [] acc = {"ACC001", "ACC002", "ACC003", "ACC004", "ACC005", "ACC006", "ACC007", "ACC008", "ACC009"};
		double minbal = 5000;
		
		ArrayList<String> passedTests = new ArrayList<>();
		ArrayList<String> failedTests = new ArrayList<>();
		ArrayList<String> skippedTests = new ArrayList<>();
		
		
		for (int i=0; i < balances.length; i++) {
			if(balances[i] > minbal) {
				System.out.println("Test Passed. Balance " + balances[i] + " is higher than the minimum balance " + minbal);
				passedTests.add(acc[i]);
			} else if(balances[i] < minbal) {
				System.out.println("Test Failed. Balance " + balances[i] + " is lower than the minimum balance " + minbal);
				failedTests.add(acc[i]);
			} else {
				System.out.println("Test Skipped. Balance " + balances[i] + " is equal to minimum balance " + minbal);
				skippedTests.add(acc[i]);
			}
		}
		
		HashMap<String, Double> accdetails = new HashMap<>();
		accdetails.put("ACC001", 4500.00);
		accdetails.put("ACC002", 8700.00);
		accdetails.put("ACC003", 3200.00);
		accdetails.put("ACC004", 6900.00);
		accdetails.put("ACC005", 5000.00);
		
		ArrayList<String> customerbelow5000 = new ArrayList<> ();
		ArrayList<String> customerabove5000 = new ArrayList<>();
		
		for(String key : accdetails.keySet()) {
			if(accdetails.get(key) < 5000.00) {
				System.out.println(key + " balance " + accdetails.get(key) + " is less than 5000.00");
				customerbelow5000.add(key);
				
			} else {
				System.out.println(key + " balance " + accdetails.get(key) + " is greater than or equal to 5000.00");
				customerabove5000.add(key);
			}
		}
	
		
		System.out.println("Total Tests:" + balances.length);
		System.out.println("Passed Tests: " + passedTests.size());
		System.out.println("Failed Tests: " + failedTests.size());
		System.out.println("Skipped Tests: " + skippedTests.size());
		
		double passedpercent = ((double) passedTests.size()/balances.length) * 100;
		System.out.printf("Pass Percentage: %.2f%%%n" , passedpercent);
		
		System.out.println();
		System.out.println("---------- Account balance summary ---------");
		System.out.println("Total Customers: " + accdetails.size());
		System.out.println("Total customers with balance below 5000: " + customerbelow5000.size());
		System.out.println("Total customers with balance 5000 and above: " + customerabove5000.size());
	}

}
