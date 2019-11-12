package exceptions;

public class UncheckedException {
	
	public void unCheckedExceptionDemo()
	{
		boolean bFlag = false;
		
		try {
			String[] names = {"aruna","shilpa","himabindu"};
			System.out.println(names[0]);
			System.out.println(names[1]);
			System.out.println(names[2]);
			//System.out.println(names[3]);
			
			int a=10;
			int b=20;
			int c=a+b;
			//int d = a/0; // Infinite
			System.out.println("Addition of a and b is : " + c);
			bFlag = true;
		} 
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array Index Exception Occured");
			System.out.println(a.getMessage());
		}
		catch(ArithmeticException b)
		{
			System.out.println("Arithmatic Exception Occured");
			System.out.println(b.getMessage());
		}
		catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		finally {
			if (bFlag) {
				System.out.println("Successfully executed the method");
			} else {
				System.out.println("Failed to execute the method");
			}
		}
		
	}
	
	

	public static void main(String[] args) {
		
		UncheckedException uc = new UncheckedException();
		uc.unCheckedExceptionDemo();
	}

}
