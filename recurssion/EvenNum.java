// program to print even number
import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        even(s, e);
        sc.close();
    }
    public static void even(int s,int e){
        if(s<=e){
            if(s%2==0) System.out.print(s+" ");
            s++;
            even(s,e);  
        }
    }
}

