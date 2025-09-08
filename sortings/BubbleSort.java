import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {  // O(n^2) time complexity, O(1) space complexity
     public static int[] bubbleSort(int[] arr){  // find nth largest value in array repeat n no of times 
        int size = arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        for(int i: arr){
            list.add(i);
        }
        System.out.println(list);
    }
}
