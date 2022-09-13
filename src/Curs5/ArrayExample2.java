package Curs5;

public class ArrayExample2 {

	public static void main(String[] args) {
	String [] culori = new String [5];
	//String[] culori = {null, null, null, null, null};
		culori [0] = "galben";
	//String[] culori = {galben, null, null, null, null};
		culori [1] = "alb";
	//String[] culori = {galben, alb, null, null, null};
		culori [2] = "negru";
		culori [3] = "verde";
		culori [4] = "rosu";
	
		
		//System.out.println(culori [3]);
		
		//for clasic
		for(int i=0; i<=4; i++) {
			System.out.println(culori [i]);
		
	} System.out.println("----------------------------------------");
	
       //for each 
	for(String element : culori) {
		System.out.println(element);
	}
		

}
	
}
