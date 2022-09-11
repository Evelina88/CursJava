package Curs4;

public class TestRectangle {

	public static void main(String[] args) {
		
		//clasa (Rectangle) numeObiect (obj) = new (instantiaza clasa) constructorul (Rectangle())
	
		Rectangle obj = new Rectangle();
		//obj.setLenght(24);
		//obj.setWidth(35);
		
		Rectangle obj2 = new Rectangle(4, 5);
		
		
		System.out.println(obj2.calculateArea());

	}

}
