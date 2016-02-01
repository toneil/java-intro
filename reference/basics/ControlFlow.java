
public class ControlFlow {
	
	public static void main (String[] argv) {
		
		int x = 0;

		// If-statements have to be put inside parens

		if (x == 1) {
			System.out.println("x is one");
		} else if (x > 1) {
			System.out.println("x is larger than one");
		} else {
			System.out.println("x is smaller than one");
		}

		// The for syntax requires 3 parameters:
		//  - Initial value of iteration index,
		//	- A condition that must hold if the iteration is to continue
		//	- How much the index should increase after each iteration
		for (int i = 0; i < 10; i++) {
			System.out.println("i is now " + i);
		}
		
		int y = 10;

		while (y > 0) {
			System.out.println("y is now " + y);
			y--;
		}

		int b = 10;
		System.out.println(b + " factorial is " + nFactorial(b));
	}

	private static int nFactorial (int n) {
		if (n < 2) {
			return n; // Return statements break the execution of the function and the flow resumes from where the function was called
		} 
		return n * nFactorial (n-1);
	}
}