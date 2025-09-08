import java.util.ArrayList;
public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
        for(int i: arr){
            list.add(i);
        }
        System.out.print(list);
    }
    public static int[] selectionSort(int[] arr){
        int size=arr.length;
        int temp=0,min=0;
        for(int i=0;i<size-1;i++){
            min=i;
            for(int j=i+1;j<size;j++){
                if(arr[min]> arr[j]) min=j;
            }
            temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}


