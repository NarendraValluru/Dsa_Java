import java.util.*;
public class NonRepeat {
    public static int unique(int[] arr){
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int n:arr){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // for(int key:map.keySet()){
        //     if(map.get(key)==1) return key;
        // }
        int x=0;
        for(int i:arr){
            x^=i;
        }
        return x;
    }
    public static void main(String[] args){
        int[] arr={1,1,2,2,3,3,4,4,5};
        int num=unique(arr);
        if(num !=0)
        System.out.print(num);
        else System.out.print("No unique elements");

    }
}
