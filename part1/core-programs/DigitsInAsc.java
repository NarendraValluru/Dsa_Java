import java.util.Scanner;
public class DigitsInAsc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String s="";
        for(int i=0;i<=9;i++){
            int temp=num;
            while (temp>0){
                int ld=temp%10;
                if(ld==i) s=s+i;
                temp=temp/10;
            }                                       
        }
        System.out.println(s);
        sc.close();
    }
}
