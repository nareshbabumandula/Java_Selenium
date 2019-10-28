package oops;

public class EncapsulationTest {
	
	private String USERNAME = "Shilpha";
	private String PASSWORD = "Selenium123";
	
	
	public String getUSERNAME() {
		return USERNAME;
	}


	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	
	public static void main(String[] args) {
		EncapsulationTest ec = new EncapsulationTest();
		System.out.println(ec.USERNAME);
		System.out.println(ec.PASSWORD);

	}

}
