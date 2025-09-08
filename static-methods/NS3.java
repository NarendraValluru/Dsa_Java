public class NS3 {
    double d=20;
    public void display(){
        System.out.println("in display");
    }
    public void show(){
        System.out.println("in show");
        System.out.println(d);
        display();
    }
    public static void main(String[] args) {
        NS3 ns=new NS3();
        ns.show();
    }
}
