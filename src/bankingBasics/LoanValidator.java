package bankingBasics;

public class LoanValidator {
	
	
	public static boolean isEligibleAge (int age) {
		if(age>=21 && age <= 60) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static boolean isCibilScoreValid(int score) {
		if(score>750) {
			return true;
		} else {
			return false;
			
		}
	}
	
	public static boolean isIncomeEligible(double income, double loanAmount) {
		if(loanAmount<10*income) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public static String validateLoanApplication(int age, int cibilScore, double income, double loanAmount) {
		if(!isEligibleAge(age)) {
			return "Loan Rejected. Age should be between 21 and 60. But the age provided is " + age;
		} else if (!isCibilScoreValid(cibilScore)) {
			return "Loan Rejected. " +cibilScore+ " is less than the minimum Cibil score (750) requried."; 
		} else if (!isIncomeEligible(income, loanAmount)) {
			return "Loan Rejected. Requested loan amount "+ loanAmount + " is greater than the approved loan amount " + 10*income ;
		} else {
			return "Loan approved successfully";
		}
	}

}
