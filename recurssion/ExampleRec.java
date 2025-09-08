public class ExampleRec {
    public static void main(String[] args) {
        dance(1);
    }
    public static void dance(int a){
        if(a<=30){
            System.out.println("dance on the floor");
            a++;
            dance(a);
        }
    }
}

// program to print num in b/w the range