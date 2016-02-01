# Intro to Java

## About the repository

This is the landing page for the code group. It will contain some excersises and reference examples for various Java concepts.

To copy the repository to your local machine, make sure that you have `git` installed, and type the following in your terminal 

```
git clone https://github.com/toneil/java-intro.git
```

## Java essentials

To compile and run Java code you need to have `jdk` installed, which can be found [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)

Compiling Java is done by executing the `javac` command like so:

```
javac NameOfClass.java
```

**Important**
The name of the file has to match the class you want to compile.

If you are using external libraries you have to tell the compiler where these are by specifying the `classpath`

```
javac -cp path/to/lib1:path/to/lib2/path/to/lib3 NameOfClass.java
```

When you have compiled NameOfClass.java you should see a new file appearing in the same folder. To execute this file, run

```
java NameOfClass
```

**Important**
You should have a `public static void main (String[] argv)` method in the class you're trying to execute, or all hell will break loose. Or not. Nothing will happen, really. You'll just get a bunch of error messages.

