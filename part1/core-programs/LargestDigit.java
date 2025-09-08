import java.util.Scanner; 
public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int max=0;
        while (num!=0) {
            int x=num%10; //last digit
            if(x>max) max=x; // max value
            num=num/10; //updation for digits
        }
        System.out.println(max);
        sc.close();
    }
}
