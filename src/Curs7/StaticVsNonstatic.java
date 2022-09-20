package Curs7;

public class StaticVsNonstatic {
	
	
	public String nume = "Oana";
	public static String nume2 = "Ioana";
	
	
	public static void main(String[] args) {
	
		StaticVsNonstatic obiect = new StaticVsNonstatic();
		
	    System.out.println(obiect.nume);
	
	
	    System.out.println(nume2);
	    System.out.println(obiect.nume2);
	   
	    
	    StaticVsNonstatic obiect2 = new StaticVsNonstatic();
	    nume2 = "George";
	    System.out.println(obiect2.nume2);
	    System.out.println(obiect.nume2);
	    
	    obiect.printeazaNume();
	}

	public void printeazaNume() {
		System.out.println(nume);
		
	
	}
	
	public static void printeazaNumeStatic() {
		System.out.println(nume2);
		
	}
	
}
