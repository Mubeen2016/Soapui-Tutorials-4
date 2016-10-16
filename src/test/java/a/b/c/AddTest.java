package a.b.c;



import junit.framework.TestCase;

public class AddTest extends TestCase {
	public void testAddnumbers(){
		Calculator cal = new Calculator();
		CalculatorPortType cpt = cal.getCalculatorHttpSoap11Endpoint();
		int result = cpt.add(100, 50);
	    System.out.println(result);
	}

}
