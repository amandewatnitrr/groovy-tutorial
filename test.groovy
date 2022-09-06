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

    static void function08()
        {
            def employee = [
                "name" : "Aman",
                "age" : 21
            ]

            println employee
            println employee.name
            println employee.age
            println employee['age'];
            println employee.get('age');
            println employee.getAt('age');
            println employee.size();
            employee.put('key','value');
            println employee
            println employee.containsKey('age')
            println employee.containsValue(21)
            println employee.getClass();
            def employee2 = employee.clone();
            println employee2
            employee.each{ name,age ->
                println("name: $name - age: $age")
            }
            employee.eachWithIndex{ key,value,i ->
                println "$i | $key | $value"
            }
            employee.each{entry ->
                println("$entry.key: $entry.value") 
            }

            employee.clear();
            println employee;
        }

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
            def range2 =  range.subList(3,7);
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

    static void function11()
        {
            Scanner sc = new Scanner(System.in);
            String filepath = "c:/Users/223072287/tech/groovy-tutorial/";
            File file = new File(filepath,"write.txt");

            // Writing into a file using writer

            file.withWriter('utf-8'){ writer ->
                writer.writeLine "My name is Aman."
                writer.writeLine "Pursued my B.Tech in Electrical from NIT Raipur"
                writer.writeLine "Currently working at GE Healthcare as an Edison Engineer."
            }

            // We can also do the same using << sign as well

            file << """\nMy name is Aman.
            Pursued my B.Tech in Electrical from NIT Raipur
            Currently working at GE Healthcare as an Edison Engineer."""
            
            // We can also append lines to a file using  append function

            file.append("\nI was born in Raigarh on 1st March.");
            println "The file length is " + file.length(); // length returns the length of the file
            println file.text // prints the file on the console output
            println file.isFile(); // return true or false depending upon the file or directory we are trying to identify
            println file.isDirectory(); // return true or false depending upon the file or directory we are trying to identify
            println file.isHidden(); // returns true or false if the file is hidden or not.

            def newwrite =  new File("write2.txt")
            newwrite << file.text

            newwrite.renameTo("write2.txt");
        }

    static void main(String[] args)
        {
            
        }                

}