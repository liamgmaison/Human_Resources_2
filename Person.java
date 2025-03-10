/*
Title: Person.java
Name: William Maison-Bush
Date: 10 March 2025
Purpose: The Person.java file defines the Person class, representing 
		 individuals from hr.txt with attributes like height and weight, 
		 and includes methods for comparison and data handling.
Sources: Java - How to Program - Late Objects 11th Edition Deitel et al
https://www.w3schools.com/java/java_interface.asp
https://www.w3schools.com/java/java_arraylist.asp
https://www.w3schools.com/java/java_polymorphism.asp
https://youtu.be/GhslBwrRsnw?si=WRK-p3-LHWTUA205
https://youtu.be/2hkngtWLGvE?si=jtTT5PVTLpsXpzGk
2251 Example Files
https://www.geeksforgeeks.org/overriding-equals-method-in-java/
}"
*/

// This the creation of the class Person which holds the attributes name, 
// height, and weight.
public class Person {
	
	// These attributes are supposed to be public because they need to be 
	// accessed universally.
	public String name;
	public Double height;
	public Double weight;
	
	// Constructor
	// This sets the construction of the class Person with the attributes 
	// for name, height, and weight.
	public Person(String name, Double height, Double weight)
	{
		this.name = name;
		this.height = height;
		this.weight = weight;
	} // End of Constructor
	
	// Getters
	public String getName()
	{
		return name; 
	} // End of getName()
	
	public Double getHeight()
	{
		return height;
	} // End of getHeight()
	
	public Double getWeight()
	{
		return weight;
	} // End of getWeight()
	
	// Setters
	public void setName(String name)
	{
		this.name = name;
	} // End of setName()
	
	public void setHeight(Double height)
	{
		this.height = height;
	} // End of setHeight()
	
	public void setWeight(Double weight)
	{
		this.weight = weight;
	} // End of setWeight()
	
	// toString() method that can display Name, Height, and Weight
	@Override
	public String toString()
	{
		return String.format("Name: %s\nHeight: %.2f\nWeight: %.2f\n", 
			name, height, weight);
	} // End of Override of toString() method.
	
} // End of class Person