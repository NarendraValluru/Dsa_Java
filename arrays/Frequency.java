import java.util.*;
public class Frequency {
    static void count(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==null) continue;
            else System.out.println(i+" repeated "+map.get(i) + " times" );
        }
    }
    static void freq(int[] arr){
        int[] list=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int c=1;
             for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                    list[j]=-1;
                }
            }
            if(list[i]!=-1) list[i]=c;
        }
        for(int i=0;i<arr.length;i++){
            if(list[i]==-1){
        
            }
            else
            System.out.println(arr[i]+" repeated "+ list[i]+" times");
        }
        // return list;
    }

    public static void main(String[] args){
        int[] arr={2,1,2,3,1,5,6,6};
        count(arr);
        System.out.println("==============================");
        freq(arr);
        //System.out.println(freq(arr));

    }
}
