import java.util.*;
public class Majority {
   public static int majority(int[] arr){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
        if(map.get(i)>arr.length/2){
            return i;
        }
    }
    return -1;
   }
   public static void main(String[] args){
    int[] arr={2,2,1,3,3,2,2};
    int res= majority(arr);
    System.out.print( res!=-1 ? res: "not found" );

   } 
}
