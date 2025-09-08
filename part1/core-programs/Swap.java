import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swapNum(a, b);
        swapWithTemp(a, b);
        sc.close();
    }
    static void swapNum(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a+" " +"b= "+ b);
        
    }
    static void swapWithTemp(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+" "+"b="+b);
    }
}
