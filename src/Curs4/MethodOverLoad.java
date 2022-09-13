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
	//obj.printeaza(2);//int 
	
	System.out.println(obj.multiply(4.5, 6));
	
	
	}

	public void printeaza(String ceva) {
		System.out.println(ceva);
	}
	
	public void printeaza() {
		System.out.println();
	}
	
	public int multiply(int a, int b) {
		return a * b; 
		
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	
}
