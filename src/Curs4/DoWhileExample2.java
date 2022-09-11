package Curs4;

import java.util.Scanner;

public class DoWhileExample2 {
	
	/**
	*Facem un program care intreaba utilizarorul si il inmulteste cu 10
	*Faceam aceasta inmultire doar daca numarul nu este 0
	*Daca numarul este 0 ne oprim
	*
	*/

	public static void main(String[] args) {

     int number;
     Scanner scan = new Scanner(System.in);
     
     do {
    	 
    	 System.out.println("Introdu un numar :");
    	 number = scan.nextInt();
    	 System.out.println(number*10);
  
    	 
     }while(number != 0);
     
     
     
	}

}
