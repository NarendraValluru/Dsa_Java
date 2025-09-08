//package  methods;
import java.util.Scanner;
public class HarshadNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n%sumOfDigit(n)==0? "Harshad number" :" Not a harshad num" );
        sc.close();
    }
    static int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;        
    }
}


