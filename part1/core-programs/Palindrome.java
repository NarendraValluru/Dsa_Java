import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num, rev=0;
        while(num!=0){
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        System.out.println(rev==temp ? temp +" Palindrome" : rev+ " Not a palindrome");
        sc.close();
    }
}
