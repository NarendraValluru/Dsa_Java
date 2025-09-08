//non fibonacci series
import java.util.Scanner;
public class NonFibSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nonfib(n);
        sc.close();     
    }
    static void nonfib(int n){
        int a=0, b=1, c=1;
        for(int i=1; i<=n; i++){
            if(i==c){
                a = b;
                b = c;
                c = a + b;
            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}

//program to check whether given num is a xylom or floym num 