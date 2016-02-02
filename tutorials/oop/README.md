# Classes and objects

## Constructors

Similar to the `__init__` method from Python, every time we create a new object of some Java class that class' *constructor* is being called. These are special methods, having the same name as their enveloping class, and no return value. Constructors can be used to initialize values, or to supply parameters to the new object. For example, if we have a class `GaussianDist` representing some gaussian distribution, we might want to initialize it with a mean and a variance:

```java
public class GaussianDist {
	
	private double mean;
	private double variance;

	// No return value, method name same as class name - a constructor!
	public GaussianDist (double mean, double variance) {   
		this.mean = mean;
		this.variance = variance;
	}
	...
}

...

GaussianDist gDist = new GaussianDist(4.23, 1.112);

```

## `private` vs. `public`, or Encapsulation

Sometimes, classes, methods and member variables are prefaced by `public`, sometimes with `private`. These keywords are called access modifiers and they - intutively enough - modify access: A member variable or method marked with `private` can only be accessed from within that class, whereas `public` members and methods are visible to all other classes. There are a couple of levels in between those, but for now we'll stick with the basics. To illustrate: 

```java
public class MainClass {
	public static void main (String[] argv) {

	}
}

public class IntSet {
	private int[] elements;
	private int numberOfElements;

	public IntSet () {
		elements = new int[0];
		numberOfElements = 0;
	}

	public void add(int element) {

	}

	private void resize () {
		int[] 
	}
}
```

A good maxim is to use `private` for everything that doesn't absolutely need to be public. In particular, member variables should generally be hidden.

## The `static` keyword
...

## Inheritance

Inheritance in Java works pretty much as it does in Python. A class `Dog` that can be declared a sub-class of `Animal` through the `extends` keyword:

```java
public class Dog extends Animal {
	...
}
```

## Interfaces
....