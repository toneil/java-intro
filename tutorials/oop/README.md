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

When using some 3rd party code, you're often interested in what outward behaviour said code has (e.g. whether the sort method of some list library sorts with the smallest or largest element first) and less interested in *how* that behaviour is implemented (e.g. with merge sort or insertion sort). When working on larger projects it's good to reflect about what should be visible to other sections of the code (behaviour) and what should be hidden (implementation).

This distinction is done by prefacing methods, classes and variables with `public` or `private`. These keywords are called access modifiers and they - intutively enough - modify access: A member variable or method marked with `private` can only be accessed from within that class, whereas `public` members and methods are visible to all other classes. There are a couple of levels in between those, but for now we'll stick with the basics. To illustrate: 

```java
public class IntSet {
	private int[] elements;
	private int numberOfElements;

	public IntSet () {
		elements = new int[1];
		numberOfElements = 0;
	}

	public void add(int element) {
		if (hasElement(element)) {
			return;
		}
		if (numberOfElements >= elements.size) {
			resize();
		}
		elements[numberOfElements] = element;
		numberOfElements++;
	}

	public boolean hasElement (int element) {
		for (int i = 0; i < numberOfElements; i++) {
			if (elements[i] == element) {
				return true;
			}
		}
		return false;
	}

	private void resize () {
		int[] newElemArray = int[elements.size * 2];
		for (int i = 0; i < elements.size; i++) {
			newElemArray[i] = elements[i];
		}
		elements = newElemArray;
	}
}
```
In the above class, only the constructor, add and hasElement methods are visible to other classes - the resize method and the member variables are tied to this specific *implementation* of a set, but isn't relevant to the *behaviour*.

A good maxim is to use `private` for everything that doesn't absolutely needs to be public. In particular, member variables should generally be hidden.

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