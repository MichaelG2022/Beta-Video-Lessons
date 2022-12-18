package week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
// ARRAYS
		
		/*	Arrays allow storage of elements together.  Arrays are Objects in Java.
		 *	You must choose the size of an Array when it is declared, and once declared, the size of an array is immutable or unchangeable.
		 *	If you know the number of items that you are storing,  Arrays are very effective and useful data structures.
		 *	Items in an array are stored in a continuous manner in memory, and arrays provide for very quick access to the elements.
		 */
		
		//Example declaring an Array of Strings:

			String[] myInstrument = new String[4];
			myInstrument[0] = "Tuba";
			myInstrument[1] = "Trombone";
			myInstrument[2] = "Trumpet";
			myInstrument[3] = "Triangle";
			
		//Another way to create this same array would be as follows:

				String[] myInstrument2 = {"Tuba", "Trombone", "Trumpet", "Triangle"};


		// Note:   that if we try to add an element to index 4 in myInstruments, an  ArrayIndexOutOfBoundsException will be thrown.
			
		/* An Array:
		 * 		- is required to be constructed.
		 * 		- has a fixed size.
		 * 		- holds variables of the same type
		 * 		- has elements that are accessed via an index.
		 */	
			
			
// LISTS
			
		/*	Lists are used to "collect"  elements.   By creating a List, you can store any number of elements,
		 * 	dynamically modifying the List, and the location of each item is managed by the List.
		 * 	Each element is accessible through a variable that you declare as a List.
		 *
		 * 	A List in Java is an Interface.   To use a List in Java, you will import the java.util library,
		 * 	and a List will need to be declared and initialized.  A List is often implemented by the ArrayList class,
		 * 	but can also be implemented by one of these classes:  LinkedList, Vector and Stack.
		 * 	If you choose ArrayList,  you will also have to import ArrayList from java.util.
		 */
			
			
		// Example declaring a List of String:

				List<String> myInstruments = new ArrayList<String>();
				myInstruments.add("Tuba");
				myInstruments.add("Trombone");
				myInstruments.add("Trumpet");
				myInstruments.add("Triangle");

		//Notice that unlike an Array, you can dynamically add additional elements to your List, inserting as many elements as you wish to this same List, without throwing an exception:

				myInstruments.add("Flute");
				myInstruments.add("Clarinet");
				myInstruments.add("Oboe");


		/* A List:
		 * 		- Is Ordered
		 * 		- Preserves Insertion Order
		 * 		- Allows Positional Access and Insertion of Items
		 * 		- Allows Duplicates
		 * 		- Is a Collection of Objects
		 */
			
		//Arrays vs. ArrayLists:

			//To review, the array is a specified-length data structure, and in contrast, the ArrayList is a variable-length Collection class.


	// Research challenge: List can only be created on a Class, How do we create a List of integers?
		// Can you create a List<int>?  How does Java handle this?



	/* Resources:
	 * 		- Java 17 List Documentation
	 * 		- Java 11 List Documentation
	 * 		- The Java Tutorials List Interface
	 * 		- The Java Tutorials Array 
	 */

						
						
						
						 
			
		
			
		
		
		
		
	} // end MAIN

} // end CLASS
