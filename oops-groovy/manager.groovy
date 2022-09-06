import java.util.*;

public class Mgr {
        private int ssoid
        public String mgrname
        private String dept
        public String manager
        
        def setempdetails()
            {
                Scanner sc = new Scanner(System.in);
                println("Enter SSO ");
                ssoid = sc.nextInt();
                println("Enter Employee name: ");
                mgrname = System.console().readLine();
                println("Enter Department: ");
                dept = System.console().readLine();                
                println("Enter Manager name: ");
                manager = System.console().readLine();
            }
        
        def getempdetails()
            {
                println "-----------------------"
                println "Employee SSOID: $ssoid"
                println "Employee Name: $mgrname"
                println "Employee Department: $dept"
                println "Employee Manager: $manager"
                println "-----------------------"
            }

        static void main(String[] args)
            {
                println "Enter no. of Managers: "
                def n = System.console().readLine().toInteger();
                def emp = [];

                for(int i = 0; i < n; i++)
                    {   
                        Mgr e = new Mgr();
                        e.setempdetails();
                        emp.add(e);
                    }

                for(int i = 0; i < n; i++)
                    {   
                        emp[i].getempdetails();
                    }
                
            }
    }