// if sum of extreme digits in a num = sum of mean digits in a num --> xylom
// opp to xylom --> floym 
import java.util.Scanner;
public class Xylom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isxylom(n) ? "Xylom" : "floym");
        sc.close();
    }
    static boolean isxylom(int n){
       int ld=n%10; // last digit
       n/=10;  // delete last digit
       int sum=0;
       while (n>9){  // until first num
            int dig=n%10;
            sum+=dig;
            n/=10;
       }
       int fd=n; //first digit
       if(sum==ld+fd){
        return true;
       }
       return false;
    }
}

