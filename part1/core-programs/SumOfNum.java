import java.util.Scanner;
public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            sum+=i;
        }
        System.out.println("Sum of numbers:"+sum);
        sc.close();
    }
    
}
