import java.util.ArrayList;
public class RightRotateD {
    static void rotateD(int[] arr,int d){
        // d=d%arr.length;
        int[] temp=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[arr.length-d+i];
        }
        for(int i=arr.length-d-1;i>=0;i--){
            arr[i+d]=arr[i];
        }
        for(int i=0;i<d;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={3,2,9,7,6,4,1};
        ArrayList<Integer> list=new ArrayList<>();
        rotateD(arr,2);
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}
