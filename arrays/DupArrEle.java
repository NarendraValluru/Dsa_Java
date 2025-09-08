import java.util.ArrayList;
public class DupArrEle {
    public static int[] copy(int[] arr){
        int[] temp=new int[arr.length];
        int k=0;
        for(int i:arr){
            temp[k++]=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        int[] arr={2,7,8,4,1,6};
        copy(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}

