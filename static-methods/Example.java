public class Example {
    static int i=20, j=30;
    static double d=30.87;
    public static void display(){
	System.out.println("in display");
	System.out.println(i);
	System.out.println(j);
	System.out.println(d);
    }

    public static void one(){
	System.out.println("in one");
	i=30;
	j=598;
	d=1661;
    }
    public static void main(String[] args) {
	System.out.println("in main");
	display();
	one();
	System.out.println("after update");
	display();
        
    }	
}
