package Curs1;

public class PrimulProgramJava {
	
	String prenume= "Oana"; //intance variabile-->are nevoie de un obiect al clasei pentru a o accesa
    int numar = 3;
    char caracter = 'a';
    String nume; //null

    
    
	public static void main(String[] args) {
		//obiectul clasei care imi permite sa accesez variabile si metode din clasa respectiva
		
		PrimulProgramJava obj = new PrimulProgramJava();
		
		String salut = "Buna ";

		System.out.println(salut + obj.prenume);

	}

	
	
	
}
