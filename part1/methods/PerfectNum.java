import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n==perfect(n) ? "perfect num" : "not a perfect number");
        sc.close();
    }
    static int perfect(int num){
        //sum of factors of given num and do not include same num as a factor
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0) sum+=i;
        }
        return sum;
    }
}

