package Curs6.Exceptions;

public class MyCustomException extends Exception {
	
         public MyCustomException(String mesaj) {
        	 super(mesaj);
        	 
        	 //this -> face referinta catre obiectul clasei in care se afla
        	 //super -> face referinta catre obiectul clasei parinte
        	 
        	 //o variabila care se cheama : nume
        	 
        	 //In aceiasi clasa: this.nume
        	 //catre clasa parinte : super.nume
         }

	
}
