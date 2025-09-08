import java.util.Scanner;
public class NeonNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num==digit(square(num)) ? num+" neon num" : num+" not a neon number");
        sc.close();
    }   
    static int square(int n){
        return n*n;
    }
    static int digit(int n){
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
}

