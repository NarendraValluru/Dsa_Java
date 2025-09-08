import java.util.Scanner;
class TechNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(count(n)%2==0) System.out.println(n==tech(n) ? "tech" : "not tech");
        else System.out.println("not a tech");
        sc.close();
    }
    static int power(int base,int p){
        int exp=1;
        for(int i=1;i<=p;i++){
            exp=exp*base;
        }
        return exp;
    }
    static int tech(int n){
        int half=count(n)/2;
        // int first_half=n%power(10, half);
        // int seconf_half=n/power(10,half);
        return ((n%power(10, half))+(n/power(10,half)))*((n%power(10, half)+n/power(10,half)));
    }
    static int count(int n){
        int c=0;
        while (n!=0) {
            int dig=n%10;
            c++;
            n/=10;
        }
        return c;
    }

}
