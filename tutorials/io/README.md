# Input/Output

Sooner or later you'll come to a point where your precious little program has to leave the nest, spread its wings and erase your file system. 

The examples in this section lists some of the most common ways to interact with Java programs. They don't come in any particular order.

## stdin, stdout, stderr

Most process have 3 standard streams that communicate with the rest of the operating system, `stdin`, `stdout` and `stderr`. Usually, `stdin` lets you input things in the terminal in real time, `stdout` prints stuff to the terminal and nevermind `stderr` (it works like `stdout`). When you pipe processes in UNIX you connect the `stdout` of the first process to the `stdin` of the other. Take for example `cat` and `grep`: `cat textfile.txt | grep someTerm` will direct the contents of `textfile.txt` to the outstream of `cat`, pipe it to the instream of `grep`, which will search for "someTerm" and direct the results to the outstream of `grep`. Since we don't add any more pipes, grep's `stdout` will be printed to our terminal.



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

