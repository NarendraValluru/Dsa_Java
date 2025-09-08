import java.util.Scanner;
public class SpyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(sumOfDigit(num) == productOfDigit(num) ? num+" Spy number" : num+" not a spy number");
        sc.close();
    }
    static int sumOfDigit(int n){
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }

    static int productOfDigit(int n){
         int mul=1;
        while (n!=0) {
            int rem=n%10;
            mul*=rem;
            n/=10;
        }
        return mul;
    }
}
