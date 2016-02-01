# Input/Output

Sooner or later you'll come to a point where your precious little program has to leave the nest, spread its wings and erase your file system. 

The examples in this section lists some of the most common ways to interact with Java programs. They don't come in any particular order.

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

