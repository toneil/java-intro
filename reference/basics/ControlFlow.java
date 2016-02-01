
public class ControlFlow {
	
	public static void main (String[] argv) {
		
		int x = 0;

		if (x == 1) {
			System.out.println("x is one");
		} else if (x > 1) {
			System.out.println("x is larger than one");
		} else {
			System.out.println("x is smaller than one");
		}

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
			return n;
		} 
		return n * nFactorial (n-1);
	}
}