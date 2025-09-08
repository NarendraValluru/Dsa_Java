//program to check whether happy num or not
import java.util.Scanner;
public class HappyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        System.out.println(isHappy(n) ?"happy " :"not happy");
        sc.close();
    }

    static boolean isHappy(int n){
        if(n==1) return true;
        else if(n==4) return false;
        else return isHappy(sum(n));
    }
    static int sum(int n){
        int sum=0;
        while(n!=0){
            int dig=n%10;
            sum=sum+(dig*dig);
            n/=10;
        }
        return sum;
    }
}
