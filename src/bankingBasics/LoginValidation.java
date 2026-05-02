package bankingBasics;

public class LoginValidation {

	public static void main(String[] args) {
		String username = "Sindhuja Ranganathan";
		String password = "Bank@1234";
		int failedAttempts = 0;
		boolean isacclocked = false;
		boolean isaccactive = false;
		
		if(isacclocked == true) {
			System.out.println("Test Failed: Account is locked. Please contact the banking center.");
		}
		
		else if(failedAttempts >= 3) {
			System.out.println("Test Failed: Too many failed attempts. Account is locked.");
		}
		
		else if(isaccactive == false) {
			System.out.println("Test Failed: Account is inactive. Please contact the banking center.");
			
		}
		
		else if(username.equals("Sindhuja Ranganathan") && password.equals("Bank@1234")) {
			System.out.println("Test Passed: Login Successful");
		}
		
		else {
			System.out.println("Test Failed: Invalid Credentials");
		}
		
	}

}
