import java.util.*;

class main{

    static void fucntion01()
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
    static void fucntion02()
        {
            assert 2 + 1 == 3;
            assert 4 - 3 == 1;
            assert 5 - 3 == 9; // An assertion error will be raised in this line.
            assert 2 % 2 == 0;
        }
    static void function03()
        {
            def name = """My name is Aman Kumar Dewangan.""";
            System.out.println("My name is ${name}");
            System.out.println("Length: " + name.length() ); // .length() returns the length of the string.
            System.out.println("name[0]: "+ name[0] + " name[-1]: "+ name[-1]);
            System.out.println("Position of n in string is: " + name.indexOf('n'));
            println(name.substring(5,19)); // extracts the substring from the speciffied starting index upto ending index
            println(name.subSequence(5,19)); // .subsequence(_,_)extracts the substring from the speciffied starting index upto ending index
            def list = name.split(" "); // Splits the string into a list with the given character as sepraator.
            println(list);

            /*
                We can also perform certain functions on strings as show below:
            */

            println(name -("Kumar"));
            println(name.replace("Kumar", "K"));
            println name.toLowerCase();
            println name.toUpperCase();
            println name.toList();
        }
    static void main(String[] args)
        {
            //function03();        
            
        }

        
}