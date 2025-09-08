import java.util.ArrayList;
import java.util.Scanner;
public class LeftRotateD {
    public static void rotateD(int[] arr, int d){
        d=d%arr.length;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=d;i<arr.length;i++){
            arr[i-d]=arr[i];
        }
        for(int i=arr.length-d;i<arr.length;i++){
           arr[i]=temp[i-(arr.length-d)]; // or k++
        }
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,9,8,7,6,74,43};
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        rotateD(arr,d);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:arr){
            list.add(i);
        }
        System.out.println(list);
        sc.close();
    }
}
