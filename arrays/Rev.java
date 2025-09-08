import java.util.ArrayList;
import java.util.Scanner;

public class Rev {
    public static int[] rev(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        System.out.println(list);
        sc.close();
    }
}
