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
    static void module02()
        {
            assert 2 + 1 == 3;
            assert 4 - 3 == 1;
            assert 5 - 3 == 9; // An assertion error will be raised in this line.
            assert 2 % 2 == 0;
        }
    static void main(String[] args)
        {
            module02();
        }
}