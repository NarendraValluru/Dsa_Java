import java.util.Scanner;
public class StrongNumInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            if(i==factOfNum(i)){
                System.out.println(i);
            }
        }
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
