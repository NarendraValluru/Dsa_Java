import java.util.Scanner;
public class NthPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth=sc.nextInt();
        int cnt=0,num=1;
       while (num!=0) {
            int temp=num,rev=0;
            while(temp!=0){
                int rem=temp%10;
                rev=(rev*10)+rem;
                temp/=10;
            }
            if(rev==num) cnt++;
            if(cnt==nth) break; 
            num++;
        }
        System.out.println(nth +" value is: "+num);
        sc.close();
    }
}
