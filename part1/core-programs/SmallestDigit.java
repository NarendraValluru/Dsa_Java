import java.util.Scanner;
public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=9;
        int num=sc.nextInt();
        while(num!=0){
            int small=num%10;
            if(small<s) s=small;
            num=num/10;
        }
        System.out.println(s);
        sc.close();
    }
}
