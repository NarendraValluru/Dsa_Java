import java.util.Scanner;
public class PalindromeInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=1;i<=range;i++){
            int temp=i;
            int rev=0;
            while(temp!=0){
                int dig=temp%10;
                rev=(rev*10) + dig;
                temp/=10;
            }
            System.out.print(i==rev? rev+" " : "");
        }
        sc.close();
    }
}
