# Basics

## Classes, not programs

Whereas basic Python can be very minimal, requiring you to type in only the exact commands you wish to execute, there's no way around classes when dealing with Java. The entry point in your program will be a class containing a special method ("main"), and all components you wish to import from other files will also be classes. This overhead makes Java look somewhat cumbersome to a Pythoner, but it's not all that bad, really.

## A simple Hello World class
This is how a typical Hello World program looks in Java
```
public class HelloWorld {

	// The main method is the entry point of a Java program. 
	// This method is what's being run when you execute your Java class. 
	// It has to be declared public static void which might seem confusing and unnecessary. 
	// Just roll with it for now, we'll get to these cryptic keywords later.

	public static void main (String[] argv) {
	
		// To print stuff to your console you can use System.out.println 
		System.out.println("Hello");
		System.out.println("World!");
	
	}
}
```

## Important syntax differences between Java and Python

Pythoners as you are, you probably see two syntax oddities - curly brackets `{}` enclosing classes and methods, and semi colon `;` at the end of each statement. Curly brackets work like indentations (i.e. the number of spaces before each new line) do in Python: We use them for if/else-statements, methods, classes and loops. Indentation isn't necessary in Java, but it makes the code more readable, so don't skip it.


## Examples

Take a look at the examples in this folder, preferably in the following order:

- TypesAndVariabels.java
- ControlFlow.java
- BasicDataStructures.java