import java.util.ArrayList;
public class Insertion {
    public static int[] insertion(int[] arr){  // O(n^2) 
        int size=arr.length;  // size of arr
        for(int i=1;i<size;i++){
            int key=arr[i];
            int j=i-1; 
            while(j>=0 && arr[j]>key ){  
                // int temp=arr[j-1];
                // arr[j-1]=arr[j];
                // arr[j]=temp;  
                arr[j+1]=arr[j];
                j--;
                // for(int k=0;k<arr.length;k++)
                //     System.out.print(arr[k]+" ");
                // System.out.println();   
            }
            arr[j+1]=key;
        }
        return arr; 
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,23,100,0,12};
        ArrayList<Integer> list=new ArrayList<>();
        insertion(arr);
        for(int i: arr){
            list.add(i);
        }
        System.out.print(list);
    }
}
