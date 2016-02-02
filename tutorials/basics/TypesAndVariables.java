
public class TypesAndVariables {

	public static void main (String[] argv) {

		// To declare a variable we need to specify its type. 
		// Once it's declared we can manipulate it in the familiar Python syntax. 
		// However, variables can't change type!

		int a = 1;
		a = 4+2;
		// a = "Some string"; <- this will cause the compilation to fail

		// There are a couple of "primitive" (i.e. not object-based) types in Java
		int x = 3;
		float f = 3.14f;
		char c = 'C';


		// int can hold numbers between -2147483648 and 2147483647 and float can hold a 32 bit decimal number. 
		// For larger values (or more precise decimals) we can use long and double

		long y = 5386792;
		double d = 2.000000000000000002421452;

		// String is not a primitive type, but a class. 
		// Strings have methods attached to them, as opposed to ints and chars. 

		String str = "Hello!";
		System.out.println(str.toUpperCase());

		// Take a look at the methods below

		a = squared(a);
		System.out.println(a);

		printTwice(str);
		// str = printTwice(str); <- this will cause the compilation to fail. printTwice doesn't return any value!

	}

	// All methods must have return types, and all arguments must be typed
	private static int squared (int a) {
		return a * a;
	}
	
	// If no value is supposed to be spat out, declare the return type as "void"
	private static void printTwice(String str) {
		System.out.println(str);
		System.out.println(str);
	}


}