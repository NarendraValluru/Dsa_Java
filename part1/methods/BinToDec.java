import java.util.Scanner;
public class BinToDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(binToDec(n));
        sc.close();
    }                
    static int binToDec(int n){
        int sum=0,pow=0;
        while(n!=0){
            int d=n%10;
            sum+=(d*power(pow++,2));
            n/=10;
        }
        return sum;
    }

    static int power(int pow,int base){
        int exp=1;
        for(int i=1;i<=pow;i++){
            exp*=base;
        }
        return exp;
    }
}

