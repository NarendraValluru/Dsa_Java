public class Ex3 {
    double d=23.4;
    public void display(){
        System.out.println("in display");
    }
    public static void wish(){
        Ex3 e=new Ex3();
        System.out.println("in wish");
        System.out.println(e.d);
        e.display();
    }
    public static void main(String[] args) {
        wish();
    }
}
