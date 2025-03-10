/*
Title: Main.java
Name: William Maison-Bush
Date: 10 March 2025
Purpose: The Main.java file processes data from hr.txt, using PersonList and 
		 PersonSet to manage Person objects while handling duplicates.
Sources: Java - How to Program - Late Objects 11th Edition Deitel et al
https://www.w3schools.com/java/java_interface.asp
https://www.w3schools.com/java/java_arraylist.asp
https://www.w3schools.com/java/java_polymorphism.asp
https://youtu.be/GhslBwrRsnw?si=WRK-p3-LHWTUA205
https://youtu.be/2hkngtWLGvE?si=jtTT5PVTLpsXpzGk
2251 Example Files
ChatGPT: "What am I doing wrong because this code is not getting rid of
		  duplicates?" Response: Fix: Use == 0 for Exact Comparison
https://www.geeksforgeeks.org/overriding-equals-method-in-java/
}"
*/

// Imports
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		
		// A: Create a test person object
		
		Person testPerson = new Person("Vault Dweller", 180.0, 180.0);
		System.out.println(testPerson);
		
		// B: Create a PersonSet object
		
		// We will be using this PersonSet object to store Person objects that
		// contains information gathered by the while loop below. The output
		// is to simply confirm that the PersonSet object has been created. It
		// is important to remember that the PersonSet object uses an ArrayList
		// to store the Person objects that are created by the while loop.
		PersonSet personSet = new PersonSet();
		System.out.println(personSet);
		//personSet.printpeople();
		
		// C: Read in data from hr.txt
		
		// The try loop is for exception handling which is important when 
		// gathering data input from an external file.
		try {
			// Open hr.txt that contains Nintendo human resources information
			File file = new File("hr.txt");
			// Creates a scanner to read in the file.
			Scanner fileReader = new Scanner(file);
			
			// This if statement skips the header.
			// It first checks if the document has an empty line immediately
			// with .hasNextLine(), but if not, it skips the line and starts 
			// entering information.
			if (fileReader.hasNextLine())
			{
				fileReader.nextLine();
			} // End of if statement
			
			// This while loop takes in the ifnormation and stores it it as a 
			// string for name, double for height, and double for weight. It
			// takes this information and creates a Person object named
			// newPerson and adds the information into that object. It then
			// adds the newPerson object tot he personSet using the personSet
			// add method.
			while (fileReader.hasNextLine())
			{
				// These are the attributes that will be stored in the object
				// newPerson.
				String name = fileReader.next();
				Double height = fileReader.nextDouble();
				Double weight = fileReader.nextDouble();
				
				// Once we have the attributes, we will pass them into a Person
				// object that is called newPerson.
				Person newPerson = new Person(name, height, weight);
				// Then we will add this Person object to personSet, which is
				// an object that is also an array list. We use the add method
				// that is in PersonSet that has been inherited from PersonList
				// but has been overriden to check for duplicates.
				personSet.add(newPerson);
			} // End of while loop
			
			// Once all the data has been entered into personSet, we close the 
			// scanner.
			fileReader.close();
			
			// This is the catch part of the try-catch. My IDE automatically
			// filled in the block, so I modified it a little. I also added 
			// System.exit(1) to allow the program to simply exit without 
			// breaking.
		} catch (Exception e) {
			// Prints the error in case hr.text is not found.
			System.out.println("\nERROR: FILE NOT FOUND!\n");
			// Exits the program with the error message instead of the 
			// terminal default error codes.
			System.exit(1);
		} // End of try catch.
		
		// We are printing the information contained in personSet using the 
		// method printpeople() from PersonSet.
		System.out.println("\nEmployees: \n");
		personSet.printpeople();
	}
} // End of Main