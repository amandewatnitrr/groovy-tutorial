# Getting started with Groovy

<p align="justify">
<strong>

## Exception Handling in groovy

- In groovy, similar to Java we can do exception handling using following method `try-catch-catch-..-finally`

### `try-catch-catch-..-fianlly`

- We can have multiple catch blocks with exception handling in Groovy.
- Let's learn `try-catch` with it's generalised syntax and than an example:

```groovy
try
    {
        //Statements
    }
catch(Exception exp)
    {

    }
catch(Exception exp)
    {
        //Statements
    }
finally
    {
        //Statements
    }
```

## String in Groovy

- First of all let's start with how we can take string input from user in groovy,

```groovy
import java.util.*;

class main{
static void function03()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your name, age and Salary??");
            String str = sc.nextLine(); // for String Inpput from user
            int integer = sc.nextInt(); // for Integer Input from User
            double decimal = sc.nextDouble(); // for double Input from user
            System.out.println("Username is ${str}. Age is ${integer} and salary is ${decimal}.");
        }
    static void main(String[] args)
        {
            function03();        
        }
}
```

- We can also define variablles by initialization as well.
- But in groovy we can't print string within single quotes using `${variable_name}` method, this property is known as interpolation.

```groovy
import java.util.*;

class main{
    static void main(String[] args)
        {
            def name = "Name";
            System.out.println("My name is ${name}");
        }
}
```

- We also have '''content''' and """contnet""" i.e. triple single quoted and triple double quoted strings as well.
- Triple double and single quote strings are mainly used for multiple line string storage.

```groovy
import java.util.*;

class main{
    static void main(String[] args)
        {
            //function03();        
            def name = """My name is Aman Kumar Dewangan.""";
            System.out.println("My name is ${name}");
            System.out.println("Length: " + name.length() ); // .length() returns the length of the string.
            System.out.println("name[0]: "+ name[0] + " name[-1]: "+ name[-1]); // We can acess string address from back as well using negative index values.
            System.out.println("Position of 1 in string is: " + name.indexOf('n')); // returns the index of first matching letter in the string
            println(start..end); // prints the substring of the given string in specified range.
            println(name[index1,index2,indx3]); // prints the values in the string at tht specific position/index.
            println(name.substring(start_index,end_index)); // // .substring(_,_)extracts the substring from the speciffied starting index upto ending index
            println(name.subSequence(start_index,end_index)); // .subsequence(_,_)extracts the substring from the speciffied starting index upto ending index
            def list = name.split(" "); // Splits the string into a list with the given character as sepraator.
            println(list);

            /*
                We can also perform certain functions on strings as show below:
            */

            println(name -("Kumar")); // Removes the mentioned word from the string.
            println(name.replace("Kumar", "K")); // Replaces the mentioned word from the string with the specifed one.
            println name.toLowerCase(); // converts the complete string to lower case.
            println name.toUpperCase(); // converts the complete string to upper case.
            println name.toList(); // converts the complete string to list of characters.
            println name.equals(string_name); // compares both the strings and returns true or false. This is case-sensitive.
            println name.equalsIgnoreCase(string_name); // compares both the strings and returns true or false. This is not case-sensitive.

            // There are other methods as well to define a string.

            def s1 = /a My name is Aman Dewangan $name /
            def s2 = $/a My name is Aman Dewangan $name /
        }
}
```

- Points to remember:
  - Except Single and Double Quote initialization, all string declaration methods support multiple lines.
  - Interpolation is not supported for single quoted and triple quoted declaration or initialization of string.

## Functions/Methods in Groovy

- A function is an organized named block of code that is used to perform a single task, that makes code modular and reusable.
- Functions enable programmers to break down or decompose a problem into smaller chunks, each of which performs a particular task.
- It is a declarative type of programming style.
- Methods can take parameters and even have a return type as well.
- Below is the grneral struture of a function:

```groovy
def function_name(datatype parameter1,datatype parameter2...)
    {
        //Statements
        return ;
    }
```

## Closures in Groovy

- Closure is a block of code that can tak parameters, can also refer variables, can return values and can be passed as parameter in a method.
- Closures can access variables in global scope, but functions can't.
- Generalised syntax for closure:

```groovy
    def closure_name = { parameter1 -> // We can remove the paramaeters and arrow, if nothing is required for closure to exectue.
        // Statements
    } // This is the definition of the closure

    closure_name.call(parameter1); // This is the calling code for the closure
```

- Let's see some examples of Closures:

```groovy
import java.util.*;

class main{
    static def function04(nama)
        {
            def closure =  { name ->
                System.out.println("Hello "+ name);
            }

            closure.call(nama);
        }
    static void main(String[] args)
        {
            //function03();      
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter your name: ");
            def name = sc.nextLine();
            function04(name);            
        }        
}
```

- Also, we can pass closure to the functions as well, let's check this through an example:

```groovy
import java.util.*;

class main{
     static def function05(name,age,ctc,clos)
        {
            clos.call(name,age,ctc);
        }

    static void main(String[] args)
        {
            def global_closure = { name,age,ctc->
                    println("username: $name - age: $age - ctc: $ctc");
                }
            
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your username, age and ctc: ");
            String name = sc.nextLine();
            int age = sc.nextInt();
            double ctc = sc.nextDouble();

            function05(name,age,ctc,global_closure);
        }
}
```

### Closure Functions

- There are some pre-exsisting closure functions as well in groovy.
- The data structures in Groovy have several in-built closure functions asscoiated with them.
- Let's know some of them through the examples:

```groovy
import java.util.*;

class main{
    static function06(a,size)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to search for in array: ");
            int v = sc.nextInt();
            a.each{print("$it ")} // .each for arrays and map can be used to traverse through them linearly.
            def maps = [
                "Company" : "GE HTC",
                "SSO ID"  : 223072286,
                "Name"    : "Aman"
            ]
            maps.each{println("$it ")}
            println a.find{item -> item == v} // returns the value if found, if not returns null.
            println a.findAll{item -> item > v} //returns a list of elements from the array satisfying the given condition.
            println a.any{item -> item > v} // returns true if any of the elements in the list satisfy the given condition, else false
            println a.every{item -> item > v} // returns true if all of the elements in the list satisfy the given condition, else false
            println a.collect{item -> item*2} // returns a list after performing arithmetic operation on each element.
        }

    static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Array Size: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++)
                {
                    a[i] =  sc.nextInt();
                }
            function06(a,n);
        }        

        
}
```

</strong>
</p>
