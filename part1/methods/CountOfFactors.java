import java.util.Scanner;
public class CountOfFactors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factors(num)==2? "prime" : "not a prime");
        sc.close();  
    }
    static int factors(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) c++;
        }
        return c;
    }
} 
