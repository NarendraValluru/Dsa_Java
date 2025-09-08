public class NS11 {
    static int i=20;
    static void display(){
        System.out.println("in display");
    }
}

class Sample{
    public void show(){
        System.out.println("in show");
        NS11 ns=new NS11();
        ns.display();
        System.out.println(ns.i);

    }
    public static void main(String[] args) {
        Sample s=new Sample();
        s.show();
    }
}
