package basics;

public class DataTypes {

	public static void main(String[] args) {

		// Primitive data types
		byte b=100; 
		short s=124;
		int i=1345;
		long l =342345;
		float f=12.4f;
		double d = 214.23526;
		char c='g';
		boolean bln = true;

		System.out.println("Byte value of b is  : " + b);
		System.out.println("short value of s is  : " + s);
		System.out.println("int value of i is  : " + i);
		System.out.println("long value of l is  : " + l);
		System.out.println("float value of b is  : " + b);
		System.out.println("double value of c is  : " + d);
		System.out.println("char value of c is  : " + c);
		System.out.println("boolean value of bln is  : " + bln);


		// Non primitive data types
		String sText = "hello world this is core java session";
		int[] Marks = {10,20,40,70,35};
		System.out.println(Marks[0]);

		/*Data Conversion
		• Widening conversions convert data to another type that has the same or more bits of storage. E.g.,
		• short to int, long (safe)
		• int to long (safe)
		• int to float, double (magnitude the same but can lose precision) */
		
		byte b2 =120;
		int c2 = b; // Store byte value into int
		System.out.println(c2);	
		
		int i2 =24020;
		double d2 = i2; // Store int value in double
		System.out.println(d2);	
			
		/* • Narrowing conversions convert data to another type that has the fewer bits of storage and/or can lose information. E.g.,
		   • double or float to any integer type
		   • double to float */
		
		int a2 = 129;
		byte b3 = (byte) a2; // Casting or converting
		System.out.println(b3);

	}

}
