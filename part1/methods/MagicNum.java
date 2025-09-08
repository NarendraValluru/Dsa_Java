//program to check whether given number is a magic number or not
// sum of digits in a num is reccursivly cal as 1

import java.util.Scanner;
public class MagicNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>9){
            n=magic(n);
        }
        System.out.println(n==1? "Magic"  : "Not magic");
        sc.close();
    }
    public static int magic(int n){
        int sum=0;
        while (n!=0) {
            int dig=n%10;
            sum=sum+dig;
            n/=10;
        }
        return sum;
    }
}
