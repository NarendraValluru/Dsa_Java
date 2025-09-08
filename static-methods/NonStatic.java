public class NonStatic {
    String s;
    {
        s="Java";
        System.out.println(s);
        System.out.println("in non static block 1");
    }
    static{
            NonStatic ns=new NonStatic();
            ns.s="java & selenium";
            System.out.println(ns.s);
            System.out.println("in non static block 2");
    }
      public static void main(String[] args) {
        System.out.println("in main");
        // NonStatic ns1 =new NonStatic();
    }
}

class Student {
    static String sname;
    String name;
    int age;

    static{// static block
        sname="QSP";
        System.out.println(sname);
    }

    { // non static block
        name="raju";
        age=21;
    }
    public static void main(String[] args) {
        System.out.println("in main");
        Student s=new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println("-----------------------------");
        Student s2=new Student();
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
    }
// qsp main method raju 24
// def an emp class to init name of the company(static variable) 
// and parrticular emp details like name designation sal loc 
class Emp{
    static String companyName;
    String loc; String job;  int sal; String empName;
    static{
        companyName="TCS";
        System.out.println("Company Name: "+companyName);
    }
    {
        empName="ABC";
        job="Developer";
        sal=230000;
        loc="Bangalore";
    }
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        Emp e=new Emp();
        System.out.println("Emp Name: "+e.empName);
        System.out.println("Job: "+e.job);
        System.out.println("Salary: "+e.sal);
        System.out.println("Location: " +e.loc);
        System.out.println("------------------------------");
        Emp e1=new Emp();
        System.out.println("Emp Name: "+e1.empName);
        System.out.println("Job: "+e1.job);
        System.out.println("Salary: "+e1.sal);
        System.out.println("Location: " +e1.loc);
        System.out.println("---------------------------------");
    }


}




  
