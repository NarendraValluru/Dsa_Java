public class Sample {
    int i=20;
    public void display(){
        System.out.println("in parent");
    }
}
class Child extends Sample{
    double d=20.8;
    public void wish(){
        System.out.println("in child");
        System.out.println(d);
        System.out.println("parent members");
        System.out.println(i);
        display();
    }
    public static void main(String[] args){
        Child c=new Child();
        c.wish();
    }

}   
