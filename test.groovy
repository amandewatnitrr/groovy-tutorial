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