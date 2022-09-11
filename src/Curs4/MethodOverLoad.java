package Curs4;

public class MethodOverLoad {

	public static void main(String[] args) {
		
		
	System.out.println("doi"); //string
	System.out.println(2); //integer
	System.out.println(2.0);//double
	System.out.println('2');//char
 
	System.out.println("----------------------------------------");

	MethodOverLoad obj = new MethodOverLoad();
	obj.printeaza("Doi");//string
	obj.printeaza(2);//int 
	
	
	
	}

	public void printeaza(String ceva) {
		System.out.println(ceva);
	}
	
	public void printeaza() {
		System.out.println();
	}
	
	public int multiply
	
}
