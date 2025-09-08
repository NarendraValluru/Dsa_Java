import java.util.*;
public class MergeSort {
    public static void mergeSort(int[] arr ,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);
    } 
    public static void merge(int[] arr,int low,int mid,int high){
        int[] list=new int[high-low+1];
        int left=low;
        int right=mid+1,k=0;
        while ((left<=mid) && (right <=high)) {
            if(arr[left]<=arr[right]){
                list[k++]=arr[left];
                left++;
            }
            else{
                list[k++]=arr[right];
                right++;
            }    
        }
        while (left<=mid) {
            list[k++]=arr[left];
            left++;
        }
        while(right<=high){
            list[k++]=arr[right];
            right++;
        }
        for(int i=0;i<list.length;i++){
            arr[i+low]=list[i];
        }
    }

    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,9,1};
        mergeSort(arr, 0, arr.length-1);
        List<Integer> list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}
