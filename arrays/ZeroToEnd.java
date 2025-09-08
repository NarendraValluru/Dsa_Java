import java.util.ArrayList;
public class ZeroToEnd {
    static int[] move(int[] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return arr;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,2,1,3,0,5,0,4,9};
        move(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}
// program to print the frequency of element in an array
