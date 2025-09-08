import java.util.ArrayList;

public class RightRotate {
    static void rotate(int[] arr){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){  
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,7,5,3,9,1,4};
        ArrayList<Integer> list=new ArrayList<>();
        rotate(arr);
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}
