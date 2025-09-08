import java.util.ArrayList;
public class SecondLargest {
    public  ArrayList<Integer> secondLargest(int[] arr){
        int slargest=Integer.MIN_VALUE;
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){  //         int[] arr={7,9,3,5,2,8,4};
                slargest=largest; // 7  
                largest=arr[i]; // 9 
            } 
            else if((arr[i]<largest) && (arr[i] > slargest)){
                slargest=arr[i]; // 8
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(largest);
        res.add(slargest);
        return res;
    }
    public  ArrayList<Integer> secondSmallest(int[] arr){
        int small=arr[0];
        int ssmall=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){ // int[] arr={7,9,3,5,2,8,4};
                ssmall=small; // 9 7 3
                small=arr[i];  // 7 3 2
            }
            else if((arr[i]>small) && (arr[i]<ssmall)){ 
                ssmall=arr[i]; // 5
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        res.add(small);
        res.add(ssmall);
        return res;
    }
    public static void main(String[] args) {
        int[] arr={7,9,3,5,2,8,4};
        SecondLargest s1=new SecondLargest();
        System.out.println("largest and 2nd largest: "+s1.secondLargest(arr));
        System.out.println("smallest and 2nd smallest: "+s1.secondSmallest(arr));
    }
}
