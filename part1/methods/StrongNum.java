// program to check whether given num is a strong num or not 
//sum of factorial of digits in a given num is also a same number 
import java.util.Scanner;
public class StrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        System.out.println(temp==factOfNum(n)? "Strong num" : "Not a strong num");
        sc.close();
    }
    static int factOfNum(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        return sum;
    }
}
