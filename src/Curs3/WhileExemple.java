package Curs3;

import java.util.Scanner;

public class WhileExemple {

	public static void main(String[] args) {
		
	System.out.println("Please enter a number");	
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	
	//Rezolvare cu for
	for(int i=1; i<=10; i++)  {
		
		System.out.println(number + " * " + i + " = " + number*i);
	}
	
	System.out.println("---------------------------------------------");
	//Rezolvare cu While 
	
	int x=1;
	while(x<=10) {
		
		System.out.println(number + " * " + x + " = " + number*x);
		x++;
	}
			

	}

}
