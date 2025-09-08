/*public class Employee {
    public static void companyDetails(){
        String company_name="Google";
        String loc="Bangalore";
        System.out.println("company name: "+company_name);
        System.out.println("company location: "+loc);
    }
    public void empDetails(){
        int id=43536;
        String empname="Jeevan Reddy";
        String dept="AIML";
        double sal=763636;
        System.out.println("emp id: "+id);
        System.out.println("emp name: "+empname);
        System.out.println("emp dept: "+ dept);
         System.out.println("emp sal: "+sal+" per annum");
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println("---------------------");
        System.out.println("Employee Details");
        System.out.println("--------------------");
        e.empDetails();
        System.out.println("---------------------");
        System.out.println("Company Details");
         System.out.println("---------------------");
        companyDetails();
    }
}*/

// public class Employee {
//     static String s1;
    
//     static{
//         System.err.println(s1);
//         s1="this is staic variable";
//         System.err.println(s1);
//         System.out.println("this is static block");
//     }
//     public static void main(String[] args) {
//         System.out.println("in main");
//     }

// }

// public class Employee {
//     static int a;
//     static{
//         a=1234;
//         System.out.println("in block1");
//     }
//     static double d=233.233;
//     static{
//         System.out.println(d);
//         System.out.println("in block2");
//     }
//     public static void main(String[] args) {
//         System.out.println("in main method");
//         System.out.println(a);
//         System.out.println(d);
//         System.out.println(s);
//         s="java";
//         System.out.println(s);

//     }
//     static String s="Helloo";
//     static{
//         System.out.println(s);
//         System.out.println("in block3");
//     }
// }

public class Employee{
    static int i;
    static{
        i=837;
        System.out.println("in block1");
    }

    static double d;
    static{
        d=3838;
        System.out.println("in block2");
    }
    public static void main(String[] args) {
        System.out.println(i);
        System.out.println(d);
        System.out.println(s1);

    }
    static String s1;
    static{
        s1="Java";
        System.out.println("in block3");
    }
}

