import java.util.Scanner;
public class Disarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(dia(n)==n ? "disarium" : "not a disarium");
        sc.close();
    }
    static int dia(int n){
        int sum=0;
        while (n!=0) {
            int dig=n%10;
            sum=sum+power(dig,count(n));
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


// program to print the nth largest digit in the given num