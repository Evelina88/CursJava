package Curs6.Exceptions;

public class TestAgeVerifier {

	public static void main(String[] args) {

		AgeVerifier obj = new AgeVerifier();
		try {
			obj.checkAgeLimit(5);
		} catch (MyCustomException e) {
			System.out.println("You must be 18 to vote!");
			e.printStackTrace();
			
		}
		
		System.out.println("-------------------------");
		
		try {
			obj.checkAgeLimit(5);
			
			
		}catch (MyCustomException e) {
			System.out.println("You must be 18 to acces this site!");
			e.printStackTrace();
		}
		
	}

}
