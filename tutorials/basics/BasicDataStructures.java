import java.util.ArrayList;

public class BasicDataStructures {

    public static void main(String[] argv) {

        // - Arrays -

        // The most basic data struct in Java is the array. Arrays have fixed size.
        int[] intArray = new int[40]; // Creates an array of 40 ints and store it to the variable intArray
        int[] someOtherArray;
        someOtherArray = new int[20];

        // The elements of the array can be accessed like so:
        intArray[4] = 4;
        System.out.println("Element at index 2 :" + intArray[2]);

        // If we try to access elements outside of our specified bounds we'll run into trouble.
        // Not at compilation though, as with type errors, but when the code is actually run.
        // intArray[15] = 2; Will throw java.lang.ArrayIndexOutOfBoundsException: 15 when run
        // intArray[-3] = 1; Will throw java.lang.ArrayIndexOutOfBoundsException: -3 when run

        // In the same way int[] is an array of ints, int[][] is an array of int[], i.e. a two-dimensional matrix.
        int[][] intMatrix = new int[20][];  // Creates an array of 20 int[] arrays, i.e. a matrix with room for 20 columns
        intMatrix[0] = new int[20];         // Creates an int array of 20 ints and store it as the first column of intMatrix
        intMatrix[0][3] = 4;                // Stores 4 in the third row of the first column
        // intMatrix[3][3] = 4;             // Compilation error! We have not initialized the 3rd column yet!

        int[][] someOtherMatrix;
        someOtherMatrix = new int[20][20];  // We can initialize all columns at once
        someOtherMatrix[5][12] = 1;


        // - Lists -

        // ArrayList is a list class that provides dynamic lists, i.e. with variable size
        // As with arrays, we need to specify what type the elements of the list have
        // This is done with a somewhat odd notation. Don't worry, we'll cover that later
        // One thing to note, however, is that ArrayList don't accept primitive types like int or char
        // Instead we have to use so-called "wrapper classes" for these; Integer and Char
        // These work rather seemlessly with the primitive types, so it's not that big of a deal, really.

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(4); // Adds 4 at index 0
        intList.add(6); // Adds 6 at index 1

        System.out.println("The whole list: " + intList);        // The ArrayList class enables nice printing of the entire list

        System.out.println("First item: " + intList.get(0)); // Prints 4;

        intList.remove(0);                  // Removes the 0th item, i.e. 4, shifting the rest of the list. 6 is now at index 0

        System.out.println("First item after removal: " + intList.get(0)); // Prints 6;


        // - Iteration -

        // We can iterate over arrays with a nifty for-syntax

        int[] array = new int[10];

        for (int i : array) {
            System.out.println("Element of new array: " + i); // Prints a lot of zeroes! This is because int[] is initialized with 0 in every cell.
        }

        // We can initialize the values of the array by looping through numbers 0-9
        // Be careful when doing this, so that you don't iterate too far and get an ArrayIndexOutOfBoundsException!
        for (int i = 0; i < 10; i++) {
            array[i] = i * i;
        }

        for (int a : array) {
            System.out.println("Squared array: " + a);
        }

        // We can use the same syntax with lists
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("First item");
        stringArray.add("Second item");
        stringArray.add("Last item");

        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}