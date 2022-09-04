# Getting Started with Groovy

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