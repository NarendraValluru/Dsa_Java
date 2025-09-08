//  happy num or not
// sum of squares of digit in a given is recursively is 1
import java.util.Scanner;
public class HappyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9){
            n=sumOfDigit(n);
        }
        System.out.println(n==1? "Happy" : "not a happy");
        sc.close();
    }
    static int sumOfDigit(int n){
        int sum=0;
        while(n!=0){
            int dig=n%10;
            sum=sum+power(dig,2);
            n/=10;
        }
        return sum;

    }
    static int power(int base,int pow){
        int exp=1;
        for(int i=1;i<=pow;i++){
            exp*=base;
        }
        return exp;
    }
}
