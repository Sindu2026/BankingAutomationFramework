package bankingBasics;

public class Dowhileloop {

	public static void main(String[] args) {
		int sessionTime = 0;
		int sessionLimit = 30;
		
		do {
			sessionTime +=10 ;
			System.out.println("The session is active for " + sessionTime + " minutes");
		}while (sessionTime<sessionLimit);
		
		System.out.println("Session has expired! please login again");
		
	}

}
