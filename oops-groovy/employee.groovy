import java.util.*;

public class Employee {
        public int ssoid
        public String empname
        private String dept
        private String manager
        
        def setempdetails()
            {
                Scanner sc = new Scanner(System.in);
                println("Enter SSO ");
                ssoid = sc.nextInt();
                println("Enter Employee name: ");
                empname = System.console().readLine();
                println("Enter Department: ");
                dept = System.console().readLine();                
                println("Enter Manager name: ");
                manager = System.console().readLine();
            }
        
        def getempdetails()
            {
                println "-----------------------"
                println "Employee SSOID: $ssoid"
                println "Employee Name: $empname"
                println "Employee Department: $dept"
                println "Employee Manager: $manager"
                println "-----------------------"
            }

        static void main(String[] args)
            {
                println "Enter no. of employee: "
                def n = System.console().readLine().toInteger();
                def emp = [];

                for(int i = 0; i < n; i++)
                    {   
                        Employee e = new Employee();
                        e.m.setempdetails();
                        e.setempdetails();
                        emp.add(e);
                    }

                for(int i = 0; i < n; i++)
                    {   
                        emp[i].m.getempdetails();
                    }
                
            }
    }