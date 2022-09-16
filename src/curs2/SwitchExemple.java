package Curs2;

import java.util.Scanner;

public class SwitchExemple {
String calificativ; 
	
	/*
	 * 
	 * Intrebam utilizatorul ce calificativ a primit
	 * 
	 * Daca a primit A printam "Good job!"
	 * Daca a primit B printam "Not that good!"
	 * Daca a primit C printam "Bad!"
	 * Daca a primit orice in afara de cele de mai sus printam "Please insert a valid grade!"
	 * 
	 */
	
	public void intrebamUnCalificativ() {
		System.out.println("Te rog introdu un calificativ:");
	    Scanner scan = new Scanner(System.in);
	    calificativ = scan.next();
	}
	
	public void felicitamStudentul() {
		
		switch(calificativ.toUpperCase()) {
		case "A":
			System.out.println("Good job!");
			break;
		case "B":
			System.out.println("Not that good!");
			break;
		case "C":
			System.out.println("Bad!");
			break;
		default:
			System.out.println("Please insert a valid grade!");
		}
	}
}


