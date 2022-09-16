package Curs2;

import java.util.Scanner;

public class IfElseExemple {

	String username ="test";
	String password = "test123";
	String user;
	String pass;
	
	
	public static void main(String[] args) {
	
		IfElseExemple obj = new IfElseExemple();
		obj.intreabaCredentiale();
		obj.verificaCredentiale();
		

		

        // operatorul AND --> &&
        //operatorul OR --> ||
        
        
	}


public void intreabaCredentiale () {
	
	System.out.println("Introdu un username:");
	Scanner scan = new Scanner(System.in);
	user = scan.next();
	System.out.println("Introdu o parola:");
    pass = scan.next();
	
	
}

public void verificaCredentiale() {
	
	if(username.equals(user) && password.equals(pass)) {
    	System.out.println("login sucesfull");
    
    	
    }else {
    	System.out.println("Username or password is wrong!");
    
}

}}