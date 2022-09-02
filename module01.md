# Getting Started with Groovy

<p align="justify">
<strong>

- Groovy is an object oriented programming language.
- This means we write code based on classes, methods and fields.
- This approach leads to a much more structured program than procedural source code with the benefit of enabling non-functional aspects like modularity, reusability and encapsulation.
- Groovy runs on the Java Platform.
- The Source code can be compiled to Java Byte Code and runs on the Java Virtual Machine.
- Difference b/w Groovy and Java:
  - Java only allows static typing. Groovy on the other hand uses Optional-typing meaning you don't nessecarily, spell out the type of field. it will be derived at run-time based on the assigned value. Nevertheless we can still opt for static typing in Groovy as needed.
- The Groovy language comes with advanced programming concepts like metaprogramming, functional programming and closures some of which are not available in Java Programming, maaking it a powerful and flexible tool to solve problems.
- As a Java Programmer, it's easy to read and write Groovy Source code.
- The syntax is compact and easy to learn and aligns with Java constructs and extends it with new concepts.
- While the syntax looks familar you will notice that you can express logic in a more concise and less verbose fashion.
- Groovy is not a competitor to Java. They rather compliment each other.
- Exsisting Java Programs can be enhanced with Groovy code. We can even mix Java and Groovy Source Code based on our needs.
- Groovy features make it easy to build domain specific language to model higher level abstracted and understandable MIDI languages designed to solve a particular problem.
- Groovy comes with 2 tools for executing code without having to explicitly process them with a compiler.
- `GroovyShell` is a read-eval-print loop interpreter (REPL). It is a great option for executing single-line Groovy Statements.
- We can open `GroovyShell` with the command `groovysh`
- We can open the `Groovy Console` using `groovyConsole` command.
- The Groovy Console represents a more convinient user interface for executing Groovy Statements.
<hr>

### Difference between Java and Groovy

- In Java, every source file with the file extension `.java` has to be compiled to byte code. Only then it could be executed on the JVM. This workflow is a good use case for more complex programs. However, scriptability is somewhat limited.
- Groovy comes with both modes out of the box. you can compile source code with the file extension `.groovy` or execute a groovy program as a script without a main method.
- Java enforce static typing. When creating a varibale you always have to assign the corresponding type.
- Groovy provides the option to use the def keyword to determine the type at runtime. This is also called duck-typing.
- Alternatively, a variable can assign a concrete type. We can also tell the Groovy compiler to enforce static typing if needed.
- Java developers often complain about having to write a lot of boilerplate code.
- In Groovy, getter and setter methods are generated at runtime for a class memeber. We donot have to write the code for it.
- Java requires developers to write constructors and implementation details of the equals, hashCode and toString methods.
- To eas the pain, Groovy provided class-leel annotations for generating those methods at compile time, so called AST transformations.
- Importing any package except `java.lang.*` is mandatory in Java. in prodcution code, we often see long list of imports.
- Groovy automatically imports a list of packages commonly used in programs.
- In Java, the default modifier, for classes, methods and fields is package-private.  To expose the functionallity, you have to assign the public modifier.
- Groovy makes everything public by default, which leads to less verbose code. Ofcourse you can enforce encapsulation as needed.
- In Java, every statement has to end with a semicolon.
- in Groovy, semicolons are optional. It is only needed to seprate multiple statements on a single line.

## Variables and Data Types in Groovy

- In groovy, we can define a variable similar to the way we do it in Java.
- Groovy is optionally typed(i.e. static and dynamic typing both)
- A statically-typed language is a language (such as Java, C, or C++) where variable types are known at compile time.
- A dynamically-typed languages perform type checking at runtime, while statically typed languages perform type checking at compile time.
- We specify a variable name ,and assign value.
- groovy like java is case sensitive.
- Let's uderstand this with an example below:

```groovy
class main{

    static void module01()
        {
            def age=40;
            def name="sunil"
            def (String a,int b, double c) = [30,40,50] /* We can also assign values to multiple variables at same time suignthe following method.*/
            println name + "'s age is: " + age;
            println "${name}'s age is ${age}.";
            println a;
            print " ${b}";
            print " ${c}";
            println age.getClass();
        }
    static void main(String[] args)
        {
            module01();
        }
}
```

- There are following datatypes in groovy:
  - byte
  - short
  - int
  - long
  - float
  - double
  - char
  - Boolean
  - String

- We can convert a variable from one type to another using following code syntax:

```groovy
  def var2 = (datatype)var1 // type conversion
```

## Operators


</strong>
</p>
