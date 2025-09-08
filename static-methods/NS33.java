public class NS33 {
    double d=20;
    public void display(){
        System.out.println("in display");
    }
}

class Test{
     public void show(){
        System.out.println("in show");
        NS33 ns=new NS33();
        System.out.println(ns.d);
        ns.display();
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.show();
    }
}
