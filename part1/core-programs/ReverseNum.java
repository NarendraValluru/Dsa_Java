import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int last_digit=num;
        int temp=num;
        int rev=0;
        while(num>0){
            int dig=num%10;
            rev=(rev*10)+dig;
            num=num/10;
        }
        System.out.println("After reverse");
       // int base=1;
    //    int a=1;
       int second_first=0;
        System.out.println(rev); // reverse number
         for(int i=1;i<=2;i++){
           second_first= rev%10;
         }
        // System.out.println(rev%2==0? "even after palindrome" : "odd after palindrome"); //palindrome even or odd
        // for(int i=1;i<=2;i++){
        //    second_first= rev%10;
        // }
        // System.out.println("first 2nd :"+second_first);
        // int base= rev%10;
        // int last=last_digit%10;
        // System.out.println("First digit " +base); //first digit
        // System.out.println("Last digit "+last); // last digit
        // System.out.println(temp==rev ? "Palindrome" : "Not a Palindrome"); //palindrome
        // for(int i=1;i<=last;i++){
        //     a*=base;
        // }
        // System.out.println(a); // power 
        // while(num>99){
        //     num=num/99;
        // }
        // int sdf=num%10;
        // System.out.println(sdf);
        sc.close();
    }
}
