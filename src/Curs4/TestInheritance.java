package Curs4;

public class TestInheritance {

	public static void main(String[] args) {
		
		//Angajat --> Tester --> TesterAutomat
		//Angajat este clasa parinte pentru Tester
		//Tester este clasa copil pentru Angajat
		//Tester este clasa parinte pentru TesterAutomat
		//TesterAutomat este clasa copil pentru Tester
		
		//Angajat are nume si email si le da mai departe catre Tester care este copil
		//Tester are departament si seniority + nume si email pe care le mosteneste de la Angajat 
		//TesterAutomat are ProgrammingLanguage + departament si seniority de la Tester + name
		//si email mostenite de la Angajat prin relatia lui Testter cu Angajat
		
		TesterAutomat tester = new TesterAutomat();
		tester.setProgrammingLanguage("Java"); //-->clasa TesterAutomat
		tester.setDepartament("QA"); //-->clasa Tester
		tester.setSeniority("Junior"); //-->clasa Tester
		tester.setEmail("oana@oana.ro"); //-->clasa Angajat
		tester.setName("Oana"); //-->clasa Angajat
		
	
	}

}
