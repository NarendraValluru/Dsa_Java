//program to count unit bits in binary code

import java.util.Scanner;
public class UnitBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(unitBits(n));
        sc.close();
    }
    static int unitBits(int n){
        int count=0;
        while(n!=0){
            int dig=n%10;
            if(dig==1) count++;
            n/=10;
        }
        return count;
    }    
}
