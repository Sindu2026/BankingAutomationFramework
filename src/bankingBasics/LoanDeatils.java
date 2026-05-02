package bankingBasics;

public class LoanDeatils {

	public static void main(String[] args) {
		
		String Loantype = "Car";
		double Loanamt = 5600.78;
		double Intrate = 5.6;
		int LoanTenure = 5;
		boolean isloanapproved = true;
		int numEMIpaid = 12;
		
		System.out.println("Loan Type: " + Loantype);
		System.out.println("Loan Amount: " + Loanamt);
		System.out.println("Interest Rate: " + Intrate + " %");
		System.out.println("Loan Tenure: " + LoanTenure + " years");
		System.out.println("Loan Approval Status: " + isloanapproved);
		System.out.println("No. of EMI paid: " + numEMIpaid);
		

	}

}
