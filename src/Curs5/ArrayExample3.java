package Curs5;

public class ArrayExample3 {
	
	int [] numbers = {200, 300, 600, 100, 800};
	
	/*
	 * sa aflam indexul din array al unui numar
	 * Ex: index pentru element 300 este 1
	 * 
	 * rezolvareCuFor(300)
	 * parcurge cu for array-ul
	 * vom verifica fiecare element din array daca este egal cu 300
	 * daca nu este egal nu facem nimic
	 * daca este egal printam indexul la care se afla
	 * 
	 */

	public static void main(String[] args) {
		ArrayExample3 obj = new ArrayExample3();
		obj.rezolvareCuFor(800);
	 
	}

	public void rezolvareCuFor(int number) {
	
		for(int i=0; i<5; i++) {
			if(numbers[i] == number) {
				System.out.println("Index pentru element "+ number + " este " + i);
				
			}
		}
		
	}
	public void rezolvareCuForEach(int number) {
		int i=0;
		for (int nr : numbers) {
			if(nr == number) {
		
			
			System.out.println("Index pentru element "+ number + " este " + i);
			
			}
			
			i++;
			
		}
		
	}
}
