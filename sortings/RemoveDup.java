import java.util.*;
public class RemoveDup {
    public static ArrayList<Integer> removeDup(int[] arr){
       int i=0;
       ArrayList<Integer> list=new ArrayList<>();
       for(int j=1;j<arr.length;j++){
        if(arr[j]!=arr[i]){
            arr[i+1]=arr[j];
            i++;  
        }
       }

       for(int j=0;j<=i;j++){
        list.add(arr[j]);
       }

       return list;
    }
    public static void main(String[] args){
        int[] arr={1,1,1,2,2,3,3,3,5,4};
        Arrays.sort(arr);
        System.out.println(removeDup(arr));
    }
}
