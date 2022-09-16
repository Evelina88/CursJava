package Curs2;

import java.util.Scanner;

public class IfElsePunctaj {

	static int punctajInt;
	public static void main(String[] args) {

		System.out.println("Introdu punctajul testului: ");
		Scanner scan = new Scanner(System.in);
		String punctaj = scan.next(); // "20" -> 20
		punctajInt = Integer.parseInt(punctaj);
		
		calculPunctaj();
	}
	
	public static void calculPunctaj() {
		if (punctajInt <= 65 && punctajInt >= 0) {
	    	System.out.println("Ai picat. Mai incearca");	
	    } else {
	    	System.out.println("Felicitari, ai trecut");
	    }		
	}
}
