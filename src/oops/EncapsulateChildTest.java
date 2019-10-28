package oops;

public class EncapsulateChildTest extends EncapsulationTest{

		
	public static void main(String[] args) {
		EncapsulateChildTest ec = new EncapsulateChildTest();
		ec.setUSERNAME("Aruna");
		System.out.println(ec.getUSERNAME());
		ec.setPASSWORD("Secure1234");
		System.out.println(ec.getPASSWORD());
	}

}
