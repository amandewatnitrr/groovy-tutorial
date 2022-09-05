# Getting Started with Groovy

<p align="justify">
<strong>

## Lists/Array in Groovy

- The List is a structure used to store a collection of data items.
- In Groovy, the List holds a sequence of object references.
- Object references in a List occupy a position in the sequence and are distinguished by an integer index.
- A List literal is presented as a series of objects separated by commas and enclosed in square brackets.
- To process the data in a list, we must be able to access individual elements.
- Groovy Lists are indexed using the indexing operator [].
- List indices start at zero, which refers to the first element.

- Examples of list:
  - [11, 12, 13, 14] – A list of integer values
  - [‘Angular’, ‘Groovy’, ‘Java’] – A list of Strings
  - [1, 2, [3, 4], 5] – A nested list
  - [‘Groovy’, 21, 2.11] – A heterogeneous list of object references

- Below is the code for user defined input in a list:

```groovy
import java.util.*;

class main{
     static void function07() //
        {
            Scanner sc = new Scanner(System.in);
            println("Enter list size: ");
            int n = sc.nextInt();
            def a = [];
            for(int i = 0; i < n; i++)
                {
                    println("No. of elements you want to append in this row: ");
                    int c = sc.nextInt();
                    println("Enter $c values: ")
                    if(c == 1)
                        {
                            a[i] = sc.next();
                        }
                    else
                        {
                            def temp = [];
                            for(int j=0;j<c;j++)
                                {
                                    temp.add(sc.next());
                                }
                            a.add(temp);
                        }

                }
            System.out.println("Enter the row index and column index you are looking for: ");
            p = sc.nextInt();
            q = sc.nextInt();
            println(a);
            println(a[p]); // Access the complete data at row index k
            println(a[p][q]) // Access a single data block at pth row and qth column in the multidimensional-list
            println(a.get(p).get(q)); // The above task can be done like this as well.
            println(a[1..3]) // Prints all the values in the list in the specified range.
            println(a.contains(22)); // returns true or false depending if the list containes the value given as parmaeter.
            println(a.size()) // reutrns the number of rows in the list
            println(a[p].size()) // reutrns the number of columns in the pth row.
            // in additon to add function in list we can append the elment using this another method.
            a<<20; // Pushes in the value at the end of the list.
            a.add(index_position,value); // pushes the specified value at specified index position, pushing all the values to the right by 1 position.
            a.remove(index_position); // removes the value from the specified index position in the list.
            a = a + [value1,value2,..]; // pushes the list at the end of the defined list to which we are adding it.
            a = a.plus([value1,value2,...]); // pushes the list at the end of the defined list to which we are adding it.
            a = a - [value1,value2,..]; // removes the list from the defined list
            a = a.minus([value1,value2,...]); // removes the list from the defined list
            a.pop(); // removes the first element from the list
            a.removeLast(); // removes the last element from the list
            println a.intersect(list2); // prints the values that are common to both the list.
            println a.reverse(); // reverses the complete list
            println a.sort(); // Sorts the list in asscending order
            a.clear() // Makes the list empty and deletes whatever is stored.
            println a.isEmpty(); // returns true if list is empty else returns false.s
        }

    static void main(String[] args)
        {
            function07();
        }        
}
```

## Maps in Groovy

- A Map (also known as an associative array, dictionary, table, and hash) is an unordered collection of object references.
- The elements in a Map collection are accessed by a key value.
- The keys used in a Map can be of any class.
- When we insert into a Map collection, two values are required: the key and the value.
- Following are examples of Maps:
  - [‘TopicName’ : ‘Lists’, ‘Author’ : ‘Raghav’] – Collections of key value pairs which has TopicName as the key and their respective values.
  - [ : ] – An Empty map.
  
- Let's understand this with an example:

```groovy
import java.util.*;

class main{

    static void function08()
        {
            def map_name = [
                "key1" : "value1",
                "key2" : value2
            ]

            println map_name // prints map key andd value pair
            println map_name.key1 // returns key1 value 
            println map_name.key2 // returns key2 value
            println map_name['key2']; // returns key2 value
            println map_name.get('key2'); // returns key2 value
            println map_name.getAt('key2'); // returns key2 value
            println map_name.size(); // returns the number of key value pair in map
            map_name.put('key3','value'); // adds key-value pair to the map
            println map_name
            println map_name.containsKey('key2') // check if the map contains any key with the specified name
            println map_name.containsValue(value1) // check if the map contains any key with the specified value
            println map_name.getClass(); // reutrns the class type of the map
            def map_name2 = map_name.clone(); // creaters a duplicate of the specified map
            println map_name2
            map_name.each{ name,key2 ->
                println("key1: $name - key2: $key2")
            }
            map_name.eachWithIndex{ key,value,i ->
                println "$i | $key | $value"
            }
            map_name.each{entry ->
                println("$entry.key: $entry.value") 
            }
            map_name.clear(); // clears all the key-value pair in the map
            println map_name;
        }

    static void main(String[] args)
        {
            function08();
        }        

        
}
```

## Ranges in Groovy

- A `Range` is shorthand for specifying a sequence of values.
- A Range is denoted by the first and last values in the sequence, and Range can be inclusive or exclusive.
- An inclusive Range includes all the values from the first to the last, while an exclusive Range includes all values except the last.
- Used to create a list of sequential values
- Here are some examples of Range literals:-
  - 1..10 - An example of an inclusive Range
  - 1..<10 - An example of an exclusive Range
  - ‘a’..’x’ – Ranges can also consist of characters
  - 10..1 – Ranges can also be in descending order
  - ‘x’..’a’ – Ranges can also consist of characters and be in descending order
- Let's learn about ranges through some examples:

```groovy
import java.util.*

class main{

    static void function09()
        {
            
            // A simple program to create a user defined range

            Scanner sc = new Scanner(System.in);
            println("Enter the start and ending value of range: ");
            def start = sc.nextInt();
            def end = sc.nextInt();
            def range = start..end;
            println("Range $range");
            println range.size(); // returns the size of the list
            println range.getFrom(); // returns the starting value of the range
            println range.getTo(); // returns the ending value of the range
            println "Enter the index which you want to access: ";
            def k = sc.nextInt();
            println range.get(k); // returns the value at the kth index in the range
            println range[k]; // returns the value at the kth index in the range
            println range.contains(k); //returns true or false depending on the fact if the specified range contains the specifed value
            println range.isReverse(); //returns true or false depending on the fact if the specified range is in decrement order or not.
            def range2 =  range.sublist(3,7);
            println range2;
            print("\n [");
            for (i in range)
                {
                    print "$i "
                }
            print "]";

            print("\n [");
            range.each{ i ->
                print "$i "
            }
            print "]";

            print range instanceof java.util.List
            
        }

    static void main(String[] args)
        {
            function09();
        }
}
```

## Reading files in 

- Reading and Writing files is a one of the core and basic things to learn when learning a programming language.
- The `eachLine` method is a method added to the File class automatically by Groovy
- If for some reason `eachLine` throws an exception, the method mkaes sure that the resource is properly closed. This is true for all I/O resource methdos that Groovy adds.
- Let's understand the following with an example:

```groovy
import java.util.*;

class main{

    static void function10()
        {
            String filepath = "c:/Users/223072287/tech/groovy-tutorial/read.txt";
            // read file line by line
            File file = new File(filepath)
            file.eachLine{ line ->
                println line;
            }
            print "\n";

            // We can also read it as an string as follows:
            println file.text;

            print "\n";

            // We can also collect lines into a list:
            def list = file.collect { it }
            println list;

            print "\n";

            // store file content in a array
            def array = file as String[];
            println array;

            print "\n";

            // read file into a list of string
            def lines = file.readLines();
            println lines;

            print "\n";
            // read lines in a file in a given range
            def linerange = 2..3
            def linelist =[]

            file.eachLine{ line, lineno ->
                if(linerange.contains(lineno))
                    {
                        linelist.add(line);
                    }
            }
            println linelist;
            
            print "\n";

            // read with reader
            def line;
            file.withReader{ reader ->
                while((line = reader.readLine()) != null)
                    {
                        println line;
                    }
                reader.readLine();

            }

            print "\n";

            // reading with new reader
            def outputfile = "read2.txt";
            def reader = file.newReader();
            new File(outputfile).append(reader);
            reader.close();

            // when working with binary files, read content as bytes
            byte[] contents = file.bytes
            println contents;

            println file.isFile();
            println file.isDirectory();
            
            // get list of files from a directory
            new File("c:/Users/223072287/tech/groovy-tutorial/").eachFile{ files ->
                println files.getAbsolutePath();
            }

            // recursively display all files in a directory and it's sub-dir
            new File("c:/Users/223072287/tech/groovy-tutorial/").eachFileRecurse{ files->
                println files.getAbsolutePath();
            }

            // copy file data to another file
            def newfile = new File("read3.txt")
            newfile<< file.text

            // delete file
            newfile.delete();
            

        }

    static void main(String[] args)
        {
            function10();
        }        

}
```

</strong>
</p>
