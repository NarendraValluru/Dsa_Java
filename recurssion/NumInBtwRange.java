import java.util.Scanner;
public class NumInBtwRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        num(start,end);
        sc.close();
    }
    public static void num(int start,int end){
        if(start<=end){
            System.out.print(start+" ");
            start++;
            num(start,end);
        }
    }
}

