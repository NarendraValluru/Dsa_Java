
import java.util.Scanner;
public class NthLargestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int nth=sc.nextInt();
        System.out.println(largest(num,nth));
        sc.close();
    }
    static int largest(int n,int nth){ 
        int slno=0,nthlarge=Integer.MAX_VALUE;
        while(true){
            int temp=n,large=0;
            while (temp!=0) {
                int dig=temp%10;
                if(dig>large && dig < nthlarge) large=dig;
                temp/=10;
            }
            nthlarge = large;
            slno++;
            if(slno==nth) break;
        }
        return nthlarge;
    }
}

