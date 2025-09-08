public class Ex{
    double d=23.32;
    public void display(){
        System.out.println("in ex3-2 ->> display");
    }
}

class Sample {
    public static void m1(){
        System.out.println("in m1");
        Ex e=new Ex();   
        System.out.println(e.d);
        e.display(); 
    }
    public static void main(String[] args) {
        m1();
    }

    
}

// design a class of emp with one static behaviour and one non static behaviour
//  access with the help of object (static behaviour static method name ,emp company name )  non static behaviour emp details 

