 //program to print the sum of digits in agiven number is even or odd

import java.util.Scanner;
public class Demo11 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            int dig=num%10;
            sum+=dig;
            num/=10;
        }
        System.out.println(sum%2==0? sum+ " Even": sum+" Odd" );
        sc.close();
    }
}
