import java.util.*;
public class TwoSum {
    public static int[] twosum(int[] arr,int key){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int req=key-arr[i];
            if(map.containsKey(req)){
                return new int[] {map.get(req),i};
            }
            map.put(arr[i],i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] arr={4,1,2,3,1};
        int target=5;
        int[] res=twosum(arr,target);
        if(res.length>0) System.out.print(Arrays.toString(res));
        else System.out.print("not found");
    }
}
