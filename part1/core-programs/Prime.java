import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int cnt=0;
        int num=sc.nextInt();
        // for(int i=1;i<=num;i++){
        //     if(num%i==0) cnt++;
        // }
        boolean isprime=true;

        for(int i=2;i<num;i++){
            if(num%i==0){
                isprime=false;
                break;
            } 
        }
        System.out.println(isprime==true? "prime" : "not a prime");
        //System.out.println(cnt==2?"prime number" : "not a prime");
        sc.close();
    }
}
