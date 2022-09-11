package Curs4;

public class TestReturnType {
	
	String Prenume; 

	public static void main(String[] args) {
       TestReturnType obj = new TestReturnType();
		
		System.out.println("Salut" + obj.printeazaNume());
        System.out.println("Ce faci" + obj.printeazaNume());
        
        
        obj.printeazaPrenume();
        System.out.println("Salut" + obj.Prenume);
    
		
	}

	public String printeazaNume() {
		return "Oana";
		
	}
	
	public void printeazaPrenume() {
		Prenume = "Ion";
	}
	
}
