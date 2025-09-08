// to check wether twisted prime number or not
// if a nummber is a prime and reverse of a number is also a prime
import java.util.Scanner;
public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(twisted(n)==2  &&  twisted(reverse(n))==2 ? "Twisted prime" : "not a twisted prime");
        sc.close();
    }
    public static int reverse(int num){
        int rev=0;
        while (num!=0) {
            int rem=num%10;
            rev=(rev*10) + rem;
            num/=10;
        }
        return rev;
    }

   public static int twisted(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) 
            c++;
        }
        return c;
    }
}
