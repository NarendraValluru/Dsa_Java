// program to convert the decimal values into binary values int to binary 

import java.util.Scanner;

public class DecToBin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        toDec(n);
        sc.close();
    }
    static void toDec(int n){
        String bin="";
        while(n!=0){
            int rem=n%2;
            bin=rem+bin; 
            n/=2;
        }
        System.out.println(bin);
    }
}
