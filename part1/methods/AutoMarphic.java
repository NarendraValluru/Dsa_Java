import java.util.Scanner;
public class AutoMarphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=square(countDig(n));
        int square=n*n;
        System.out.println(square%x == n ? "automorphic" : "not automorphic"); //or 
        System.out.println(isAutomarphic(n) ? "automorphic" : "not automorphic");
        sc.close();
    }
    static int countDig(int n){
      int c=0;
      while (n!=0) {
        n=n/10;
        c++;
      }
      return c;
    }
    static  int square(int pow){
        int expo=1;
        for(int i=1;i<=pow;i++){
            expo=expo*10;
        }
        return expo;
    }

    static boolean isAutomarphic(int num){
        int sq=num*num;
        while (num!=0) {
            int numld=num%10;
            int sqld=sq%10;
            if(numld!=sqld) return false;
            num/=10;
            sq/=10;
        }
        return true;
    }
}
