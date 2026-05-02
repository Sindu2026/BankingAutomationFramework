package bankingBasics;

public class LoginDataTest {

	public static String validateLogin(String username, String password) {
		String correctUsername = "sindhuja";
		String correctPassword = "Bank@1234";
		boolean isAccountLocked = false;
	    boolean isAccountActive = true;
	    
	    // Simulate locked user
	    if (username.equals("lockeduser")) {
	    	isAccountLocked = true;
	    }
	    
	    // Simulate inactive user
	    if(username.equals("inactiveuser")) {
	    	isAccountActive = false;
	    }
		
	    // Validation Logic
	    if (isAccountLocked) {
	    	return "Account Locked";
	    } else if (!isAccountActive) {
	    	return "Account Inactive";
	    } else if (username.equals(correctUsername) && password.equals(correctPassword)) {
	    	return "Login Successful";
	    } else {
	    	return "Invalid Credentials";
	    }
	    
	}
	
	public static void main(String[] args) {
		// Create ExcelReader object
		ExcelReader excel = new ExcelReader("testData/LoginTestData.xlsx", "LoginData");
		
		 // Get total rows
		int totalRows = excel.getRowCount();
		System.out.println("Total test cases: " + totalRows);
		
		//Get total columns
		int totalCol = excel.getColumnCount();
		System.out.println("Total Columns of data: " + totalCol);
		System.out.println();
		
		System.out.println("--- Login Data Test ---");
		
	    // Loop through each row starting from 1 (row 0 is header!)
        for (int i = 1; i <= totalRows; i++) {
        	// Read each column
            String username = excel.getCellData(i, 0);
            String password = excel.getCellData(i, 1);
            String expectedResult = excel.getCellData(i, 2);
            
         // Validate login with Excel data
            String actualResult = validateLogin(username, password);
            
            // Compare expected vs actual
            
            if(actualResult.equals(expectedResult)) {
            	System.out.println("Test " + i + ": Passed" );
            	System.out.println("Expected Result: " + expectedResult);
            	System.out.println("Actual Result: " + actualResult);
            	System.out.println();
            } else {
            	System.out.println("Test " + i + ": Failed" );
            	System.out.println("Expected Result: " + expectedResult);
            	System.out.println("Actual Result: " + actualResult);
            	System.out.println();
            }
            /*System.out.println("Test " + i + ":");
            System.out.println("  Username: " + username);
            System.out.println("  Password: " + password);
            System.out.println("  Expected: " + expectedResult);
            System.out.println();*/
        }
		
        // Close excel file
        System.out.println();
        excel.closeWorkbook();

	}

}
