public class NS1 {

    static int i=20;
    static void display(){
        System.out.println("in display");
    }
    public void show(){
        System.out.println("in show");
        System.out.println( NS1.i);
        NS1.display();
    }
    public static void main(String[] args) {
        NS1 ns=new NS1();
        ns.show();
    }
}
