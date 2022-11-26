package week4;

public class StringBuilderExample {

	public static void main(String[] args) {

		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());

		// Add a middle Initial
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
		
		// Write code that reverses a variable of type StringBuilder() without using the reverse() method, 
			// then print the results to the Console.
		String reverseName = "";
		for (int i = sb.length()-1; i >=0; i--) {
			reverseName += sb.charAt(i);
			System.out.print(sb.charAt(i));
		}
		// "\n" prints a Return character
		System.out.println("\n" + reverseName);
	
	} // end MAIN

} // end CLASS