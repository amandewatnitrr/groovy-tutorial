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
    static def function04(nama)
        {
            def closure =  { name ->
                System.out.println("Hello "+ name);
            }

            closure.call(nama);
        }
    
    static def function05(name,age,ctc,clos)
        {
            clos.call(name,age,ctc);
        }

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
                                    temp.add(sc.next()); // Adds the element given as input to the end of the list
                                }
                            a.add(temp);
                        }

                }
            println(a);
            println(a[1]); // Access the complete data at row index 1
            println(a[1][1]) // Access a single data block in the multidimensional-list
            println(a.get(1).get(1)); // The above task can be done like this as well.
            println(a[1..3]) // Prints all the values in the list in the specified range.
            println(a.contains(22));
            println(a.size()) // reutrns the number of rows in the list
            println(a[0].size()) // reutrns the number of columns in the 1st row.
            // in additon to add function in list we can append the elment using this another method.
            a<<20; // Pushes in the value at the end of the list.
            
        }

    static void main(String[] args)
        {
            function07();
        }        

        
}