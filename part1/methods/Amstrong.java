// program to check whether given num is a amsstrong num or not
// sum of exp of digits rise to the power of count of digits is also a same number
// ex: 153 cube(1+5+3)==153

import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(amst(n)==n? "Amstrong" : "not a amstrong");
        sc.close();
    }    

    static int amst(int n){
        int sum=0,pow=count(n);
        while (n!=0) {
            int dig=n%10;
            sum=sum+power(dig,pow);
            n/=10;
        }
        return sum;
    }
    static int power(int base,int pow){
        int exp=1;
        for(int i=1;i<=pow;i++){
            exp=exp*base;
        }
        return exp;
    }
    static int count(int n){
        int c=0;
        while(n!=0){
            int d=n%10;
            c++;
            n/=10;
        }
        return c;
    }
}


