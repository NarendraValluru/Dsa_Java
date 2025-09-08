import java.util.*;
public class LongestK {
    public static int sub(int[] arr,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0; int maxLen=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        int[] arr={1,1,3,1,1,1,3,4};
        System.out.print(sub(arr,4));

    }
}
