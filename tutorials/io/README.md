# Input/Output

Sooner or later you'll come to a point where your precious little program has to leave the nest, spread its wings and erase your file system. 

The examples in this section lists some of the most common ways to interact with Java programs. They don't come in any particular order.

## stdin, stdout, stderr

Most process have 3 standard streams that communicate with the rest of the operating system, `stdin`, `stdout` and `stderr`. Usually, `stdin` lets you input things in the terminal in real time, `stdout` prints stuff to the terminal and nevermind `stderr` (it works like `stdout`). When you pipe processes in UNIX you connect the `stdout` of the first process to the `stdin` of the other. Take for example `cat` and `grep`: `cat textfile.txt | grep someTerm` will direct the contents of `textfile.txt` to the outstream of `cat`, pipe it to the instream of `grep`, which will search for "someTerm" and direct the results to the outstream of `grep`. Since we don't add any more pipes, grep's `stdout` will be printed to our terminal.

In Java we access these streams through members of the `System` class: `System.out` gives us `stdout` and `System.in` `stdin`. You've already seen ``java System.out.println(someString)``; as you might expect, this sends `someString` (as well as an additional linebreak) to the `stdout` of whatever process we're running, and allows us to either see it in our terminal, pipe it to another process or send it to some file. 

Output is easy; we needn't worry about interpreting the data (it's the next program's problem), we just chuck it out the door. Input, however, is a bit trickier - directly, we can only read low-level bytes from `stdin`. This is a bit bothersome, so instead we wrap the `stdin` (i.e. System.in) in a `Scanner` object.

Here's an example of piping

```java
import java.util.Scanner;

public class Repeat {
	public static void main (String[] argv) {
		Scanner sc = new Scanner(System.in); 
		while (sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
			System.out.println(input);
		}
	}
}
```
```
> cat someText.txt
Who
ate
my
soup
?
> cat someText.txt | java Repeat | grep o > repeated.txt
> cat repeated.txt
Who
Who
soup
soup
```

## File I/O

First off, working with files comes with an inherent problem: The location of the file you're trying to read or write to might not exist, which may cause your program to throw a fit! Because of this, you'll see a lot of `try ... catch` syntax when dealing with files (or here, `throws Exception` in the main methods); this is how *exceptions* are treated in Java. I'll probably do a section on exceptions and errors at some later point. For now you can ignore anything having to do with the words try/catch/throw.

Aaaaanyway, when reading/writing files it's often easiest to work with *buffers*, objects that abstracts away most of the low-level nitty-gritty stuff and offers clear "I want to read one line from this file"-functionality. There are a couple of different ways to go about this

### Read file

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadExample {
   public static void main(String[] args) throws Exception { 
   		String  thisLine = null;
    	
    	File file = new File("sample-file.dat");

    	// The FileReader gives us byte-by-byte access to the file
    	// BufferedReader lets us treat the stream as lines of text
		BufferedReader reader = new BufferedReader(new FileReader(file));

    	while ((thisLine = reader.readLine()) != null) { 
        	System.out.println(thisLine);
    	}

    	// It's good practice to close any open file streams when you're done with them
    	reader.close();       
   	}
}
```

### Write file

```java
import java.io.PrintWriter;
import java.io.File;

public class FileWriteExample {
  	public static void main(String[] args) throws Exception {
    	File file = new File ("output.txt");
    	PrintWriter printWriter = new PrintWriter(file);
    	printWriter.println ("hello");
    	printWriter.close ();       
  	}
}
```

## Command line arguments

It's time to look at that cryptic `String[] argv` stuff you've seen in all these main methods. It's actually quite straight forward: When executing a Java program you can specify additional arguments for it to process, separated with whitespaces:

```
> java SomeClass argument1 argument2 argument3 ...
```
What happens then is that `argv` is populated with these arguments, represented as strings. So if we have the following program:

```java
public class EchoArgs {
	public static void main (String[] argv) {
		for (String argument : argv) {
			System.out.println(argument);
		}
	}
}
```
and then execute it with some arguments, we'll get the following output:

```
> java EchoArgs 2015 was terrible
2015
was
terrible
```

### What about numerical input then?

Java doesn't magically convert strings to numbers when it's convenient, but manual parsing isn't that hard. Consider the following:

```java
public class Factorial {
	public static void main (String[] argv) {
		String firstArg = argv[0];
		int n = Integer.parseInt(firstArg);
		int x = 1;
		while (n > 1) {
			x = x * n;
			n--;
		}
		System.out.println(x);
	}
}
```

Executing this will look something like:

```
> java Factorial 10
3628800
```

