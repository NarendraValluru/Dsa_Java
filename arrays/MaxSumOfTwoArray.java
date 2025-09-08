import java.util.*;
public class MaxSumOfTwoArray {
    static int maxSum(int[] a,int[] b){
        int[] list=new int[2];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                int sum=a[i]+b[j];
                if(max<sum){
                    max=sum;
                } 
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=5;
        int[] a=new int[size];
        int[] b=new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            b[i]=sc.nextInt();
        }
        System.out.print(maxSum(a,b));
    }
}

// program to find the max diff btw two elements
