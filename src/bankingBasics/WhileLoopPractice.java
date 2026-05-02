package bankingBasics;

public class WhileLoopPractice {

	public static void main(String[] args) {
		int failedattempts = 0;
		int maxattempts =3;
		boolean isacclocked = false;
		
		while (failedattempts<maxattempts) {
			failedattempts++;
		}
		
		if(failedattempts>=maxattempts) {
			isacclocked = true;
			System.out.println("Account is locked after " + failedattempts +" failed attempts");
		}
	}

}
