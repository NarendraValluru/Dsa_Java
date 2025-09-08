public class Example2 {
    static int i=20,j=30;
    public static void method1(){
        System.out.println("in method 1");
        System.out.println(i+" "+j);
    }
    public static void main(String[] args) {
        System.out.println("in main");
        method1();
        InnerExample2.method2();
        InnerExample3.method3();
       /* System.out.println("after update");
        method1();
        InnerExample2.method2();
        InnerExample3.method3(); */

    }
    
}

public class InnerExample2 {
    static double d=2.8;
    public static void method2(){
        System.out.println("in method 2");
        System.out.println(d);
    }
    
}

public class InnerExample3 {
    static String s="Hello";
    public static void method3(){
        System.out.println("in method 3");
        System.out.println(s);
    }
    
}

//create 3 class and all the 3 class declare one static var and static method respectively 
// perform a re-assign for the var which is present in 2nd class and invoke all the members inside the main method 
