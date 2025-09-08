import java.util.ArrayList;

public class LeftRotate {
    static void rotate(int[] arr){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4,5};
        rotate(arr);
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}
