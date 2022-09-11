package Curs1;

public class SalariiCalculator {

	public static void main(String[] args) {

		Tester tester1Obj = new Tester ();
		tester1Obj.setNume("Oana");
		tester1Obj.setRatePerHour(25);
		tester1Obj.setAge(34);
		
		
		Tester tester2 = new Tester ();
		tester2.setNume("Maria");
		tester2.setRatePerHour(30);
		tester2.setAge(32);
		
		//System.out.println(tester1Obj.getNume());
		//System.out.println(tester2.getNume());
		
		SalariiCalculator obj = new SalariiCalculator();
		System.out.println("Salariul lui " + tester2.getNume() + " este " + obj.calculateSalary(tester2.getRatePerHour()));
		
		System.out.println(tester1Obj.getNume() + " are: " + tester1Obj.getAge() + " ani !");
		System.out.println(tester2.getNume() + " are: " + tester2.getAge() + " ani !");
	}
    
	public int calculateSalary(int plataPeOra) {
		
		int salary = plataPeOra * 40;
		
		return salary; 
		
		
		
	}
}
