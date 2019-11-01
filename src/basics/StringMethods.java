package basics;

public class StringMethods 
{

	// Main method
	public static void main(String[] args) 
	{
		String sText1 = "hello world";
		String sText2 = "JAVA TRAINING";
		String sText3 = "welcome to core java training";
		String sText4 = "happy learning";
		String sText5 = "                             welcome team               ";
		
		System.out.println(sText1.toUpperCase()); // Convert a lowercase string into an uppercase
		System.out.println(sText2.toLowerCase()); // Convert Uppercase string to a lowercase
		System.out.println(sText3.length()); // Length of the string
		System.out.println(sText4.startsWith("h")); // Starts-with - true or false
		System.out.println(sText1.indexOf('e')); // Returns 0 as an index for the first character
		System.out.println(sText2.contains("JAVA")); // Contains a substring in a main string
		System.out.println(sText3.endsWith("training")); // Verifies the ends with string or character and returns true or false
		System.out.println("String Comparision : " + sText4.equalsIgnoreCase("HAPPY LEARNING")); // Compare strings and return true or false
		System.out.println(sText1.charAt(4)); // Returns the character found the given index
		System.out.println(sText2.isEmpty()); // Returns true or false
		System.out.println(sText3.substring(0, 5)); // Extract the substring from the start and end position given
		System.out.println(sText4.replaceAll("learning", "core java training"));
		System.out.println(sText5.trim()); // Remove the spaces from either sides of a string
		
		String[] asText = sText3.split(" ");
		System.out.println(asText[0]);
		System.out.println(asText[1]);
		System.out.println(asText[2]);
		System.out.println(sText3.join("!", asText));
		String strText = "welcome to core java training";
		
		System.out.println(strText.indexOf("java"));
		
		
	}

}
