public class EmpInfo {
    int id;
    String name;
    double sal;
    static String companyName="ITC";

    EmpInfo(int id,String name,double sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public void display(){
       System.out.println("emp id :"+this.id+ "\nemp name :"+this.name+ "\nemp sal: "+ this.sal +"\ncompany name :"+EmpInfo.companyName);
    }


    public static void main(String[] args) {
        EmpInfo e1=new EmpInfo(100, "ABC",53638);
        e1.display();
        System.out.println("=============================");
        EmpInfo e2=new EmpInfo(101, "BCS", 833873);
        e2.display();
        System.out.println("=============================");
        EmpInfo e3=new EmpInfo(103, "FYFUY", 83763);
        e3.display();
        System.out.println("=============================");
        EmpInfo e4=new EmpInfo(104, "BghgS", 873733);
        e4.display();
        System.out.println("=============================");
        EmpInfo e5=new EmpInfo(105, "HUKJK", 77383);
        e5.display();


    }
}
