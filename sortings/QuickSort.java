// partition and pindex && pivot at starting in partitition

import java.util.ArrayList;
public class QuickSort {
    public static void quick(int[] arr,int low,int high){
        if(low<high){
            int pIndex=partition(arr,low,high);
            quick(arr, low, pIndex-1);
            quick(arr,pIndex+1,high);
        }
    }
    
    static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){  //  {12,56,38,94,45};
            while(arr[i]<=pivot && i<= high-1 ) i++;
            while(arr[j]>pivot && j>=low+1) j--;
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            // for(int n:arr){
            //     System.out.print(n+" ");
            // }
            // System.out.println();
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;

    }
    public static void main(String[] args) {
        int[] arr={12,56,38,94,45};
        quick(arr,0,arr.length-1);
        ArrayList<Integer>list=new ArrayList<>();
        for(int n:arr){
            list.add(n);
        }
        System.out.println(list);
    }
}

/*
    pivot=a[high]
    i=low-1
    for(j=low;j<high;j++){
        if(a[j]<pivot){
            i++
            temp=a[i]
            a[i]=a[j]
            a[i]=temp
        }
    }

 */
